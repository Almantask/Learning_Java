package main.calculator;

public class BasicCalculator {
    private double result;

    public double getResult() {
        return result;
    }

    public void add(double number){
        result += number;
    }

    public void take(double number){
        result -= number;
    }

    public void mul(double number){
        result *= number;
    }

    public void div(double number){
        result /= number;
    }
}
