
import java.util.Scanner;
public class ÖDEV11 {
    public static void main(String[]args){
        //0 ile 1000 arasındaki fibonacci sayılarını bulan program yazınız
        int a=0;
        int b=1;
        int c=0;

        do { c=a+b;
            if (c>1000)break;
            System.out.println(c+"-");
        a=b;
        b=c;
        }
   while (c<1000);


    }

}
