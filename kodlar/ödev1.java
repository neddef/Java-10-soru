
import java.util.Scanner;

public class ödev1{
    public static void main (String[] args){
        // ilgli numara kelime öbeği kullanarak mevsimler kullancıya göstercektir
        Scanner oku=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int a= oku.nextInt();

        switch (a){
            case 1:
                System.out.println("yaz");
            break;
            case 2:
                System.out.println("son bahar");
            break;
            case 3:
                System.out.println("kış");
            break;
            case 4:
                System.out.println("ilk bahar");
            break;
            default:
                System.out.println("lütfen geçerli sayı giriniz 1-4 arası");

        }






    }
}
