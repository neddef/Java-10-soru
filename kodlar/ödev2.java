//AD SOYAD: İBRAHİM NEDDEF
//FAKÜLTE : TEKNOLOJİ FAK.
//BÖLÜM : YAZILIM MÜHENDİSLİGİ

import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        //taksimetreS

        Scanner OKU=new Scanner(System.in);
        System.out.println(" km verisini giriniz");
        double km= OKU.nextDouble();
        double ücret =10+(km*2.20);

        if (ücret<20)
            ücret=20;
        System.out.println("taksimetre :" +ücret);


    }
}