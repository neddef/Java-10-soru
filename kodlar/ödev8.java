
import java.util.Scanner;
public class ödev8 {
    public static void main(String[] args){
        //vücüt kitle indeksi hesaplama
        Scanner OKU=new Scanner(System.in);
        System.out.println("lütfen boyunuz metre cinsinden giriniz");
        double boy= OKU.nextDouble();

        System.out.println("lütfen kilonuz giriniz");
        double kilo= OKU.nextDouble();

        double indeks= kilo/(boy*boy);
        System.out.println("vücud kitle indeksi ="+indeks);

    }
}
