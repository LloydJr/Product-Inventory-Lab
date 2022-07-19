import com.sun.corba.se.spi.orbutil.fsm.StateImpl;

import java.util.ArrayList;
import java.util.List;

public class SneakerService extends Sneaker{

    SneakerService(String name,  String brand, String sport, double size, int qty, float price){

    }

    public static int nextID = 1; //(1)

    public static List<Sneaker> inventory = new ArrayList<>();

    public SneakerService() {

    }

    public Sneaker create(String name, String brand, String sport, double size, int qty, float price) {
        //2
        Sneaker createdSneaker = new Sneaker(nextID++, name, brand, sport, size, qty, price);
        //3
        inventory.add(createdSneaker);
        //4
        return createdSneaker;
    }
}
