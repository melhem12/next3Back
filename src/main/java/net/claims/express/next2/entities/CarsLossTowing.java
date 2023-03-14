package net.claims.express.next2.entities;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "CARS_LOSS_TOWING")

public class CarsLossTowing extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "LOSS_TOW_VISA")
	private Integer lossTowVisa;
	
	
	@Column(name = "LOSS_TOW_STATE")
	private String lossTowState;
	
	
	@Column(name = "LOSS_TOW_INSURANCE")
	private Integer lossTowInsurance;
	
	
	@Column(name = "LOSS_TOW_BRANCH")
	private Integer lossTowBranch;
	
	
	@Column(name = "LOSS_TOW_LOB")
	private String lossTowLob;
	
	
	@Column(name = "LOSS_TOW_CLAIM_NUMBER")
	private Integer lossTowClaimNumber;
	
	
	@Column(name = "LOSS_TOW_POLICY_NUMBER")
	private Integer lossTowPolicyNumber;
	
	
	@Column(name = "LOSS_TOW_CAR")
	private Integer lossTowCar;
	
	
	@Column(name = "LOSS_TOW_AMENDMENT")
	private Integer lossTowAmendment;
	
	
	@Column(name = "LOSS_TOW_OBJECT_NUMBER")
	private Integer lossTowObjectNumber;
	
	
	@Column(name = "LOSS_TOW_PRODUCT")
	private String lossTowProduct;
	
	
	@Column(name = "LOSS_TOW_PRODUCT_DATEJ")
	private Integer lossTowProductDatej;
	
	
	@Column(name = "LOSS_TOW_CLIENT")
	private Integer lossTowClient;
	
	
	@Column(name = "LOSS_TOW_CLIENTCODE")
	private Integer lossTowClientcode;
	
	
	@Column(name = "LOSS_TOW_INSURED_1")
	private Integer lossTowInsured1;
	
	
	@Column(name = "LOSS_TOW_INSURED_2")
	private Integer lossTowInsured2;
	
	
	@Column(name = "LOSS_TOW_BROKER_NUM")
	private Integer lossTowBrokerNum;
	
	
	@Column(name = "LOSS_TOW_LOSS_DATEJ")
	private Integer lossTowLossDatej;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LOSS_TIME")
	private java.util.Date lossTowLossTime;
	
	
	@Column(name = "LOSS_TOW_INPUT_DATEJ")
	private Integer lossTowInputDatej;
	
	
	@Column(name = "LOSS_TOW_REPORTED_DATE")
	private Integer lossTowReportedDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_REPORTED_TIME")
	private java.util.Date lossTowReportedTime;
	
	
	@Column(name = "LOSS_TOW_REPORTED_BY")
	private String lossTowReportedBy;
	
	
	@Column(name = "LOSS_TOW_CONTACT_PERS_MAIDEN")
	private String lossTowContactPersMaiden;
	
	
	@Column(name = "LOSS_TOW_CONTACT_PERS_FAMILY")
	private String lossTowContactPersFamily;
	
	
	@Column(name = "LOSS_TOW_CONTACT_PERS_NAME")
	private String lossTowContactPersName;
	
	
	@Column(name = "LOSS_TOW_CONTACT_PERS_FATHER")
	private String lossTowContactPersFather;
	
	
	@Column(name = "LOSS_TOW_CONTACT_PERS_PHONE")
	private String lossTowContactPersPhone;
	
	
	@Column(name = "LOSS_TOW_LOSS_BUILDING")
	private String lossTowLossBuilding;
	
	
	@Column(name = "LOSS_TOW_LOSS_STREET")
	private String lossTowLossStreet;
	
	
	@Column(name = "LOSS_TOW_LOSS_STATE")
	private String lossTowLossState;
	
	
	@Column(name = "LOSS_TOW_LOSS_REGION")
	private String lossTowLossRegion;
	
	
	@Column(name = "LOSS_TOW_LOSS_CAZA")
	private String lossTowLossCaza;
	
	
	@Column(name = "LOSS_TOW_LOSS_TOWN")
	private String lossTowLossTown;
	
	
	@Column(name = "LOSS_TOW_EXPERT_ASSIST")
	private String lossTowExpertAssist;
	
	
	@Column(name = "LOSS_TOW_EXPERT")
	private Integer lossTowExpert;
	
	
	@Column(name = "LOSS_TOW_TOWING_ASSIST")
	private String lossTowTowingAssist;
	
	
	@Column(name = "LOSS_TOW_TOWING")
	private Integer lossTowTowing;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_TIME_DISTRIBUTION")
	private java.util.Date lossTowTimeDistribution;
	
	
	@Column(name = "LOSS_TOW_RELATED")
	private Integer lossTowRelated;
	
	
	@Column(name = "LOSS_TOW_UWY")
	private Integer lossTowUwy;
	
	
	@Column(name = "LOSS_TOW_FIRST_ESTIMATE")
	private Integer lossTowFirstEstimate;
	
	
	@Column(name = "LOSS_TOW_FIRST_ESTIMATE_LL")
	private Integer lossTowFirstEstimateLl;
	
	
	@Column(name = "LOSS_TOW_FIRST_ESTIMATE_USD")
	private Integer lossTowFirstEstimateUsd;
	
	
	@Column(name = "LOSS_TOW_STATUS")
	private Integer lossTowStatus;
	
	
	@Column(name = "LOSS_TOW_STATUS_DATE")
	private Integer lossTowStatusDate;
	
	
	@Column(name = "LOSS_TOW_STAFF_CASE_MNGR")
	private String lossTowStaffCaseMngr;
	
	
	@Column(name = "LOSS_TOW_ASSIGNMENT_DATEJ")
	private Integer lossTowAssignmentDatej;
	
	
	@Column(name = "LOSS_TOW_MAT_DAMAGE")
	private String lossTowMatDamage;
	
	
	@Column(name = "LOSS_TOW_NBR_VEH_INVOLVED")
	private Integer lossTowNbrVehInvolved;
	
	
	@Column(name = "LOSS_TOW_BODILY_CASE")
	private String lossTowBodilyCase;
	
	
	@Column(name = "LOSS_TOW_NBR_CAUSALITY")
	private Integer lossTowNbrCausality;
	
	
	@Column(name = "LOSS_TOW_SEVERITY")
	private String lossTowSeverity;
	
	
	@Column(name = "LOSS_TOW_REMARKS")
	private String lossTowRemarks;
	
	
	@Column(name = "LOSS_TOW_REPORT")
	private Long lossTowReport;

	
	@Column(name = "LOSS_TOW_OFFICER_STATUS")
	private String lossTowOfficerStatus;
	
	
	@Column(name = "LOSS_TOW_FIRST_EST_EXPERT_FEE")
	private Integer lossTowFirstEstExpertFee;
	
	
	@Column(name = "LOSS_TOW_RECOVERY")
	private String lossTowRecovery;
	
	
	@Column(name = "LOSS_TOW_LITIGATION")
	private String lossTowLitigation;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_RECOVERY_DATE")
	private java.util.Date lossTowRecoveryDate;
	
	
	@Column(name = "LOSS_TOW_EREPORTED_BY")
	private String lossTowEreportedBy;
	
	
	@Column(name = "LOSS_TOW_BROKER_BRANCH")
	private String lossTowBrokerBranch;
	
	
	@Column(name = "LOSS_TOW_BROKER")
	private String lossTowBroker;
	
	
	@Column(name = "LOSS_TOW_DAMAGE_SEVERITY")
	private String lossTowDamageSeverity;
	
	
	@Column(name = "LOSS_TOW_INCLUDE_IN_STAT")
	private String lossTowIncludeInStat;
	
	
	@Column(name = "LOSS_TOW_INS_CLAIM_NUMBER")
	private String lossTowInsClaimNumber;
	
	
	@Column(name = "LOSS_TOW_RESERVE_USD")
	private Integer lossTowReserveUsd;
	
	
	@Column(name = "LOSS_TOW_RECOVERY_RESERVE_USD")
	private Integer lossTowRecoveryReserveUsd;
	
	
	@Column(name = "LOSS_TOW_RECOVERY_RECEIVED_USD")
	private Integer lossTowRecoveryReceivedUsd;
	
	
	@Column(name = "LOSS_TOW_SALVAGE_RECEIVED_USD")
	private Integer lossTowSalvageReceivedUsd;
	
	
	@Column(name = "LOSS_TOW_TRANSFERED")
	private String lossTowTransfered;
	
	
	@Id
	@Column(name = "LOSS_TOW_ID")
	private String lossTowId;
	
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_EXPERT_ID")
	private CarsSupplier carsSupplierLossTowExpert;
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_TOWING_ID")
	private CarsSupplier carsSupplier;
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_LOSS_TOWN_ID")
	private CarsTown carsTown;
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_2ND_EXPERT_ID")
	private CarsSupplier carsSupplierLossTowSecondExpert;
	
	
	@ManyToOne
	@JoinColumn(name="DISTRIBUTION_LOSS_TOWN_ID")
	private CarsTown carsTownDistributionLossTown;
	
	
	@ManyToOne
	@JoinColumn(name="DISTRIBUTION_TOW_FROM_TOWN_ID")
	private CarsTown carsTownDistributionTowFromTow;
	
	
	@ManyToOne
	@JoinColumn(name="DISTRIBUTION_TOW_TO_TOWN_ID")
	private CarsTown carsTownDistributionTowToTow;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_EXPERT_CHECKED_DATE")
	private java.util.Date lossTowExpertCheckedDate;
	
	
	@Column(name = "LOSS_TOW_EXPERT_AGREED_AMOUNT")
	private Integer lossTowExpertAgreedAmount;
	
	
	@Column(name = "LOSS_TOW_EXPERT_TO_HOLD")
	private String lossTowExpertToHold;
	
	
	@Column(name = "LOSS_TOW_EXPERT_REMARKS")
	private String lossTowExpertRemarks;
	
	
	@Column(name = "LOSS_TOW_EXPERT_SENT")
	private String lossTowExpertSent;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_EXPERT_SENT_DATE")
	private java.util.Date lossTowExpertSentDate;
	
	
	@Column(name = "LOSS_TOW_EXPERT_CHECK_NUM")
	private String lossTowExpertCheckNum;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_EXPERT_CHECK_DATE")
	private java.util.Date lossTowExpertCheckDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_EXPERT_PAYMENT_DATE")
	private java.util.Date lossTowExpertPaymentDate;
	
	
	@Column(name = "DISTRIBUTION_LOSS_REGION")
	private String distributionLossRegion;
	
	
	@Column(name = "DISTRIBUTION_LOSS_CAZA")
	private String distributionLossCaza;
	
	
	@Column(name = "DISTRIBUTION_LOSS_TOWN")
	private String distributionLossTown;
	
	
	@Column(name = "DISTRIBUTION_LOSS_STREET")
	private String distributionLossStreet;
	
	
	@Column(name = "DISTRIBUTION_SECOND_EXPERT")
	private Integer distributionSecondExpert;
	
	
	@Column(name = "DISTRIBUTION_LOSS_DISTRIBUTION")
	private String distributionLossDistribution;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_LOSS_DIST_DATE")
	private java.util.Date distributionLossDistDate;
	
	
	@Column(name = "DISTRIBUTION_LOSS_ARRIVED")
	private String distributionLossArrived;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_LOSS_ARRIVED_DATE")
	private java.util.Date distributionLossArrivedDate;
	
	
	@Column(name = "DISTRIBUTION_LOSS_FINISHED")
	private String distributionLossFinished;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_LOSS_FINISH_DATE")
	private java.util.Date distributionLossFinishDate;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA")
	private String distributionNoData;
	
	
	@Column(name = "DISTRIBUTION_POLICY_NUMBER")
	private String distributionPolicyNumber;
	
	
	@Column(name = "DISTRIBUTION_CAR_COLOR")
	private String distributionCarColor;
	
	
	@Column(name = "DISTRIBUTION_TOW_REMARKS")
	private String distributionTowRemarks;
	
	
	@Column(name = "DISTRIBUTION_TOW_NATURE")
	private String distributionTowNature;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_DIST_DATE")
	private java.util.Date distributionTowDistDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_ARRIVED_DATE")
	private java.util.Date distributionTowArrivedDate;
	
	
	@Column(name = "DISTRIBUTION_TOW_CANCELED")
	private String distributionTowCanceled;
	
	
	@Column(name = "DISTRIBUTION_TOW_FROM_STATE")
	private String distributionTowFromState;
	
	
	@Column(name = "DISTRIBUTION_TOW_FROM_REGION")
	private String distributionTowFromRegion;
	
	
	@Column(name = "DISTRIBUTION_TOW_FROM_CAZA")
	private String distributionTowFromCaza;
	
	
	@Column(name = "DISTRIBUTION_TOW_FROM_TOWN")
	private String distributionTowFromTown;
	
	
	@Column(name = "DISTRIBUTION_TOW_TO_REGION")
	private String distributionTowToRegion;
	
	
	@Column(name = "DISTRIBUTION_TOW_TO_CAZA")
	private String distributionTowToCaza;
	
	
	@Column(name = "DISTRIBUTION_TOW_TO_TOWN")
	private String distributionTowToTown;
	
	
	@Column(name = "DISTRIBUTION_NOTE")
	private String distributionNote;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_CALL2_DATE")
	private java.util.Date distributionTowCall2Date;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL2_NOTE")
	private String distributionTowCall2Note;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_CALL3_DATE")
	private java.util.Date distributionTowCall3Date;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL3_NOTE")
	private String distributionTowCall3Note;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_CALL_DATE")
	private java.util.Date distributionTowCallDate;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL4_NOTE")
	private String distributionTowCall4Note;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_PLATE")
	private String distributionNoDataPlate;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_POLICY")
	private String distributionNoDataPolicy;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_CAR_BRAND")
	private String distributionNoDataCarBrand;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_BROKER")
	private String distributionNoDataBroker;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_REMARKS")
	private String distributionNoDataRemarks;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_USER")
	private String distributionNoDataUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_NO_DATA_DATE")
	private java.util.Date distributionNoDataDate;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_PLATE_B")
	private String distributionNoDataPlateB;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_NO_DATA_EFF_DATE")
	private java.util.Date distributionNoDataEffDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_NO_DATA_EXP_DATE")
	private java.util.Date distributionNoDataExpDate;
	
	
	@Column(name = "DISTRIBUTION_TOW_DELAY")
	private String distributionTowDelay;
	
	
	@Column(name = "DISTRIBUTION_TOW_DELAY_OTHER")
	private String distributionTowDelayOther;
	
	
	@Column(name = "DISTRIBUTION_TOW_DRIVER_NAME")
	private String distributionTowDriverName;
	
	
	@Column(name = "DISTRIBUTION_TOW_DRIVER_PHONE")
	private String distributionTowDriverPhone;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_DRIVER_DATE")
	private java.util.Date distributionTowDriverDate;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_NAME")
	private String distributionNoDataName;
	
	
	@Column(name = "DISTRIBUTION_NO_DATA_TYPE")
	private String distributionNoDataType;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_TOWCOMP_TIME")
	private java.util.Date distributionTowTowcompTime;
	
	
	@Column(name = "DISTRIBUTION_EXP_NOTIF_EMAIL")
	private String distributionExpNotifEmail;
	
	
	@Column(name = "DISTRIBUTION_EXP_NOTIF_ENAME")
	private String distributionExpNotifEname;
	
	
	@Column(name = "DISTRIBUTION_EXP_NOTIF_USER")
	private String distributionExpNotifUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_EXP_NOTIF_DATE")
	private java.util.Date distributionExpNotifDate;
	
	
	@Column(name = "DISTRIBUTION_TOW_NOTIF_EMAIL")
	private String distributionTowNotifEmail;
	
	
	@Column(name = "DISTRIBUTION_TOW_NOTIF_USER")
	private String distributionTowNotifUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_NOTIF_DATE")
	private java.util.Date distributionTowNotifDate;
	
	
	@Column(name = "DISTRIBUTION_TOW_TOTAL_KM")
	private Integer distributionTowTotalKm;
	
	
	@Column(name = "DISTRIBUTION_TOW_EXTRA_KM")
	private Integer distributionTowExtraKm;
	
	
	@Column(name = "DISTRIBUTION_TOW_TOTAL_COST")
	private Integer distributionTowTotalCost;
	
	
	@Column(name = "DISTRIBUTION_TOW_CLIENT_COST")
	private Integer distributionTowClientCost;
	
	
	@Column(name = "DISTRIBUTION_LOSS_SEVERITY")
	private String distributionLossSeverity;
	
	
	@Column(name = "DISTRIBUTION_LOSS_DIST_USER")
	private String distributionLossDistUser;
	
	
	@Column(name = "DISTRIBUTION_LOSS_ARRIVED_USER")
	private String distributionLossArrivedUser;
	
	
	@Column(name = "DISTRIBUTION_LOSS_FINISH_USER")
	private String distributionLossFinishUser;
	
	
	@Column(name = "DISTRIBUTION_TOW_DIST_USER")
	private String distributionTowDistUser;
	
	
	@Column(name = "DISTRIBUTION_TOW_ARRIVED_USER")
	private String distributionTowArrivedUser;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL2_USER")
	private String distributionTowCall2User;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL3_USER")
	private String distributionTowCall3User;
	
	
	@Column(name = "DISTRIBUTION_TOW_CALL4_USER")
	private String distributionTowCall4User;
	
	
	@Column(name = "DISTRIBUTION_TOW_DRIVER_USER")
	private String distributionTowDriverUser;
	
	
	@Column(name = "DISTRIBUTION_TOW_REM_USER")
	private String distributionTowRemUser;
	
	
	@Column(name = "DISTRIBUTION_TOW_DIST_LIFTER")
	private String distributionTowDistLifter;
	
	
	@Column(name = "DISTRIBUTION_TOW_RESERVE_COST")
	private Integer distributionTowReserveCost;
	
	
	@Column(name = "DISTRIBUTION_LOG_USER")
	private String distributionLogUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_LOG_DATE_TIME")
	private java.util.Date distributionLogDateTime;
	
	
	
	@ManyToOne
	@JoinColumn(name="DISTRIBUTION_EXP_EXPERT_ID")
	private CarsSupplier carsSupplierLossTowDistributionExpert;
	
	@Column(name = "DISTRIBUTION_EXP_TYPE")
	private String distributionExpType;
	
	
	@Column(name = "DISTRIBUTION_EXP_TYPE_USER")
	private String distributionExpTypeUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_EXP_TYPE_DATE")
	private java.util.Date distributionExpTypeDate;
	
	
	@Column(name = "LOSS_TOW_LIFTER")
	private String lossTowLifter;
	
	
	@Column(name = "LOSS_TOW_BLOCKED")
	private String lossTowBlocked;
	
	
	@Column(name = "LOSS_TOW_OFF_ROAD")
	private String lossTowOffRoad;
	
	
	@Column(name = "LOSS_TOW_WHEEL")
	private String lossTowWheel;
	
	
	@Column(name = "LOSS_TOW_PICK_UP")
	private String lossTowPickUp;
	
	
	@Column(name = "LOSS_TOW_CARRYING_GOOD")
	private String lossTowCarryingGood;
	
	
	@Column(name = "LOSS_TOW_DRIVER_RELATIONSHIP")
	private String lossTowDriverRelationship;
	
	
	@Column(name = "LOSS_TOW_DRIVER_NAME")
	private String lossTowDriverName;
	
	
	@Column(name = "DISTRIBUTION_TOW_CANCELED1")
	private String distributionTowCanceled1;
	
	
	@Column(name = "DISTRIBUTION_TOW_DELAY1")
	private String distributionTowDelay1;
	
	
	@Column(name = "DISTRIBUTION_TOW_NATURE1")
	private String distributionTowNature1;
	
	
	@Column(name = "LOSS_TOW_OFFICER_STATUS1")
	private String lossTowOfficerStatus1;
	
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_LOSS_BRANCH_ID")
	private CarsBranch carsBranch;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_CANCELED_DATE")
	private java.util.Date distributionTowCanceledDate;
	
	
	@Column(name = "LOSS_TOW_NEED_EXPERT_REPORT")
	private String lossTowNeedExpertReport;
	
	
	@Column(name = "LOSS_TOW_QUESTION1")
	private String lossTowQuestion1;
	
	
	@Column(name = "LOSS_TOW_QUESTION2")
	private String lossTowQuestion2;
	
	
	@Column(name = "LOSS_TOW_QUESTION3")
	private String lossTowQuestion3;
	
	
	@Column(name = "LOSS_TOW_QUESTION4")
	private String lossTowQuestion4;
	
	
	@Column(name = "LOSS_TOW_QUESTION5")
	private String lossTowQuestion5;
	
	
	@Column(name = "LOSS_TOW_QUESTION_FILLED")
	private String lossTowQuestionFilled;
	
	
	
	@ManyToOne
	@JoinColumn(name="NOTIFICATION_ID")
	private CarsNotification carsNotification;
	
	
	@ManyToOne
	@JoinColumn(name="LOSS_TOW_RS_ID")
	private CarsSupplier carsSupplierRs;
	
	@Column(name = "LOSS_TOW_RS_DESC")
	private String lossTowRsDesc;
	
	
	@Column(name = "LOSS_TOW_EXPERT_ROT")
	private String lossTowExpertRot;
	
	
	@Column(name = "LOSS_TOW_EXPERT_MAN")
	private String lossTowExpertMan;
	
	
	@Column(name = "LOSS_TOW_POLICY_DEDUCTIBLE_TP")
	private Integer lossTowPolicyDeductibleTp;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_PRODUCT_DATE")
	private java.util.Date lossTowProductDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_ASSIGNMENT_DATE")
	private java.util.Date lossTowAssignmentDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LOSS_DATE")
	private java.util.Date lossTowLossDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_INPUT_DATE")
	private java.util.Date lossTowInputDate;
	
	
	@Column(name = "DITRIBUTION_TOW_SNOOZE1")
	private String ditributionTowSnooze1;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_SNOOZE1_DATE")
	private java.util.Date distributionTowSnooze1Date;
	
	
	@Column(name = "DISTRIBUTION_TOW_SNOOZE2")
	private String distributionTowSnooze2;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TOW_SNOOZE2_DATE")
	private java.util.Date distributionTowSnooze2Date;
	
	
	@Column(name = "DISTIBUTION_EXP_SNOOZE1")
	private String distibutionExpSnooze1;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_EXP_SNOOZE1_DATE")
	private java.util.Date distributionExpSnooze1Date;
	
	
	@Column(name = "DISTIBUTION_EXP_SNOOZE2")
	private String distibutionExpSnooze2;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_EXP_SNOOZE2_DATE")
	private java.util.Date distributionExpSnooze2Date;
	
	
	@Column(name = "DISTRIBUTION_REASON_SNOOZE1")
	private String distributionReasonSnooze1;
	
	
	@Column(name = "DISTRIBUTION_REASON_NOTE1")
	private String distributionReasonNote1;
	
	
	@Column(name = "DISTRIBUTION_REASON_SNOOZE2")
	private String distributionReasonSnooze2;
	
	
	@Column(name = "DISTRIBUTION_REASON_NOTE2")
	private String distributionReasonNote2;
	
	
	@Column(name = "LOSS_TOW_SERVICE")
	private String lossTowService;
	
	
	@Column(name = "LOSS_TOW_COMPLAINTS")
	private String lossTowComplaints;
	
	
	@Column(name = "LOSS_TOW_COMPLAINT_GARAGE")
	private String lossTowComplaintGarage;
	
	
	@Column(name = "LOSS_TOW_COMPLAINT_PUD")
	private String lossTowComplaintPud;
	
	
	@Column(name = "LOSS_TOW_COMPLAINT_TOWING")
	private String lossTowComplaintTowing;
	
	
	@Column(name = "LOSS_TOW_COMPLAINT_EXPERT")
	private String lossTowComplaintExpert;
	
	@Column(name = "DOC_DECLARATION_BRANCH_ID")
	private String docDeclarationBranchId;
	
	
	@Column(name = "DOC_PHYSICAL_FILE_EXIST")
	private String docPhysicalFileExist;
	
	
	@Column(name = "DISTRIBUTION_APP_NOTE")
	private String distributionAppNote;
	
	
	@Column(name = "DISTRIBUTION_TEMA")
	private String distributionTema;
	
	
	@Column(name = "DISTRIBUTION_TEMA_USER")
	private String distributionTemaUser;
	
	
	@Column(name = "DISTRIBUTION_PDF_EXIST")
	private String distributionPdfExist;
	
	
	@Column(name = "DISTRIBUTION_PDF_USER")
	private String distributionPdfUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_PDF_DATE")
	private java.util.Date distributionPdfDate;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_TEMA_DATE")
	private java.util.Date distributionTemaDate;
	
	
	@Column(name = "LOSS_TOW_NBR_VEH_INVOLVED_CA")
	private Integer lossTowNbrVehInvolvedCa;
	
	
	@Column(name = "DISTRIBUTION_EXP_CANCELED")
	private String distributionExpCanceled;
	
	
	@Column(name = "DISTRIBUTION_EXP_CANCELED_USER")
	private String distributionExpCanceledUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISTRIBUTION_EXP_CANCELED_DATE")
	private java.util.Date distributionExpCanceledDate;
	
	
	@Column(name = "LOSS_TOW_LEGAL_ACTION")
	private String lossTowLegalAction;
	
	
	@Column(name = "LOSS_TOW_LEGAL_ACTION_SOLVED")
	private String lossTowLegalActionSolved;
	
	
	@Column(name = "LOSS_TOW_LITIGATION_SOLVED")
	private String lossTowLitigationSolved;
	
	
	@Column(name = "LOSS_TOW_LA_USER")
	private String lossTowLaUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LA_DATE")
	private java.util.Date lossTowLaDate;
	
	
	@Column(name = "LOSS_TOW_LA_SOLVED_USER")
	private String lossTowLaSolvedUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LA_SOLVED_DATE")
	private java.util.Date lossTowLaSolvedDate;
	
	
	@Column(name = "LOSS_TOW_LIT_USER")
	private String lossTowLitUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LIT_DATE")
	private java.util.Date lossTowLitDate;
	
	
	@Column(name = "LOSS_TOW_LIT_SOLVED_USER")
	private String lossTowLitSolvedUser;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOSS_TOW_LIT_SOLVED_DATE")
	private java.util.Date lossTowLitSolvedDate;
	

	public CarsLossTowing() {
		this.lossTowId = UUID.randomUUID().toString();
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
		
}









