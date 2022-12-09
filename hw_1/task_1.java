//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package hw_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
                
        for (int i = 1; i <= n; i++) {            
            int res = (i * (i + 1)) / 2;
            System.out.println(res);
        }        
    }
}
