import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vvedite kol-vo chisel: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();                        //запрос количества вводимых чисел

        System.out.println("Vvedite chisla: ");
        int[] arrayList = new int[number];                 //регистрация массива для вводимых чисел
        for (int i = 0; i < arrayList.length; i++) {        //цикл количества запусков скана вводимых чисел
            arrayList[i] = scan.nextInt();

        }

        String lengthStr = String.valueOf(arrayList[0]);     //Получаем значение первого элемента массива в String
        int line;
       // int arr = arrayList.length;
        int min = lengthStr.length();                       //принимает длину первого значение для дальнейшего сравнения
        //int max = 1;
        for (int len = 0; len < arrayList.length; len++) {                       //цикл сравнения всех элементов массива с min и max
            lengthStr = String.valueOf(len);
            line = lengthStr.length();
            if (line < min) {
                //    min = line;
                arrayList[len] = arrayList[String.valueOf()];
                len++;
            }


           /* if (line > max) {
                max = line;
            }*/
        }
        String intArrayStr = Arrays.toString(arrayList);
            System.out.println("Minimum = " + intArrayStr);
            //System.out.println("Maximum = " + max);
        }
    }

