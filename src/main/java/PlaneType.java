public enum PlaneType {
    BOEING747(100, 200),
    CONCORDE(200, 500),
    CARGOPLANE(300, 500);
    private final int weight;
    private final int capacity;
    PlaneType(int weight, int capacity){
        this.weight = weight;
        this.capacity = capacity;
    }
    public int getWeight() {
        return weight;
    }
    public int getCapacity() {
        return capacity;
    }
}