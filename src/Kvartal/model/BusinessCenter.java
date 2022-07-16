package Kvartal.model;

public class BusinessCenter extends Buildings {

    private String businessName;
    private int businessFloor;
    private double businessSquare;
    private int businessRent;

    public BusinessCenter(String businessName, int businessFloor, double businessSquare, int businessRent) {
        this.businessName = businessName;
        this.businessFloor = businessFloor;
        this.businessSquare = businessSquare;
        this.businessRent = businessRent;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getBusinessFloor() {
        return businessFloor;
    }

    public void setBusinessFloor(int businessFloor) {
        this.businessFloor = businessFloor;
    }

    public double getBusinessSquare() {
        return businessSquare;
    }

    public void setBusinessSquare(double businessSquare) {
        this.businessSquare = businessSquare;
    }

    public int getBusinessRent() {
        return businessRent;
    }

    public void setBusinessRent(int businessRent) {
        this.businessRent = businessRent;
    }
}
