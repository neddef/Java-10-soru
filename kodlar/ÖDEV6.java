import  java.util.Scanner;

public class ÖDEV6 {
    public static void main ( String[] args ){
        System.out.println("lütfen bir sayi giriniz");
        Scanner  oku= new Scanner( System.in);
        int a= oku.nextInt();

        if (a>0){
            if (a%4==0&&a%6==0 )
                System.out.println("dogru");
             else
                System.out.println("dogru değil");
        }
        else
            System.out.println("lütfen pozitif bir sayı giriniz");

    }
}
