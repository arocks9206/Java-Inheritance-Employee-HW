import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Liz Lemon", "QR654321T", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Liz Lemon", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("QR654321T", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(32000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(320.00, developer.payBonus(), 0.01);
    }

}
