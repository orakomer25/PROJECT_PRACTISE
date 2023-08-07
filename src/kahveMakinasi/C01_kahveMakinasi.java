package kahveMakinasi;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class C01_kahveMakinasi {
    static String kahveTuru ="";
    static String sekerDurumu="";
    static String sutDurumu="";
    static String boyut="";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Basit bir Kahve makinesi oluşturun.
        1. Şart
        3 çeşit kahvemiz olsun.
                Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        2.Şart
        Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart
        Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.
        Sonuç
        Siparişlerimizi verdik. Son hali görmek istiyoruz.
        konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!

         */
        menu();

    }

    private static void sonuc() {
        System.out.println("KAHVENİZ HAZIRLANIYOR");
        System.out.println();
        System.out.println();
        System.out.println();
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(" "+sutDurumu+"/"+sekerDurumu+"/"+boyut+"/"+kahveTuru+" HAZIR.\n                AFİYET OLSUN...");
            }
        }, 5000); // 5 saniye sonra çalıştır

    }

    private static void boyut() {
        System.out.println("Kahvenizi hangi boyutta istersiniz\n1.Küçük boy\n2.Orta boy\n3.Büyük boy");
        int secim= scanner.nextInt();
        if (secim==1){
            boyut="Küçük boy";
            sonuc();
        } else if (secim==2) {
            boyut="Orta boy";
            sonuc();
        } else if (secim==3) {
            boyut="Büyük boy";
            sonuc();

        } else {
            System.out.println("Hatalı seçim yaptınız.");
            boyut();
        }
    }


    private static void seker() {
        System.out.println("Şeker ister misiniz ? \n1.Evet\n2.Hayır");
        int secim = scanner.nextInt();
        if (secim==1){
            sekerDurumu="Şekerli";
            boyut();
        } else if (secim==2) {
            sekerDurumu="Şekersiz";
            boyut();
        }else {
            System.out.println("Hatalı seçim yaptınız.");
            seker();
        }
    }

    private static void sut() {
        System.out.println("Süt ister misiniz?\n1.Evet\n2.Hayır");
        int secim= scanner.nextInt();
        if (secim==1){
            sutDurumu="Sütlü";
            seker();
        } else if (secim==2) {
            sutDurumu="Sütsüz";
            seker();
        }else {
            System.out.println("Hatalı seçim yaptınız.");
            sut();
        }

    }

    public static  void menu(){
       System.out.println("Hangi Kahveyi istersiniz?");
       System.out.println("1.Türk Kahvesi\n2.Filtre Kahve\n3.Espresso");

        int secim= scanner.nextInt();
        if (secim==1){
            kahveTuru="Türk kahvesi";
            sut();

        } else if (secim==2) {
            kahveTuru="Filtre Kahve";
            sut();

        } else if (secim==3) {
            kahveTuru="Espresso";
            sut();

        }else{
            System.out.println("Hatalı seçim yaptınız.");
            menu();
        }
    }



}
