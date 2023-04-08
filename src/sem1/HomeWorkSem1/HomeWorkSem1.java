package sem1.HomeWorkSem1;
import sem1.HomeWorkSem1.tasks.Task1;
import sem1.HomeWorkSem1.tasks.Task2;
import sem1.HomeWorkSem1.tasks.Task3;

public class HomeWorkSem1 {
    public static void main(String[] args) {
        int inputNumb = Task1.inputNumb();
        System.out.println("Треугльное число от 1 до " + inputNumb + " = " +
                Task1.triangle(inputNumb)); //вычисление треугольного числа
        System.out.println("Факториал числа "+ inputNumb + " = " +
                Task2.factorial(inputNumb)); //факториал числа n
        System.out.println("Простые числа от 1 до " + inputNumb + " :\n" +
                Task3.simpleNumbers(inputNumb)); //простые числа
        }
    }
