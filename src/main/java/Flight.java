import java.util.ArrayList;

public class Flight {

    // Declaration
    private ArrayList<Passanger> bookedPassangers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    // Constructor
    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.bookedPassangers = new ArrayList<Passanger>();
        //this.plane = new Plane(pl;

    }

    public ArrayList<Passanger> getBookedPassangers(){return bookedPassangers;}

    // Getter
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    // Methods
    public int passangerCount() {
        return this.bookedPassangers.size();
    }

    public boolean isPlaneFull(){
        if(this.bookedPassangers.size() < this.plane.getCapacityFromPlaneType()){
            return false;
        } else{
            return true;
        }
    }

    public int addPassanger(Passanger passanger1) {
        if(!isPlaneFull()){
            bookedPassangers.add(passanger1);
            return bookedPassangers.size();
        }else{
            return 0;
        }
    }
}
