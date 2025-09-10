import java.util.Scanner;

public class Ruin {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Value for start amount: ");
                int startAmount = in.nextInt();
                System.out.println("Value for win chance: ");
                double winChance = in.nextDouble();
                System.out.println("Value for win limit: ");
                int winLimit = in.nextInt();
                System.out.println("Value for total simulations: ");
                int totalSimulations = in.nextInt();

                for (int i = 0; i < totalSimulations; i++) {
                        int money = startAmount;
                        while (money > 0 && money < winLimit) {
                                double a = Math.random();
                                if (a < winChance) {
                                        System.out.println(money);
                                        money++;
                                } else {
                                        System.out.println(money);
                                        money--;
                                }
        
                        }

                        if (money == 0) {
                                System.out.println ("You lost!");
                        }
                        if (money == winLimit) {
                                System.out.println ("You won!");
                        }
                }
                
        }


}
