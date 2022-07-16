package Kvartal.service;

import Kvartal.model.*;

import java.util.Scanner;

public class ApartmentServiceImpl implements ApartmentService {

    public static final String URL = "C:\\Users\\user\\Desktop\\ApartmentsInfo.txt";


    public void menu() throws Exception {
        Scanner s = new Scanner(System.in);
        boolean isActive = true;
        while (isActive) {
            System.out.println("------- Menu -------");
            System.out.println("1. Print apartment Count");
            System.out.println("2. Print not sold apartments");
            System.out.println("3. Print not sold apartment's rooms count");
            System.out.println("4. Print sold apartments by price");
            System.out.println("5. Exit");
            int menuNumber = s.nextInt();
            switch (menuNumber) {
                case 1:
                    printApartmentCount();
                    break;
                case 2:
                    notSoldApartments();
                    break;
                case 3:
                    notSoldApRooms();
                    break;
                case 4:
                    soldByPrice();
                    break;
                case 5:
                    isActive = false;
                    break;
                default:
            }
        }
    }

    @Override
    public void printApartmentCount() throws Exception {
        int stat = 0;
        String[] apsInfo = ReadAndWrite.read(URL);
        Apartments[] apartments = new Apartments[apsInfo.length];
        for (int i = 0; i < apsInfo.length; i++) {
            String[] fields = apsInfo[i].split(",");
            Apartments apartment = new Apartments(Integer.parseInt(fields[0]),
                    Integer.parseInt(fields[1]), Double.parseDouble(fields[2]),
                    Double.parseDouble(fields[3]), Integer.parseInt(fields[4]), Boolean.parseBoolean(fields[5]),
                    Boolean.parseBoolean(fields[6]), Boolean.parseBoolean(fields[7]));
            apartments[i] = apartment;
            stat = apartment.getApNumber();
        }
        System.out.println("There are " + stat + " apartments");
    }

    @Override
    public void notSoldApartments() throws Exception {
        String[] apsInfo = ReadAndWrite.read(URL);
        Apartments[] apartments = new Apartments[apsInfo.length];
        for (int i = 0; i < apsInfo.length; i++) {
            String[] fields = apsInfo[i].split(",");
            Apartments apartment = new Apartments(Integer.parseInt(fields[0]),
                    Integer.parseInt(fields[1]), Double.parseDouble(fields[2]),
                    Double.parseDouble(fields[3]), Integer.parseInt(fields[4]), Boolean.parseBoolean(fields[5]),
                    Boolean.parseBoolean(fields[6]), Boolean.parseBoolean(fields[7]));
            apartments[i] = apartment;
        }
        for (Apartments apartment : apartments) {
            if (!apartment.isApSold()) {
                System.out.println(apartment);
            }
        }
    }

    @Override
    public void notSoldApRooms() throws Exception {
        String[] apsInfo = ReadAndWrite.read(URL);
        Apartments[] apartments = new Apartments[apsInfo.length];
        for (int i = 0; i < apsInfo.length; i++) {
            String[] fields = apsInfo[i].split(",");
            Apartments apartment = new Apartments(Integer.parseInt(fields[0]),
                    Integer.parseInt(fields[1]), Double.parseDouble(fields[2]),
                    Double.parseDouble(fields[3]), Integer.parseInt(fields[4]), Boolean.parseBoolean(fields[5]),
                    Boolean.parseBoolean(fields[6]), Boolean.parseBoolean(fields[7]));
            apartments[i] = apartment;
        }
        for (Apartments apartment : apartments) {
            if (!apartment.isApSold()) {
                System.out.println(apartment.getApRoomNumber());
            }
        }
    }

    @Override
    public void soldByPrice() throws Exception {
        String[] apsInfo = ReadAndWrite.read(URL);
        Apartments[] apartments = new Apartments[apsInfo.length];
        for (int i = 0; i < apsInfo.length; i++) {
            String[] fields = apsInfo[i].split(",");
            Apartments apartment = new Apartments(Integer.parseInt(fields[0]),
                    Integer.parseInt(fields[1]), Double.parseDouble(fields[2]),
                    Double.parseDouble(fields[3]), Integer.parseInt(fields[4]), Boolean.parseBoolean(fields[5]),
                    Boolean.parseBoolean(fields[6]), Boolean.parseBoolean(fields[7]));
            apartments[i] = apartment;
        }
        int count = 0;
        for (Apartments apartment : apartments) {
            if (apartment.isApSold()) {
                count++;
            }
        }
        Apartments[] arr = new Apartments[count];
        Apartments max = arr[0];
        if (count != 0) {
            for (int i = 0; i < apartments.length; i++) {
                if (apartments[i].isApSold()) {
                    arr[i] = apartments[i];
                }
                if (arr[i].getApPrice() > max.getApPrice()) {
                    double y = max.getApPrice();
                    double x = arr[i].getApPrice();
                    double temp = x;
                    x = y;
                    y = temp;
                }
            }
            for (Apartments apartment: arr){
                System.out.println(apartment);
            }
        }
    }
}
