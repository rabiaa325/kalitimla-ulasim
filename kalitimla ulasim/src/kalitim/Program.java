package kalitim;

public class Program {

    public static void main(String[] args) {
        System.out.print("ben üsteyim\n");//kurucu fonksiyonun üstünde ondan ilk bu çalışır
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.setTekerlekSayisi( bisiklet.getTekerlekSayisi()+5);
         //bisiklet.tekerlekSayisi=2;//protected olduğundan erişilebidi private oldugunda erişilmiyo
         System.out.print("ben alttayım\n");//kurucu fonksiyonun altında tek tek sınıfları dolaşır sırasıyla yazar
          //bundan sonrakiler işlem gitmesin diye silmedim
          
        bisiklet.ilerle(5);
        System.out.print("Bisikletin " + bisiklet.getTekerlekSayisi() + " tekerleği var.");
       
    }

}
