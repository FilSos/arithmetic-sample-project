package service;

import utils.ArithmeticOperationsEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class OperationService {

    private static Logger log = LogManager.getLogger(OperationService.class);

    public static void executeArithmeticOperation(ArrayList<Integer> numbersList, String operationType) {
        log.debug("Print value of operation " + operationType + ": " + ArithmeticOperationsEnum.valueOf(operationType).executeOperation(numbersList));
    }
}
