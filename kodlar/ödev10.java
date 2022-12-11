import java.util.Scanner;
public class ödev10 {
    public static void main(String[] args) {
        //faktöryel heaplama
        Scanner OKU = new Scanner(System.in);
        System.out.println("n sayısı giriniz");
        int n = OKU.nextInt();
        int faktöryel = 1;

        for (int i = 1; i <= n; i++) {
            faktöryel = faktöryel * i;
        }
        System.out.println("sonuç = " + faktöryel);

    }}