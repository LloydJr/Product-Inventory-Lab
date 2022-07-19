import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SneakerTest {

    private Sneaker testSneaker;
    @Before
    public void setUp() {
        testSneaker = new Sneaker();
    }

    @Test
    public void setTestId() {
        //Given
        int expected = 176815;
        //When
        testSneaker.setId(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getId());
    }
    @Test
    public void setTestName() {
        //Given
        String expected ="Name";
        //When
        testSneaker.setName(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getName());
    }
    @Test
    public void setTestBrand() {
        //Given
        String expected ="Adidas";
        //When
        testSneaker.setBrand(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setTestSport() {
        //Given
        String expected ="Soccer";
        //When
        testSneaker.setSport(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setTestSize() {
        //Given
        double expected =10.5;
        //When
        testSneaker.setSize(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getSize(), 0.01d);
    }

    @Test
    public void setTestQty() {
        //Given
        int expected = 2;
        //When
        testSneaker.setQty(expected);
        //Then
        Assert.assertEquals(expected, testSneaker.getQty());
    }
    @Test
    public void setTestPrice() {
        //Given
        float expected = (float) 99.99;
        //When
        testSneaker.setPrice(expected);
        //Then
        Assert.assertEquals(expected,testSneaker.getPrice(), 0.01d);
    }
    @Test
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(), 0.01d);
    }
}