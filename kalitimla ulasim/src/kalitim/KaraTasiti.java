package kalitim;

public class KaraTasiti extends Tasit {

    public KaraTasiti() {
        System.out.println("KaraTasiti sınıfının kurucusu");
    }
    protected int tekerlekSayisi;//sınıf dısında kullanilamaz cünkü private

    public int getTekerlekSayisi() {//public oldugu için dısarı aktarıla bilir ama set(değiştirlemez) o hak yok
        return this.tekerlekSayisi;

    }

    public int setTekerlekSayisi(int TS) {
        this.tekerlekSayisi = TS;
        return 0;
    }

}
