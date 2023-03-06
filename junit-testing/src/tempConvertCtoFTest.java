import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class tempConvertCtoFTest {
    @Test
    public void oneHundredCisTwoTwelveinF() {
        tempConvertCtoF converter = new tempConvertCtoF();
        Double expectedResult = 212.0;
        assertEquals((Double) expectedResult, (Double) converter.CtoF(100));
    }

    @Test
    public void zeroCisThirtyTwoinF1(){
        tempConvertCtoF converter = new tempConvertCtoF();
        Double expectedResult = 32.0;
        assertTrue((expectedResult - converter.CtoF(0)) < 0.001);
    }

    //what happens if one test fails
    /*
    @Test
    public void zeroCisThirtyTwoinF2(){
        tempConvertCtoF converter = new tempConvertCtoF();
        Double expectedResult = 0.0;
        assertEquals((Double) expectedResult, (Double) converter.CtoF(100));
    }
    */
}