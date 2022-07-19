import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sneaker {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private double size;
    private int qty;
    private float price;

    public Sneaker(int expectedId, String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice) {
        this.id = expectedId;
        this.name = expectedName;
        this.brand = expectedBrand;
        this.sport = expectedSport;
        this.qty = expectedQty;
         this.price = expectedPrice;
    }

    public Sneaker() {

    }

    public Sneaker(int id, String name, String brand, String sport, double size, int qty, float price) {
    }


    //    Sneaker sweetAdidas = new Sneaker(6, "Stan Smith", "Tennis", 10.5f, 10, 80.00f);
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
