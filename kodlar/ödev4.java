import java.util.Scanner;

public class ödev4 {
public static void main ( String[] args){
    /*bir ATM makinesini simüle eden eden bir yazılım modeli tasalayacağız
    burada kullancıdan banka kartını ve şifreyi girmesini isteniyor

    doğru bir şifreyi girerse, kullancıya mevcüt seçenekler sunacaktır*/


    Scanner OKU=new Scanner(System.in);
    System.out.println("bankamıza hoş geldiniz");
    System.out.println("----------------------");
    System.out.println("lütfen kartınızı giriniz");
    System.out.println("bilgiler okununluyor........");
    int  debolanmış_şifre= 123456;
    double mevcüt_paranız= 1000;
    System.out.println("lütfen şifreyi giriniz");
    int kullanıcı_şifre;
    kullanıcı_şifre= OKU.nextInt();

    while (debolanmış_şifre!=kullanıcı_şifre)
    {
        System.out.println("lütfen dogru bir şifreyi gieiniz");
        kullanıcı_şifre= OKU.nextInt();
    }
    System.out.println("lütfen sizi hizmet etmek için bir rakam giriniz ");
    System.out.println("1- kartta bulunan para" );
    System.out.println("2- para çekmek için ");
    System.out.println("3- para yatırmak için ");
    System.out.println("4- çıkış için ");

    int ibo ; double amount , yatırılan;
    ibo = OKU.nextInt();
    switch (ibo){

        case 1:
        {
            System.out.println("kartta bulunan para :" +mevcüt_paranız);
            break;
        }
        case 2:{
            System.out.println("çekmek istediniz miktar ne kada ");
        amount= OKU.nextDouble();
        mevcüt_paranız=mevcüt_paranız-amount;
            System.out.println("kalan paranız : "+mevcüt_paranız);
            break;
    }
    case 3: {
        System.out.println("yatırmak istediniz miktar ne kada ");
        yatırılan  = OKU.nextDouble();
        mevcüt_paranız = mevcüt_paranız +yatırılan;
        System.out.println("yeni kalan  paranız : " + mevcüt_paranız);
        break;
    }
        case 4: {
            System.out.println("bizi tercih ettiniz için teşekür ederiz  ");

            break;
        }
        default:
            System.out.println("lütfen doğru bir seçenek giriniz ");



}
}}
