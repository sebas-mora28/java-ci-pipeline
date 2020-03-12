package calculator;


public class Calculator{
    int age;

    public static double adding(int number, int number2){
        return number + number2;

    }

    public static double substraction(int number, int number2){
        return number - number2;
    }

    public static double multiplication(int number, int number2){
        return number*number2;
    }

    public static double division(int number1, int number2){
        if(number2 != 0){
            return number1/number2;
        }else{
            return -1;
        }
    }
}