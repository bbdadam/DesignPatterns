package FactoryPattern;

public class GetPlanFactory {

    public Plan getPlan(PlanType planType){
        if (planType == null){
            return null;
        }
        if (planType.equals(PlanType.DOMESTICPLAN)){
            return new DomesticPlan();
        } else if (planType.equals(PlanType.COMMERCIALPLAN)){
            return new CommercialPlan();
        } else if (planType.equals(PlanType.INSTITUTIONALPLAN)){
            return new InstitutionalPlan();
        }

        return null;
    }
}
