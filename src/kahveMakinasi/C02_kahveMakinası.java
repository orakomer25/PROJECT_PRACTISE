package kahveMakinasi;
import java.util.Scanner;
public class C02_kahveMakinası {




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
    static String kahveSecimDurumu="";
    static String sutSecimDurumu="";
    static String sekerSecimDurumu="";
    static String boyutSecimDurumu="";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Şart - Kahve seçimi
        System.out.println("*****************    KAHVE MAKİNESİNE HOŞGELDİNİZ    *****************\n" +
                "LÜTFEN SEÇMEK İSTEDİĞİNİZ KAHVE CİNSİNİ NUMARASINA BASARAK SEÇİNİZ\n" +
                "1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        int secim = scanner.nextInt();
        switch (secim){
            case 1 :{
                System.out.println("TÜRK KAHVESİ SEÇTİNİZ");
                kahveSecimDurumu="Türk Kahvesi";
                break;
            }
            case 2:{
                System.out.println("FİLTRE KAHVE SEÇTİNİZ");
                kahveSecimDurumu="Filtre Kahve";
                break;
            }
            case 3:{
                System.out.println("ESPRESSO SEÇTİNİZ");
                kahveSecimDurumu="Espresso";
                break;
            }
        }
        // 2.Şart
        //  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        System.out.println("Süt eklemek istiyor musunuz? (Evet ise 'E' yi Hayır ise 'H' yi seçiniz)");
        String sutSecim = scanner.next();
        sutSecim =sutSecim.toUpperCase();
        switch (sutSecim){
            case "E":{
                System.out.println("SEÇTİĞİNİZ KAHVEYE SÜT EKLENECEK");
                break;
            }
            case "H":{
                System.out.println("SEÇTİĞİNİZ KAHVEYE SÜT EKLENMEYECEK");
                break;
            }
        }
        if (sutSecim.equals("E")){
            sutSecimDurumu = "sütlü";
        }else {
            sutSecimDurumu="sade";
        }
        //3. Şart
        //  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        //  sorusunu sorsun.
        System.out.println("Şeker ister misiniz ? (Evet ise 'E' yi Hayır ise 'H' yi seçiniz)");
        String sekerSecim = scanner.next();
        sekerSecim =sekerSecim.toUpperCase();
        switch (sekerSecim){
            case "E":{
                System.out.println("SEÇTİĞİNİZ KAHVEYE ŞEKER EKLENECEK");
                break;
            }
            case "H":{
                System.out.println("SEÇTİĞİNİZ KAHVEYE ŞEKER EKLENMEYECEK");
                break;
            }
        }
        //4. Şart
        //  Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        //  sorusunu sorsun.
        System.out.println("Kahveniz hangi boyutta olsun? \n" +
                "Büyük boy ise 'B' ya basınız\n" +
                "Orta boy ise 'O' ya basınız\n" +
                "Küçük boy ise 'K' ya basınız");
        String boyutSecim = scanner.next();
        boyutSecim=boyutSecim.toUpperCase();
        switch (boyutSecim){
            case "B":{
                System.out.println("BÜYÜK BOY KAHVENİZ HAZIRLANIYOR");
                boyutSecimDurumu="Büyük boy";
                break;
            }
            case "O":{
                System.out.println("ORTA BOY KAHVENİZ HAZIRLANIYOR");
                boyutSecimDurumu="Orta boy";
                break;
            }
            case "K":{
                System.out.println("KÜÇÜK BOY KAHVENİZ HAZIRLANIYOR");
                boyutSecimDurumu="Küçük boy";
                break;
            }
        }

        System.out.println(boyutSecimDurumu+" "+sutSecimDurumu+" "+kahveSecimDurumu+" hazırdır.");
    }
}
