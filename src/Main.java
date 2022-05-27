import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int accountAmount = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Input amount: ");
        int replenishment = in.nextInt();

        int bonus = replenishment / 100;

        if (replenishment > 1000) {

            System.out.printf("Your account amount: %d \n ", accountAmount + replenishment + bonus);
            System.out.printf("Bonus: %d \n ", bonus);
            in.close();

        } else {

            System.out.printf("Your account amount: %d \n ", accountAmount + replenishment);
            System.out.printf("Bonus: %d \n ", 0);
            in.close();

        }

    }
}