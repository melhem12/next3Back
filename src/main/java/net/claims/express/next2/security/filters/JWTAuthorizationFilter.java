package net.claims.express.next2.security.filters;

import net.claims.express.next2.security.model.CustomTokenAuthentication;
import net.claims.express.next2.security.services.CustomAuthManager;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    private CustomAuthManager authenticationManager;
    private static  int i = 0;

    public JWTAuthorizationFilter(AuthenticationManager authManager) {
        super(authManager);
        this.authenticationManager = (CustomAuthManager)authManager;
    }

    //    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String url = String.valueOf(request.getRequestURL());
        System.out.println("@JWTAuthorizationFilter => @doFilterInternal()===> request url " + url);
        Cookie[] cookies = request.getCookies();
        System.out.println("@JWTAuthorizationFilter => @doFilterInternal()");
        if(cookies == null || cookies.length == 0) {
            i = i + 1;
            System.out.println("@JWTAuthorizationFilter => @doFilterInternal() IIIIIIIIIII is: " + i);
            System.out.println("@JWTAuthorizationFilter => @doFilterInternal() => CONTINUE REQUEST:no cookie in the request=> continue chain)----------------");
            chain.doFilter(request, response);
            return;
        }

        Cookie jwt_cookie = null;
        for(Cookie c: cookies) {
            if(c != null && c.getName() == "token") {
                jwt_cookie = c;
                break;
            }
        }

        if(jwt_cookie == null) {
            System.out.println("@JWTAuthorizationFilter => @doFilterInternal() => cookie value is null== jwtAuthorizationFilter");
            chain.doFilter(request, response);
            return;
        }

        //the next step is to get an object of type UsernamePasswordAuthenticationToken
        //and that what we will use to store information about our user
        //{we want to store username + his roles in this authentication token}
        //after that we will put this authentication object in the SecurityContextHolder
        var authObject = new CustomTokenAuthentication(false, jwt_cookie.getValue(), null, null);
        var authenticationResult = this.authenticationManager.authenticate(authObject);
        if(authenticationResult.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(authenticationResult);
            //carry on doing the processing...
            //lastly what we want to do is to propagate to the next filter in the filter chain
            chain.doFilter(request, response);//ONLY WHEN  THE AUTHENTICATION WORKS
        }

    }


}
