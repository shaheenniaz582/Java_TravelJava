//import java.util.Scanner;
//
//import static java.lang.Integer.parseInt;
//
//public class Runner {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("  Welcome To TravelJava!!!  ");
//        System.out.println("Enter flightno:");
//        String flightNo = scanner.next();
//        System.out.println("Enter destination");
//        String destination = scanner.next();
//        System.out.println("Enter departure Airport:");
//        String departureAirport = scanner.next();
//        System.out.println("Enter departure time;");
//        String departureTime = scanner.next();
//        System.out.println("Enter Plane Tye from(BOEING747,CONCORDE ,CARGOPLANE):");
//        String planeType = scanner.next();
//
//        Flight flight = new Flight(flightNo, destination, departureAirport, departureTime, planeType);
//        //System.out.println();
//
//        System.out.println("Enter Passanger Name :");
//
//        String name = scanner.next();
//        System.out.println("Enter no of bags for   ");
//        String input = scanner.next();
//        int bags = parseInt(input);
//        Passanger passanger = new Passanger(name,bags);
//
//    }
//}
