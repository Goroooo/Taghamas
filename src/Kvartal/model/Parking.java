package Kvartal.model;

public class Parking extends Buildings {

    private int parkingFloor;
    private int parkingCarsAmount;
    private boolean isParkingMoyka;

    public Parking(int parkingFloor, int parkingCarsAmount, boolean isParkingMoyka) {
        this.parkingFloor = parkingFloor;
        this.parkingCarsAmount = parkingCarsAmount;
        this.isParkingMoyka = isParkingMoyka;
    }

    public int getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(int parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public int getParkingCarsAmount() {
        return parkingCarsAmount;
    }

    public void setParkingCarsAmount(int parkingCarsAmount) {
        this.parkingCarsAmount = parkingCarsAmount;
    }

    public boolean isParkingMoyka() {
        return isParkingMoyka;
    }

    public void setParkingMoyka(boolean parkingMoyka) {
        isParkingMoyka = parkingMoyka;
    }
}
