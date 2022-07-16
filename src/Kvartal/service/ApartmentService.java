package Kvartal.service;

import Kvartal.model.Apartments;

public interface ApartmentService {

    public void printApartmentCount() throws Exception;

    public void notSoldApartments() throws Exception;

    public void notSoldApRooms()throws Exception;

    public void soldByPrice() throws Exception;
}
