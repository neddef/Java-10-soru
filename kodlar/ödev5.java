import java.util.Scanner;

public class ödev5 {
    public static void main ( String[] args){
        Scanner giriş=new Scanner(System.in);
        double d1,d2,d3,d4,d5 ;
        System.out.println(" lütfen beş değer giriniz ");
        d1= giriş.nextDouble();
        d2= giriş.nextDouble();
        d3= giriş.nextDouble();
        d4= giriş.nextDouble();
        d5= giriş.nextDouble();

        double ort = ( d1+d2+d3+d4+d5)/5;
        System.out.println(" ort. ="+ort);

        if (ort>90)
            System.out.println("A+");
        else if  ( ort >80)
            System.out.println("B");
        else if  ( ort >70)
            System.out.println("C");
        else if  ( ort >60)
            System.out.println("D");
        else
            System.out.println("BAŞARSIZDIR");
    }
}
