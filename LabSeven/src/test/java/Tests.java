import org.junit.Assert;
import org.junit.Test;
import org.example.*;

public class Tests {

    @Test
    public void PlusTest(){
        Assert.assertEquals(5,Calculator.operation(3,2,'+'),0);
    }
    @Test
    public void PlusSecondTest(){
        Assert.assertEquals(-12,Calculator.operation(-5,-7,'+'),0);
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
    public void WrongOperationTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'%'),0);
    }
    @Test
    public void WrongOperationSecondTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'^'),0);
    }
    @Test
    public void WrongOperationThirdTest(){
        Assert.assertEquals(5,Calculator.operation(25,5,'!'),0);
    }
    @Test
    public void WrongPlusTest(){
        Assert.assertEquals(54,Calculator.operation(3,2,'+'),0);
    }
    @Test
    public void WrongMinusTest(){
        Assert.assertEquals(1,Calculator.operation(2,3,'-'),0);
    }
    @Test
    public void WrongMultiplicationTest(){
        Assert.assertEquals(15,Calculator.operation(15,10,'*'),0);
    }
    @Test
    public void WrongDivisionTest(){
        Assert.assertEquals(15,Calculator.operation(25,5,'/'),0);
    }
    @Test
    public void RightSidesTest(){
        Assert.assertTrue(Triangle.checkTriangle(15,10,6));
    }
//    @Test
//    public void WrongThirdSideTest(){
//        Assert.assertTrue(Triangle.checkTriangle(15,10,3));
//    }
//    @Test
//    public void WrongSecondSideTest(){
//        Assert.assertTrue(Triangle.checkTriangle(15,3,10));
//    }
//    @Test
//    public void WrongFirstSideTest(){
//        Assert.assertTrue(Triangle.checkTriangle(3,10,15));
//    }
    @Test
    public void ClassesTest(){
        Calculator calc=new Calculator();
        Triangle tr=new Triangle();

    }


}
