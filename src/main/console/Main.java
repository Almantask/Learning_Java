// Namespace
package main.console;
// Using
import main.calculator.*;

public class Main {
    public static void main(String[] args) {
        TestCalculatorTest();
    }

    private static void TestCalculatorTest(){
        var calculator = new BasicCalculator();
        calculator.add(4);
        calculator.take(3);
        System.out.println(calculator.getResult());
    }
}