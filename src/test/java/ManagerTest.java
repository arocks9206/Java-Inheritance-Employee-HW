import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Lisa Floyd", "WV654321B", 40000.00, "Tech");
    }

    @Test
    public void hasName(){
        assertEquals("Lisa Floyd", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(42000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(420.00, manager.payBonus(), 0.01);
    }

}
