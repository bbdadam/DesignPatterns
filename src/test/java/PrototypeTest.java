import static org.junit.jupiter.api.Assertions.*;

import Prototype.EmployeeRecord;
import org.junit.jupiter.api.Test;
public class PrototypeTest {
    @Test
    void testEmployeeRecordClone(){
        EmployeeRecord e1 = new EmployeeRecord(1, "Béla", "MiddleOfTheNoWhere", 250.5, "TestVillage");
        EmployeeRecord e2 = (EmployeeRecord)e1.getClone();

        assertEquals(e1.getAddress(), e2.getAddress());
        assertEquals(e1.getDesignation(), e2.getDesignation());
        assertEquals(e1.getName(), e2.getName());
        assertEquals(e1.getId(), e2.getId());
        assertEquals(e1.getSalary(), e2.getSalary());
        assertNotEquals(e1, e2);
    }
}
