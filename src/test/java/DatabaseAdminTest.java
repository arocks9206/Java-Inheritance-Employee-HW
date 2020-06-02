import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alice Smith", "JX123456C", 26000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Alice Smith", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(26000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(280.00, databaseAdmin.payBonus(), 0.01);
    }

}
