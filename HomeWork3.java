package by.itacademy.HomeWork.HomeWork3;
import java.util.Arrays;
import java.util.Scanner;
public class HomeWork3 {
    // The first task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur value, like 1 2 3......");
        String s = sc.nextLine();
        String[] c = s.split("\\s+");
        int size = c.length;
        int[] b =new int[size];
        for (int m = 0; m < b.length; m++) {
            b[m] = Integer.parseInt(c[m]);
        }
        int temp=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-i-1; j++) {
                if(b[j]>b[j+1]){
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }

        for(int n = 0; n < b.length ; n++){
            System.out.print(b[n]);
            System.out.print(' ');
        }
        sc.close();
    }

}

