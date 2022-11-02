import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int sayi,us;
        int total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        sayi = inp.nextInt();
        System.out.println("Us giriniz :");
        us = inp.nextInt();


        for (int i = 0;i<=us;i++) {
            total = total * us;
            System.out.println(total);
        }
    }

}
