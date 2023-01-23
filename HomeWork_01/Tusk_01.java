package HomeWork_01;

import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

public class Tusk_01 {  
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("Введите числo: ");
        int a = iScanner.nextInt(); // забираем число n из консоли
        iScanner.close();   
        System.out.println("Сумма чисел от 1 до " + a + " = " + SumDigit(a)); // Вызываем метод суммы всех чисел от 1 до n
        System.out.println("Факториал числа " + a + " = " + Factorial(a)); // Вызываем метод факториала

    }

    public static int SumDigit(int digit) { // метод суммы чисел от 1 до n 
        int result = 0;
        int count = 0;
        while (count <= digit) {
            result = result + count; // (для треугольных чисел тут другая формула - не совсем понятно из условия)
            count++;
        }  
    return result;
    } 

    public static int Factorial(int digit) { // метод вычисления факториала 
        int result = 1;
        int count = 1;
        while (count <= digit) {
            result = result * count;
            count++;
        }  
    return result;
    } 

}