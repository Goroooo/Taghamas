import Kvartal.model.Buildings;
import Kvartal.model.CafeRestaurant;
import Kvartal.service.ApartmentServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {

        ApartmentServiceImpl service = new ApartmentServiceImpl();
        service.menu();


    }
}
