public class Plane {
    // Declaration
    private PlaneType planeType;

    // Constructor
    public Plane(PlaneType plane) {
        this.planeType= plane;
    }


    public int getCapacityFromPlaneType(){
        return planeType.getCapacity();
    }
    public int getWeightFromPlaneType(){
        return planeType.getWeight();
    }
}
