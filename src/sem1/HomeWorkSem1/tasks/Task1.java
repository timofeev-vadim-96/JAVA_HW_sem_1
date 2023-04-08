//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
package sem1.HomeWorkSem1.tasks;

import java.util.Scanner;

public class Task1 {
    public static int inputNumb() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    public static int triangle(int a){
        if (a == 1){
            return a;
        }
        else{
            return a+triangle(a-1);
        }
    }
}
