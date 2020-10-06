import java.util.ArrayList;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        //инициализация количества карт на раздачу и переменных
        final int cardsPerPlayer = 5;
        int players = 0;

        String[] suits = {"Черви", "Бубна", "Трефы", "Пики"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "D", "K", "A"};
        int n = suits.length * rank.length; //кол-во карт

        // верификация введенной переменной
        for (; ; ) {
            System.out.println("Введите кол-во игроков:");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                players = scan.nextInt();
                if (cardsPerPlayer * players <= n) {
                    System.out.println("Проводим вычисления");
                    break;
                } else {
                    if (players == 0 | players <0) {
                        System.out.println("Нету игроков");
                        continue;
                    } else if(players > 6){
                        System.out.println("Слишком многолюдно");
                        continue;
                    }
                }
        } else{
            System.out.println("Вы ввели не число");
            continue;
        }
        }


    }
}
