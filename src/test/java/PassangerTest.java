import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassangerTest {

    Passanger passanger;

    @Before
    public void setUp()
    { passanger = new Passanger("Shaheen", 2);}

    @Test
    public void passangerHasName(){
        assertEquals("Shaheen", passanger.getName());
    }

    @Test
    public void passangerHasBags(){
        assertEquals(2, passanger.getNoOfBags());
    }



}
