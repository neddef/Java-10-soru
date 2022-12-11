import java.util.Scanner;
import java.util.concurrent.Callable;

public class ödev7 {
    public static void main(String [] args){
        //şekillerin çeverler ve alanları hesaplayan program
        System.out.println("hoş gldiniz");
        Scanner OKU= new Scanner(System.in);
        System.out.println(" lütfen bir harf seçiniz");
        System.out.println("daire        için  c ");
        System.out.println("daire        için  s");
        System.out.println("dikdörtgen   için  t ");
        System.out.println("ÜÇgen       için  R ");

        String WORK= OKU.next();
        switch (WORK){
            case "c":{
                System.out.println("yarı çap giriniz");
                double r= OKU.nextDouble();
                double alan = 3.14*Math.pow(r,2);
                double çevre = 2*3.14*r;
                System.out.println("alan="+alan);
                System.out.println("çevre="+çevre);
                break;
                }
            case "s":{
                System.out.println("uzunluğu giriniz");
                double L= OKU.nextDouble();
                double alan = Math.pow(L,2);
                double çevre = 4L;
                System.out.println("alan="+alan);
                System.out.println("çevre="+çevre);
                break;
            }
            case "t":{
                System.out.println(" KISA KENAR uzunluğu giriniz");
                double x= OKU.nextDouble();
                System.out.println("uzun kenarı giriniz");
                double y= OKU.nextDouble();
                double alan = x*y;
                double çevre = (x+y)*2;
                System.out.println("alan="+alan);
                System.out.println("çevre="+çevre);
                break;
            }
            case "R":{
                System.out.println("TABANI giriniz");
                double V= OKU.nextDouble();
                System.out.println(" yükseklik giriniz ");
                double h= OKU.nextDouble();
                double alan = (0.5)*V*h;
                System.out.println("alan="+alan);
                break;
        }
            default:
                System.out.println("lütfen geçerli bir sayıgirinz");



    }

}}