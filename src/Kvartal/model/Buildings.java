package Kvartal.model;

public abstract class Buildings {

    private String address;
    private int floorCount;
    private boolean isMonolit;
    private int floorApCount;

public  Buildings(){

}
    public Buildings(String address, int floorCount, boolean isMonolit, int floorApCount) {
        this.address = address;
        this.floorCount = floorCount;
        this.isMonolit = isMonolit;
        this.floorApCount = floorApCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public boolean isMonolit() {
        return isMonolit;
    }

    public void setMonolit(boolean monolit) {
        isMonolit = monolit;
    }

    public int getFloorApCount() {
        return floorApCount;
    }

    public void setFloorApCount(int floorApCount) {
        this.floorApCount = floorApCount;
    }
}
