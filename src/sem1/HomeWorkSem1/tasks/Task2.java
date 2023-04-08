//n! (произведение чисел от 1 до n)
package sem1.HomeWorkSem1.tasks;

public class Task2 {
    public static int factorial(int a){
        if (a == 1){
            return a;
        }
        else{
            return a*factorial(a-1);
        }
    }
}
