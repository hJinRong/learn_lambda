package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static app.MyEnum.PLUS;


public class App {

    public static void main(String[] args) {

        double x = 9, y = 2;
        for (Operation op : Operation.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y));
        }

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        System.out.println("Sum of integers: " + listOfIntegers.stream().reduce(Integer::sum).get());

        PLUS.apply(3, 8);

        MethodReferencesTest mt = new MethodReferencesTest();
        mt.calc(1, 2, Integer::sum);
        mt.calc(1, 2, (a, b) -> a + b);
    }
}