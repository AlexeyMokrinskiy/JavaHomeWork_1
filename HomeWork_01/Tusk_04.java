package HomeWork_01;

// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет. 24 45 
// 24 + 45 = 69 (n=4)

public class Tusk_04 {
    public static void main(String args[]) {
        int q = 20; // здесь просто можно ? заменить на 0, чтобы не делать перебор и отстаться с инт
        int w = 05;
        int e = 69;
        
        int x = (e / 10) - (q / 10);
        int y = (e % 10) - (w % 10);
        
        if (x == y) {
            System.out.println("n = " + x);
        }
        else System.out.println("Нет решения");

    }
}