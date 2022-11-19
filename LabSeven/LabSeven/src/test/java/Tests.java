import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void PlusTest(){
        Assert.assertEquals(5,Calculator.operation(3,2,'+'),0);
    }
    @Test
    public void MinusTest(){
        Assert.assertEquals(-1,Calculator.operation(2,3,'-'),0);
    }
    @Test
    public void MultiplicationTest(){
        Assert.assertEquals(150,Calculator.operation(15,10,'*'),0);
    }
    @Test
    public void DivisionTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'/'),0);
    }
    @Test
    public void DivisionByZeroTest(){
        Calculator.operation(25,0,'/');
    }
    @Test
    public void WrongOperationTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'%'),0);
    }

    @Test
    public void FirstSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(15,10,6));
    }
    @Test
    public void SecondSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(0,0,0));
    }
    @Test
    public void ThirdSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(31,31,31));
    }
    @Test
    public void FourthSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(6,8,10));
    }
    @Test
    public void FifthSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(6,8,10));
    }
    @Test
    public void SixthSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(-96,25,-123));
    }
    @Test
    public void NegativeSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(-15,10,6));
    }
    @Test
    public void ClassesTest(){
        Calculator calc=new Calculator();
        Triangle tr=new Triangle();

    }


}
