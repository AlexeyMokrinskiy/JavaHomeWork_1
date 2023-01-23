package HomeWork_01;

import java.util.Scanner;

// 3. Реализовать простой калькулятор (пользователь вводит 2 числа и
// вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)

public class Tusk_03 {

    public static void main(String[] args) {
    int x = FirstValue();
    int y = SecondValue();
    String operation = Operation();
    float result = calculation(x, y, operation);
    System.out.println("Результат вычисления равен: " + result);
    
    }
    public static int FirstValue() {
        Scanner iScanner = new Scanner(System.in); // хз почему подчеркивает (трай и клоуз уходит в ошибку)
        System.out.println("Введите первое число:");
        int a;
        if(iScanner.hasNextInt()) {
            a = iScanner.nextInt();
        } 
        else {
            System.out.println("Ошибка, введите цифры ");
            iScanner.next(); // если ошибка ввода, отправлям обратно
            a = FirstValue();
        }
        return a;
    }
    public static int SecondValue() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите второе число:");
        int a;
        if(iScanner.hasNextInt()) {
            a = iScanner.nextInt();
        } 
        else {
            System.out.println("Ошибка, введите цифры ");
            iScanner.next(); // если ошибка ввода, отправлям обратно
            a = FirstValue();
        }
        return a;
    }
    public static String Operation() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Операцию, где:\n+ - сложение\n- - вычитание\n* - умножение\n/ - деление\nИли stop для выхода");
        String a = iScanner.nextLine();
        return a;
    }
    public static float calculation(int num1, int num2, String operation){
        float result;
        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "stop":
                result = num1 / 0; // ничего лучше не придумал
                break;
            default:
                System.out.println("Ошибка ввода. (+ - * /)");
                result = calculation(num1, num2, Operation()); //при неправильном вводе отправляем в рекурсию
        }
        return result; // делит криво (5 / 2 = 2.0) пробовал фдот и дабл
    }
}
