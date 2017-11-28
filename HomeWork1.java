package by.itacademy.HomeWork.HomeWork1;

import java.util.Scanner;

public class HomeWork1 {
//     Первое ДЗ за первое занятие
    public static void main(String[] args) {

        String string = "MARVEL is more much interesting than the DC";
        System.out.println(string);

        String string1 = "MARVEL is more much interesting";
        String string2 = "than the DC";
        System.out.println(string1 + " " + string2);

    }
    // Второе ДЗ за первое занятие
    public static void getMean(int[] args) {
        int a = 27;
        int b = a / 3;
        if (b == 9) {
            System.out.println("последняя цифра числа семерка");
        } else {
            System.out.println("последняя цифра числа не является семеркой");
        }
    }


    // Третье ДЗ за первое занятие
    public static void getSqr(String [] args){
        int h = 5;
        int l = 10;
        int sqrSquare = h*l;

        int r = 6;
        int sqrCircle = r*r;

        if (sqrSquare <= sqrCircle){
            System.out.println("отверстие полностью закроет круглой картонкой");
        } else {
            System.out.println("отверстие не закроет круглой картонкой");
        }
    }


    // Четвертое ДЗ за первое занятие
    public static void main(int[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur money, example 1 2 3......");
        int money = scanner.nextInt();

        if (money == 1) {
            System.out.print(money + " " + "рубль");
        } else if (money < 5 && money > 1) {
            System.out.print(money + " " + "рубля");
        } else if (money > 5) {
            System.out.print(money +  " " + "рублей");
        }

    }

    // Пятое ДЗ за первое занятие
    public static void getNumber(String[] args) {

        String[] a = {"? ? ? # # #"};
        System.out.println("исходное значение" + " " + a);

        for ( int i = 0; i < a.length; i ++);

    }

}





