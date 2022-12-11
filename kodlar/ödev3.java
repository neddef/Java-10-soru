import java.util.Scanner;
public class ödev3 {
    public static void main(String[] args){
        System.out.println("sıcaklığı kelvin ve fah. cinsinden yazdıran programa hoşgeldinz");
        System.out.println("****************************************************************");
        Scanner giriş=new Scanner(System.in);
        double c = giriş.nextDouble();
        double f,k ;
        k=c+273;
        System.out.println("sıcaklık kelvin cinsinden : " + k);
        f=(9/5)*c+32 ;
        System.out.println("sıcaklık fah. cinsinden : " +f);
    }

}