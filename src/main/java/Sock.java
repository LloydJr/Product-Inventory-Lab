public class Sock {
    private int id;
    private String name;
    private String brand;
    private double size;
    private int qty;
    private float price;

    public Sock(int expectedId, String expectedName, String expectedBrand, int expectedQty, float expectedPrice) {
        this.id = expectedId;
        this.name = expectedName;
        this.brand = expectedBrand;
        this.qty = expectedQty;
        this.price = expectedPrice;
    }

    public Sock() {

    }

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
