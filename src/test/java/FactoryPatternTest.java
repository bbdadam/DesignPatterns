import static org.junit.jupiter.api.Assertions.*;

import FactoryPattern.*;
import org.junit.jupiter.api.Test;

public class FactoryPatternTest {
    GetPlanFactory factory = new GetPlanFactory();

    @Test
    void testCommercialRate(){
        Plan plan = factory.getPlan(PlanType.COMMERCIALPLAN);
        plan.getRate();

        assertEquals(7.5, plan.rate);
    }
    @Test
    void testDomesticRate(){
        Plan plan = factory.getPlan(PlanType.DOMESTICPLAN);
        plan.getRate();

        assertEquals(3.5, plan.rate);
    }
    @Test
    void testInstitutionalRate(){
        Plan plan = factory.getPlan(PlanType.INSTITUTIONALPLAN);
        plan.getRate();

        assertEquals(5.5, plan.rate);
    }
}
