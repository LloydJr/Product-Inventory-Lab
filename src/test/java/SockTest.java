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

}