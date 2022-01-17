package githubPatika;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        //Yarıçap ve merkez açı değişkenlerimizi tanımlayalım
        double r,a, pi = 3.14;

        //Scanner sınıfımızı tanımlayalım
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açıyı giriniz: ");
        a = input.nextDouble();

        //Alanı hesaplayıp ekrana bastıralım
        double alan = pi*r*r*a/360;
        System.out.println("Dairenin alanı: " + alan);
    }
}
