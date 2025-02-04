package proje;

public class BankaHesap {
    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi = 0;
    private static int tumHesapSayisi = 0;
    private static int operasyonSayisi = 0;

    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi += hesapBakiye;
        tumHesapSayisi++;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void kiyasla(BankaHesap kiyaslanacakHesap) {
        if (this.hesapBakiye < kiyaslanacakHesap.getHesapBakiye()) {
            System.out.println(this.hesapNo + " nolu kişinin parası " + kiyaslanacakHesap.getHesapNo() + " nolu kişinin parasından azdır");
        } else if (this.hesapBakiye > kiyaslanacakHesap.getHesapBakiye()) {
            System.out.println(this.hesapNo + " nolu kişinin parası " + kiyaslanacakHesap.getHesapNo() + " nolu kişinin parasından çoktur");
        } else {
            System.out.println(this.hesapNo + " nolu kişinin parası " + kiyaslanacakHesap.getHesapNo() + " nolu kişinin parasına eşittir");
        }
    }

    public void paraYatir(int paraMiktari) {
        this.hesapBakiye += paraMiktari;
        operasyonSayisi++;
    }

    public void paraCek(int paraMiktari) {
        if (this.hesapBakiye >= paraMiktari) {
            this.hesapBakiye -= paraMiktari;
            operasyonSayisi++;
            tumBankaBakiyesi -= paraMiktari;
        } else {
            System.out.println("Hesabınızda yeterli para yok");
        }
    }

    public static void bankaOzetiGoster() {
        System.out.println("Bankadaki hesap sayısı: " + tumHesapSayisi);
        System.out.println("Bankadaki toplam para: " + tumBankaBakiyesi);
        System.out.println("Bankada yapılan tüm operasyonların sayısı: " + operasyonSayisi);
    }
}
