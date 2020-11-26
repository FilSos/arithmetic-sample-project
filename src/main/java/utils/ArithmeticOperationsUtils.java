package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArithmeticOperationsUtils {

    private static Logger log = LogManager.getLogger(ArithmeticOperationsUtils.class);

    private static final String SUM_OPERATION = "SUM";
    private static final String MEAN_OPERATION = "MEAN";
    private static final String VARIANCE_OPERATION = "VARIANCE";

    public static String getSumOperation() {
        return SUM_OPERATION;
    }

    public static String getMeanOperation() {
        return MEAN_OPERATION;
    }

    public static String getVarianceOperation() {
        return VARIANCE_OPERATION;
    }

    //Typ Mozna jeszcze zwracac optional i miec pewnosc, ze nie dostaniemy nullPointerException. Zmienilem wzgledem zadania typ na Double. Pozwoli nam to napisac ladnego enumowego swticha.
    public static Double sum(ArrayList<Integer> numbersList) {
        //Inny sposob wykonania. Jest jeszcze kilka metod, ale stwierdzilem, ze pokazanie umiejetnosci uzytkowania internetu nie jest tu kluczowe
//        OptionalInt.of(numbersList.stream()
//        .reduce(0, Integer::sum));
        return numbersList.stream()
                .mapToDouble(x -> x)
                .sum();
    }

    //Metoda .average zwraca nam typ OptionalDouble, w ramach ktorego zamiast zwracac potencjalne pusty obiekt rzucamy wyjatek (stad .orElseThrow)
    public static Double mean(ArrayList<Integer> numbersList) {
        return numbersList.stream()
                .mapToInt(x -> x)
                .average().orElseThrow(() -> new NullPointerException("Variable may not have been initialized"));
    }

    public static Double variance(ArrayList<Integer> numbersList) {
        List<Double> doubles = numbersList.stream().map(x -> x.doubleValue()).collect(Collectors.toList());
        return doubles.stream()
                .map(i -> i - mean(numbersList))
                .map(i -> i * i)
                .mapToDouble(i -> i).average().orElseThrow(() -> new NullPointerException("Variable may not have been initialized"));
    }
}
