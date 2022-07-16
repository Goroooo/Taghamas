package Kvartal.model;

public class Apartments extends Buildings {

    private int apNumber;
    private int apWhichFloor;
    private double apPrice;
    private double apSquare;
    private int apRoomNumber;
    private boolean isApLookingAtArarat;
    private boolean isApRenovated;
    private boolean isApSold;

    public int getApNumber() {
        return apNumber;
    }

    public void setApNumber(int apNumber) {
        this.apNumber = apNumber;
    }

    public int getApWhichFloor() {
        return apWhichFloor;
    }

    public void setApWhichFloor(int apWhichFloor) {
        this.apWhichFloor = apWhichFloor;
    }

    public double getApPrice() {
        return apPrice;
    }

    public void setApPrice(double apPrice) {
        this.apPrice = apPrice;
    }

    public double getApSquare() {
        return apSquare;
    }

    public void setApSquare(double apSquare) {
        this.apSquare = apSquare;
    }

    public int getApRoomNumber() {
        return apRoomNumber;
    }

    public void setApRoomNumber(int apRoomNumber) {
        this.apRoomNumber = apRoomNumber;
    }

    public boolean isApLookingAtArarat() {
        return isApLookingAtArarat;
    }

    public void setApLookingAtArarat(boolean apLookingAtArarat) {
        isApLookingAtArarat = apLookingAtArarat;
    }

    public boolean isApRenovated() {
        return isApRenovated;
    }

    public void setApRenovated(boolean apRenovated) {
        isApRenovated = apRenovated;
    }

    public boolean isApSold() {
        return isApSold;
    }

    public void setApSold(boolean apSold) {
        isApSold = apSold;
    }

    public Apartments() {

    }

    @Override
    public String toString() {
        return "apNumber: " + apNumber +
                ", apFloor: " + apWhichFloor +
                ", apPrice: " + apPrice +
                ", apSquare: " + apSquare +
                ", apRooms: " + apRoomNumber +
                ", isArarat: " + isApLookingAtArarat +
                ", isRenovated: " + isApRenovated +
                ", isSold: " + isApSold;
    }

    public Apartments(int apNumber, int apWhichFloor, double apPrice, double apSquare, int apRoomNumber,
                      boolean isApLookingAtArarat, boolean isApRenovated, boolean isApSold) {
        this.apNumber = apNumber;
        this.apWhichFloor = apWhichFloor;
        this.apPrice = apPrice;
        this.apSquare = apSquare;
        this.apRoomNumber = apRoomNumber;
        this.isApLookingAtArarat = isApLookingAtArarat;
        this.isApRenovated = isApRenovated;
        this.isApSold = isApSold;
    }

}
