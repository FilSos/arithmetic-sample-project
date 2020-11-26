import service.OperationService;
import utils.ArithmeticOperationsUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    private static Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 8, 14, 20, 11, 3, 7, 2));
        OperationService.executeArithmeticOperation(listOfNumbers, ArithmeticOperationsUtils.getSumOperation());
        OperationService.executeArithmeticOperation(listOfNumbers, ArithmeticOperationsUtils.getMeanOperation());
        OperationService.executeArithmeticOperation(listOfNumbers, ArithmeticOperationsUtils.getVarianceOperation());
    }
}
