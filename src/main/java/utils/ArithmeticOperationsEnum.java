package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public enum ArithmeticOperationsEnum {

    SUM() {
        @Override
        public Double executeOperation(ArrayList<Integer> numbersList) {
            return ArithmeticOperationsUtils.sum(numbersList);
        }
    },
    MEAN {
        @Override
        public Double executeOperation(ArrayList<Integer> numbersList) {
            return ArithmeticOperationsUtils.mean(numbersList);
        }
    },
    VARIANCE {
        @Override
        public Double executeOperation(ArrayList<Integer> numbersList) {
            return ArithmeticOperationsUtils.variance(numbersList);
        }
    };

    private static Logger log = LogManager.getLogger(ArithmeticOperationsEnum.class);

    public abstract Double executeOperation(ArrayList<Integer> numbersList);
}
