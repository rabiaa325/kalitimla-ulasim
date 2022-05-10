package kalitim;

public class MotorsuzKaraTasiti extends KaraTasiti {

    // sınıf tanımı bu örnek için boş bırakılmıştır
    public MotorsuzKaraTasiti() {
        System.out.println("MotorsuzKaraTasiti sınıfının kurucusu");
    }

     public void tekerlekSayisiNiteligineErisim() {
        tekerlekSayisi = 2; // ! Derleme hatası
    }
}
