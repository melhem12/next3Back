package net.claims.express.next2.controllers;

import net.claims.express.next2.entities.CoreCompanyProfile;
import net.claims.express.next2.entities.CoreProfile;
import net.claims.express.next2.entities.CoreRole;
import net.claims.express.next2.entities.CoreUser;
import net.claims.express.next2.http.StatusCode;
import net.claims.express.next2.http.response.ApiResponse;
import net.claims.express.next2.security.model.SecurityUser;
import net.claims.express.next2.security.services.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
//@CrossOrigin(origins = "*")

@RequestMapping("api/basicAuth")
public class ValidateUserController {
    @Autowired
    JWTService jwtService;

    @RequestMapping("validate")
    public  Map<String, String> userIsValid(HttpServletResponse response) {
        System.out.println("@Validate controller....");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("@ValidateUserController(/validate endpoint) => coming user::"   + auth.getPrincipal());
        SecurityUser currentUser = (SecurityUser)auth.getPrincipal();
        String name = currentUser.getUsername();
        System.out.println("@ValidateUserController(/validate endpoint) =>: username ==> " + name);

        //needed if we want to specify authority names in the token
        List<String> loginUserAuthoritiesNames = new ArrayList<>();

        for (GrantedAuthority authority: currentUser.getAuthorities()) {
            loginUserAuthoritiesNames.add(authority.getAuthority());
        }

        //getting corecompany profiles:
        CoreUser coreUser = currentUser.getCoreUser();
        System.out.println("@ValidateUserController(/validate endpoint) => listing my profiles:");
        List<CoreCompanyProfile> myCompanyProfiles = coreUser.getProfiles();

        //preparing EMPTY array list to hold profiles that I can use within my company
        List<CoreProfile> myProfiles = new ArrayList<>();

        //needed if we want to specify  names of profiles a user enrolled in to be in the token
//        List<String> enrolledProfilesNames = new ArrayList<>();

        for(CoreCompanyProfile companyProfile: myCompanyProfiles) {
            System.out.println("@ValidateUserController(/validate endpoint) => @PROFILE => " + companyProfile.getId());

            CoreProfile coreProfile = companyProfile.getCoreProfile();

            //now inject roles for this user for this core profile:
            Set<CoreRole> roles_per_profile =  currentUser.getUserRolesPerProfile().get(coreUser.getCompany_id() + "." +  coreProfile.getId());
            coreProfile.setRoles(roles_per_profile);
            myProfiles.add(coreProfile);
        }

        System.out.println("@ValidateUserController(/validate endpoint) => FINAL TESTING###");
        System.out.println("@ValidateUserController(/validate endpoint) ==>  for each company profile, list roles that user: " + coreUser.getId() + " has:");
        //TESTING DATA:::
       /*for (CoreProfile p: myProfiles) {
            System.out.println("PROFILE: " +p.getDescription() + ", user:  " + coreUser.getId() + " has the following roles:");
            System.out.println("----------");
            for (CoreRole r: p.getProfileRoles()) {
                System.out.println("     ROLE: " + r.getDescription());
            }
        }
        System.out.println("done final testing...");
        System.out.println("authoriteis for user: " + name);
        for(String authority : loginUserAuthoritiesNames) {
            System.out.println("authority: " + authority);
        }*/

        //generate token using configured jwtToken Service:
        String token = this.jwtService.generateToken(name, loginUserAuthoritiesNames);
        System.out.println("@ValidateUserController(/validate endpoint) => TOKEN VALUE:::" + token);
        //cookie:
        Cookie cookie = new Cookie("token", token);
        cookie.setPath("/next2");
        cookie.setHttpOnly(true); //doing that => WE CANNOT REFERENCE THIS COOKIE IN JAVASCRIPT(IMPORTANT IN SECURITY)
        cookie.setMaxAge(1800);
        //TODO: When in production  must do cookie.setSecure(true)
        //TODO:  cookie.setSecure(true); //=>this cookie should only be sent over SSL(when we deploy our app)
        response.addCookie(cookie);
        //end cookie
        Map<String, String> results = new HashMap<>();
        results.put("results", "ok");

//        return myProfiles;
        return results;
        //     return "{\"result\": \"ok\", \"name\": \"ok\"}";
        //1    Map<String, Object> afterLogin_data = new HashMap<>();
//    1    afterLogin_data.put("token", token);
//        afterLogin_data.put("profiles", myProfiles);
        //1     return new  ApiResponse(StatusCode.OK.getCode(), "success", "login data", afterLogin_data);
    }

    @RequestMapping("ok")
    public String testingEndpoint() {
        return "testing okay (y)";
    }

    @GetMapping("/logout")
    public String logOut(HttpServletResponse resp) {
        Cookie cookie = new Cookie("token", null);
        cookie.setPath("/next2");
        cookie.setHttpOnly(true); //doing that => WE CANNOT REFERENCE THIS COOKIE IN JAVASCRIPT(IMPORTANT IN SECURITY)
        cookie.setMaxAge(0);
        //TODO: When in production  must do cookie.setSecure(true)
//		cookie.setSecure(true); //=>this cookie should only be sent over SSL(when we deploy our app)
        resp.addCookie(cookie);
        SecurityContextHolder.getContext().setAuthentication(null);//not any authenticated user
        return "";
    }

}
