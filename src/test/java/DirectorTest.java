import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Mia James", "LS123456B", 50000.00,
                "Finance", 90000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mia James", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("LS123456B", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(90000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(52000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(520.00, director.payBonus(), 0.01);
    }

}
