package proje;

public class Hesaplama {
    public static void main(String[] args) {
        BankaHesap yunus = new BankaHesap(123, 500);
        BankaHesap talha = new BankaHesap(456, 1500);
        BankaHesap tekneci = new BankaHesap(987, 200);

        yunus.paraYatir(500);
        talha.paraCek(600);
        tekneci.paraCek(450);

        BankaHesap.bankaOzetiGoster();

        yunus.kiyasla(tekneci);
        yunus.kiyasla(talha);
    }
}
