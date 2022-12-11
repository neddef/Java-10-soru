import java.util.Scanner;

public class ödev9 {
    public static void main (String[] args){
        // n sayısına kadar sayıların toplamı
        Scanner OKU= new Scanner(System.in);
        System.out.println("n sayısı girin ");
        int n= OKU.nextInt();
        int toplam =0;

        for (int i=1 ; i<=n; i++){
            toplam=toplam+i;
        }
        System.out.println("1-"+n+"arasındaki sayıların toplamı="+toplam);
    }
}
