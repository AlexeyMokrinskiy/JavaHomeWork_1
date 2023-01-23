package HomeWork_01;

import java.util.Scanner;

// Вывести все простые числа от 1 до 1000 (я сделал ввод числа с консоли)

public class Tusk_02 {
    
    public static void main(String args[]) {
    Scanner iScanner = new Scanner(System.in); 
    System.out.println("Введите числo до которого будем выводить простые числа: ");
    int a = iScanner.nextInt(); // забираем число n из консоли
    iScanner.close();   
    int counter = 2; // 2 - т.к. простые числа начинаются с 2
    while (counter <= a) { 
        if (isPrime(counter)) { // метод проверки на простое число
            System.out.print(counter + " ");
        }
            counter++;
        }
    }
    private static boolean isPrime(int n) { // метод проверки на простое число
        for (var i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
        
