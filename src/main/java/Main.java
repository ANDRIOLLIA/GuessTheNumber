import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println(value);
        int userInt = 0;
        while(userInt != value){
            System.out.println("Введите число: ");
            userInt = new Scanner(System.in).nextInt();
            if (userInt > value){
                System.out.println("Ваше число больше!\n");
            }
            else if (userInt < value){
                System.out.println("Ваше число меньше!\n");
            }
            else if (userInt == value)
                System.out.println("Вы угадали!");
        }
    }
}
