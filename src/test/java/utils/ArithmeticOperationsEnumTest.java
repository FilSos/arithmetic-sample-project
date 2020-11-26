package utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class ArithmeticOperationsEnumTest {

    private static ArrayList<Integer> listOfNumbers;
    private static DecimalFormat df;

    @Before
    public void init() {
        df = new DecimalFormat("#.0");
        listOfNumbers = new ArrayList<>(Arrays.asList(5, 8, 14, 20, 11, 3, 7, 2));
    }

    @Test
    public void executeOperation() {
        Double sumVal = ArithmeticOperationsEnum.SUM.executeOperation(listOfNumbers);
        Assert.assertNotNull(sumVal);
        Assert.assertEquals(df.format(70.0D), df.format(sumVal));
        Double meanVal = ArithmeticOperationsEnum.MEAN.executeOperation(listOfNumbers);
        Assert.assertNotNull(meanVal);
        Assert.assertEquals(df.format(8.75D), df.format(meanVal));
        Double varianceVal = ArithmeticOperationsEnum.VARIANCE.executeOperation(listOfNumbers);
        Assert.assertNotNull(varianceVal);
        Assert.assertEquals(df.format(31.94D), df.format(varianceVal));
    }
}