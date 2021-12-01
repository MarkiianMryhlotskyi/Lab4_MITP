package org.example;

import java.util.Scanner;

public class Calculator {

    public static double currentTotal;

    public static void main(String[] args) {

        double num1=0.0, num2=0.0;
        double sum=0.0, sub=0.0, multiple=0.0;
        double divide=0.0, remainder=0.0, power=0.0;
        char operator='\0';
        boolean nextOperation = true;
        char ch='\0';

        Scanner scan = new Scanner(System.in);

        while(nextOperation) {
            System.out.print("_______________________\n");
            System.out.print("|     Калькулятор     |\n");
            System.out.print("|_____________________|\n");
            System.out.print("Введіть 2 числа: ");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();

            System.out.println("Яку операцію ви хочете виконати \n"
                    + "1. Додавання \n"
                    + "2. Віднімання \n"
                    + "3. Множення \n"
                    + "4. Ділення \n"
                    + "5. Остача \n"
                    + "6. Піднесення до степення \n"
                    + "7. Вихід");
            System.out.print("Ваш вибір: ");
            operator = scan.next().charAt(0);
            switch(operator) {
                case '1':
                    sum = add(num1, num2);
                    System.out.println(num1 + " + "
                            + num2 + " = " + sum);
                    break;
                case '2':
                    sub = subtract(num1, num2);
                    System.out.println(num1 + " - "
                            + num2 + " = " + sub);
                    break;
                case '3':
                    multiple = multiply(num1, num2);
                    System.out.println(num1 + " * "
                            + num2 + " = " + multiple);
                    break;
                case '4':
                    divide = division(num1,num2);
                    System.out.println(num1 + " / "
                            + num2 + " = " + divide);
                    break;
                case '5':
                    remainder = findRemainder(num1, num2);
                    System.out.println(num1 + " % "
                            + num2 + " = " + remainder);
                    break;
                case '6':
                    power = power(num1, num2);
                    System.out.println(num1 + " ^ "
                            + num2 + " = " + power);
                    break;
                case '7':
                    System.exit(0);
                default:
                    System.out.println("Невірний символ");
            }

            System.out.println("\nХочете продовжити?");
            System.out.print("Якщо так натисніть Y, ні - N:: ");
            ch = scan.next().charAt(0);

            if(Character.toUpperCase(ch)!='Y')
                nextOperation = false;

            System.out.println();
        }
        System.out.println("Папа)");
        scan.close();
    }

    // Додавання
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    // Віднімання
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    // Множення
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    // Ділення
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    //Залишок від двох чисел
    public static double findRemainder(double num1, double num2) {
        return num1 % num2;
    }
    //Піднесення до степення
    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
