//Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка
//только на 1 и на само себя (1 - это не простое число);
package sem1.HomeWorkSem1.tasks;

public class Task3 {
    public static String simpleNumbers(int a) {
        String simpleNumbs = "";
        int counter = 0;
        for (int i = 2; i <= a; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0){
                    counter++;
                }
            }
            if(counter <= 2){
                simpleNumbs+= i + " ";
            }
            counter = 0;
        }

        return simpleNumbs;
    }
}
