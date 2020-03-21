import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passanger passanger1;
    Flight flight;

    @Before
    public void setUp(){
        passanger1 = new Passanger("Shaheen", 2);
        flight = new Flight("Pk786","Pk-ISB","GLA","8AM");

    }

    @Test
    public void flighthasPassanger(){
        assertEquals(0, flight.passangerCount());
    }

    @Test
    public void isPlaneFull(){
        assertEquals(true,flight.isPlaneFull());
    }

    @Test
    public void canAddPassanger(){
        assertEquals(1, flight.addPassanger(passanger1));
    }

}
