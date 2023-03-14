package net.claims.express.next2.services;

import net.claims.express.next2.entities.CarsNotification;
import net.claims.express.next2.entities.CarsPolicyCar;
import net.claims.express.next2.http.StatusCode;
import net.claims.express.next2.http.response.ApiResponse;
import net.claims.express.next2.http.response.PolicySearchResponse;
import net.claims.express.next2.repositories.DB;
import net.claims.express.next2.security.services.responses.NotificationSearchResponse;
import net.claims.express.next2.views.ClaimStatusLovVw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class CallCenterService  {
    @Autowired
    DB db;
public ApiResponse getNotificationSearch(String type ,String value ,String company, String admin) {
    ApiResponse apiResponse = new ApiResponse();

    if (type.equalsIgnoreCase("PLATE")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByPlate(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    } else if (type.equalsIgnoreCase("PHONE")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByPHone(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }

    else if (type.equalsIgnoreCase("SIMPLATE")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryBySimPlate(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }


    else if (type.equalsIgnoreCase("NAME")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByName(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }


    else if (type.equalsIgnoreCase("CLAIM_NUM")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByClaimNum(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }

    else if (type.equalsIgnoreCase("NEWEST_TOWN")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByNewestTow(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }
    else if (type.equalsIgnoreCase("NOTIFICATION")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByNotification(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }
    else if (type.equalsIgnoreCase("POLICY_NUMBER")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByPolicyNumber(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }
    else if (type.equalsIgnoreCase("NEWEST_ACCIDENT")) {
        List<NotificationSearchResponse> notificationSearchResponseList = db.carsNotificationRepository.getNotificationSearchQueryByNewestAccident(value, company, admin);
        apiResponse.setData(notificationSearchResponseList);
        apiResponse.setStatusCode(StatusCode.OK.getCode());
        return apiResponse;
    }




    else{
        apiResponse.setStatusCode(StatusCode.FAILED.getCode());
        apiResponse.setTitle("INVALID INPUT");
        apiResponse.setMessage("INVALID INPUT");
        return apiResponse;


    }

}







    public ApiResponse getPolicySearch(String iSearchBy, String iSearchValue, String iPolicyType, Date iAsOfDate,
                                             String iInsurance, String productType)  {
    if(productType.isEmpty()){
        productType="ALL";
    }
    ApiResponse apiResponse = new ApiResponse();
    List<PolicySearchResponse> policySearchResponseList;
        if (iSearchBy.isEmpty()) {
            apiResponse.setStatusCode(StatusCode.FAILED.getCode());
            return apiResponse;
        }
        if (iSearchBy.equals("PolicyNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByPolicyNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);
        } else if (iSearchBy.equals("SimilarPolicyNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewBySimilarPolicyNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);

        } else if (iSearchBy.equals("PlateNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByPlateNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);

        } else if (iSearchBy.equals("SimilarPlate")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewBySimilarPlate(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);

        } else if (iSearchBy.equals("ExactPlateNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByExactPlateNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);

        } else if (iSearchBy.equals("Name")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByName(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);
        } else if (iSearchBy.equals("ChassisNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByChassisNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);
        } else if (iSearchBy.equals("PhoneNumber")) {
            policySearchResponseList= db.carsNotificationRepository.getVehicleViewByPhoneNumber(iInsurance,iPolicyType,iAsOfDate,productType,iSearchValue);
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);

        } else {
            policySearchResponseList= db.carsNotificationRepository.getVehicleView();
            apiResponse.setMessage("success");
            apiResponse.setStatusCode(StatusCode.OK.getCode());
            apiResponse.setData(policySearchResponseList);
        }

        return apiResponse;
    }






//
//    @Transactional(rollbackFor = Exception.class)
//    public CarsNotification addPolicyNotification(CarsNotification notification, String policyCarId, String insurance,
//                                                  String userCompany) throws Exception {
//        String iinsurance = insurance;
//        if (policyCarId != null) {
//            if (!("".equals(policyCarId))) {
//                CarsPolicyCar carsPolicyCar = em.find(PolicyCar.class, policyCarId);
//                notification.assignPolicyCar(carsPolicyCar);
//                iinsurance = carsPolicyCar.getPolicy().getInsurance().getInsuranceId();
//            }
//        }
//
//        //TODO fill brand
//        //CarBrand carBrand = em.find(CarBrand.class , policyCar.getCarBrandCode());
//        //notification.getLossTowing().getLossCarInsured().setCarCarBrand( carBrand);
//   //     String user = sessionContext.getCallerPrincipal().getName().toUpperCase();
//
//
//        String iserietype = "NOTSERIE";
//        String iseriedesc = "Claim notification number";
//        //        PdGetSerial pdGetSerial = getPdGetSerial(iinsurance, iserietype, iseriedesc);
//        PdGetSerial pdGetSerial = getPdGetSerial(userCompany, iserietype, iseriedesc);
//        notification.setNotificationVisa(pdGetSerial.getOnextserial());
//        notification.getNotificationActivityList().add(new NotificationActivity(notification, "50", user));
//        Insurance company = em.find(Insurance.class, iinsurance);
//        notification.setInsurance(company);
//        ClaimStatusLovVw claimStatusLovVw = new ClaimStatusLovVw();
//        claimStatusLovVw.setCode("0");
//        notification.setClaimStatusLovVw(claimStatusLovVw);
//        notification.setNotificationStatusDate(new Date());
//        notification.setSysCreatedBy(user);
//        notification.setSysUpdatedBy(user);
//        notification.setSysUpdatedDate(new Date());
//        notification.setSysCreatedDate(new Date());
//        if (!StringUtils.isEmpty(notification.getNotificationReportedDate()) &&
//                !StringUtils.isEmpty(notification.getLossTowing().getLossTowLossDate())) {
//            if (notification.getLossTowing().getLossTowLossDate().compareTo(notification.getNotificationReportedDate()) >
//                    0) {
//                notification.getLossTowing().setLossTowLossDate(notification.getNotificationReportedDate());
//            }
//        }
//        notification.getLossTowing().setSysCreatedBy(user);
//        notification.getLossTowing().setSysUpdatedBy(user);
//        notification.getLossTowing().setSysCreatedDate(new Date());
//        notification.getLossTowing().setSysUpdatedDate(new Date());
//        notification.getLossTowing().getLossCarInsured().setSysCreatedBy(user);
//        notification.getLossTowing().getLossCarInsured().setSysUpdatedBy(user);
//        notification.getLossTowing().getLossCarInsured().setSysCreatedDate(new Date());
//        notification.getLossTowing().getLossCarInsured().setSysUpdatedDate(new Date());
//        if ("5".equalsIgnoreCase(notification.getNotificationMatDamageId())) {
//            notification.getLossTowing().setDistributionTowNatureId("1");
//        }
//        if ("10".equalsIgnoreCase(notification.getNotificationMatDamageId())) {
//            notification.getLossTowing().setDistributionTowNatureId("7");
//        }
//        if (!StringUtils.isEmpty(notification.getPolicyCar()) &&
//                !StringUtils.isEmpty(notification.getPolicyCar().getPolicy())) {
//            Integer ded = notification.getPolicyCar().getPolicy().getPolicyDeductibleAmt();
//            if (StringUtils.isEmpty(ded)) {
//                ded = 0;
//            }
//            BigDecimal deductibe = new BigDecimal(ded);
//
//            notification.getLossTowing().getLossCarInsured().setCarDeductible(deductibe);
//
//
//            notification.getLossTowing().getLossCarInsured().setCarDealerRepair(notification.getPolicyCar().getPolicy().getPolicyAgencyRepair());
//            if ("YES".equalsIgnoreCase(notification.getPolicyCar().getPolicy().getPolicyReplacementFlag()) ||
//                    "Y".equalsIgnoreCase(notification.getPolicyCar().getPolicy().getPolicyReplacementFlag())) {
//                notification.getLossTowing().getLossCarInsured().setCarReplacement("Y");
//            } else {
//                notification.getLossTowing().getLossCarInsured().setCarReplacement("N");
//            }
//
//        }
//        LossResp lossResp = new LossResp();
//        lossResp.setRespStatusOther(BigDecimal.ZERO);
//        lossResp.setRespStatusOtherId(notification.getLossTowing().getLossCarInsured().getCarId());
//        lossResp.setRespStatusReportedDate(new Date());
//        lossResp.setContextCurrentUser(sessionContext.getCallerPrincipal().getName().toUpperCase());
//        notification.getLossTowing().getLossCarInsured().addLossResp(lossResp);
//
//        em.persist(notification);
//        return notification;
//    }








}
