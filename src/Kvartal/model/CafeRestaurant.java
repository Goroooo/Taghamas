package Kvartal.model;

public class CafeRestaurant extends Buildings {

    private String cafeName;
    private int cafeFloor;
    private boolean isCafe;
    private int cafePeopleAmount;


    public CafeRestaurant(String cafeName, int cafeFloor, boolean isCafe, int cafePeopleAmount) {
        this.cafeName = cafeName;
        this.cafeFloor = cafeFloor;
        this.isCafe = isCafe;
        this.cafePeopleAmount = cafePeopleAmount;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public int getCafeFloor() {
        return cafeFloor;
    }

    public void setCafeFloor(int cafeFloor) {
        this.cafeFloor = cafeFloor;
    }

    public boolean isCafe() {
        return isCafe;
    }

    public void setCafe(boolean cafe) {
        isCafe = cafe;
    }

    public int getCafePeopleAmount() {
        return cafePeopleAmount;
    }

    public void setCafePeopleAmount(int cafePeopleAmount) {
        this.cafePeopleAmount = cafePeopleAmount;
    }
}
