import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class SockTest {

    private Sock testSock;

    @Before
    public void setUp(){
        testSock = new Sock();
    }

    @Test
    public void setTestId(){
        //Given
        int expected = 199811;
        //When
        testSock.setId(expected);
        //When
        Assert.assertEquals(expected, testSock.getId());
    }
    @Test
    public void setTestName(){
        //Given
        String expected = "Name";
        //When
        testSock.setName(expected);
        //Then
        Assert.assertEquals(expected, testSock.getName());
    }
    @Test
    public void setTestBrand(){
        //Given
        String expected = "Adidas";
        //When
        testSock.setBrand(expected);
        //Then
        Assert.assertEquals(expected, testSock.getBrand());
    }
    @Test
    public void setTestSize(){
        //Given
        double expected = 10.5;
        //When
        testSock.setSize(expected);
        //Then
        Assert.assertEquals(expected, testSock.getSize(), 0.01d);
    }
    @Test
    public void setTestQty(){
        //Given
        int expected = 6;
        //When
        testSock.setQty(expected);
        //Then
        Assert.assertEquals(expected, testSock.getQty());
    }
    @Test
    public void setTestPrice(){
        //Given
        float expected = (float) 19.99;
        //When
        testSock.setPrice(expected);
        //Then
        Assert.assertEquals(expected, testSock.getPrice(), 0.01d);
    }
    @Test
    public void constructorTest(){

        // (2)
        int expectedId = 2;
        String expectedName = "Crew Socks";
        String expectedBrand = "Adidas";
        int expectedQty = 6;
        float expectedPrice = 19.99f;

        // (3)
        Sock testSock = new Sock(expectedId, expectedName, expectedBrand, expectedQty,expectedPrice);

        // (4)
        Assert.assertEquals(expectedId, testSock.getId());
        Assert.assertEquals(expectedName, testSock.getName());
        Assert.assertEquals(expectedBrand, testSock.getBrand());
        Assert.assertEquals(expectedQty, testSock.getQty());
        Assert.assertEquals(expectedPrice, testSock.getPrice(), 0.01d);
    }
}