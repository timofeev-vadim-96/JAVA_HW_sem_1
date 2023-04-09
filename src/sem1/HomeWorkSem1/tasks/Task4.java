//Реализовать простой калькулятор
package sem1.HomeWorkSem1.tasks;

import java.util.Scanner;

public class Task4 {
    public static int inputNumb() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    public static int menu() {
        System.out.println("Выберите действие:\n" +
                "1. Сумма\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "5. Равно\n" +
                "6. Выход");
        int choice = inputNumb();
        return choice;
    }
    public static double SimpleCalc() {
        System.out.println("***Калькулятор***");
        System.out.println("Введите число: ");
        double result = inputNumb();
        int inputChoice = menu();
        while (true) {
            if (inputChoice == 1) {
                System.out.println("Введите число: ");
                result += inputNumb();
                inputChoice = menu();
            }
            if (inputChoice == 2) {
                System.out.println("Введите число: ");
                result -= inputNumb();
                inputChoice = menu();
            }
            if (inputChoice == 3) {
                System.out.println("Введите число: ");
                result *= inputNumb();
                inputChoice = menu();
            }
            if (inputChoice == 4) {
                System.out.println("Введите число: ");
                result /= inputNumb();
                inputChoice = menu();
            }
            if (inputChoice > 6 || inputChoice < 1) {
                System.out.println("Неверное действие, повторите попытку: ");
                inputChoice = menu();
            }
            if (inputChoice == 5 || inputChoice==6){
                return result;
            }
        }
    }
}
