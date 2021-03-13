import java.util.Scanner;

public class HomeWork16 {
    public static void main (String[] args){

        /*1) Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
        5 4 3 2 1*/

        System.out.println("Задание №1. Необходимо вывести на экран числа от 5 до 1. Результат: ");
        System.out.println("");
        for(int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("");

        /*2) Необходимо вывести на экран таблицу умножения на 3:*/

        System.out.println("");
        System.out.println("Задание №2. Необходимо вывести на экран таблицу умножения на 3:");
        System.out.println("");

        int multiplierFirst = 3;

        for(int multiplierSecond = 0; multiplierSecond <= 9; multiplierSecond++){
            int multiplierResult = multiplierFirst * multiplierSecond;
            System.out.println(multiplierFirst + " * "+ multiplierSecond + " = " + multiplierResult);

        }
        System.out.println("");

       /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
        1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
        Написать двумя способами. If и switch.*/

        System.out.println("");
        System.out.println("\"Задание №3. Способ if:\"");

            System.out.println("Введите число 1, 2 или 3: ");
            Scanner inputFigure = new Scanner(System.in);
            int enteredNumber = inputFigure.nextInt();
            if (enteredNumber == 1){
                System.out.println("Вы ввели число 1");
            } else if(enteredNumber == 2){
                System.out.println("Вы ввели число 2");
            } else if(enteredNumber == 3){
                System.out.println("Вы ввели число 3");
            } else {
                System.out.println("Вы ввели невероное число, допустимые числа: 1, 2, 3");
            }


        System.out.println("");
        System.out.println("\"Задание №3. Способ switch:\"");

            System.out.println("Введите число 1, 2 или 3: ");
            Scanner inputFigureSwitch = new Scanner(System.in);
            int enteredNumberSwitch = inputFigureSwitch.nextInt();

            switch (enteredNumberSwitch){
                case 1:
                    System.out.println ("Вы ввели число 1");
                    break;
                case 2:
                    System.out.println ("Вы ввели число 2");
                    break;
                case 3:
                    System.out.println ("Вы ввели число 3");
                    break;
                default:
                    System.out.println("Вы ввели невероное число, допустимые числа: 1, 2, 3");
            }

        // Найти среднее значение суммы чисел от 1 до 100
        System.out.println();
        System.out.println("Задание №4. Найти среднее значение суммы чисел от 1 до 100.");
        System.out.println();

        double summa = 0;
        for (double number = 0; number <= 100; number++){
            summa = summa + number;
        }

        double averageNumber;
        averageNumber = summa / 100;

        System.out.println("Результат: " + averageNumber);


    }
}
