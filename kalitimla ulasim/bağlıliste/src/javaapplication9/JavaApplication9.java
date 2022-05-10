package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
        A a1 = new A();
        a1.olguDegiskenineEkle(5);
        System.out.println("a1 - Olgu değişkeni: " + a1.getOlguDegiskeni());
        
        A.sinifDegiskenineEkle(7);
        System.out.println("a1 - Sınıf değişkeni: " + a1.getSinifDegiskeni());
        System.out.println("A - Sınıf değişkeni: " + A.getSinifDegiskeni());
        
        A a2 = new A();
        System.out.println("a2 - Sınıf değişkeni: " + a2.getSinifDegiskeni());
        a2.olguDegiskenineEkle(15);
        System.out.println("a2 - Olgu değişkeni: " + a2.getOlguDegiskeni());
        
        A.sinifDegiskenineEkle(27);
        System.out.println("a2 - Sınıf değişkeni: " + a2.getSinifDegiskeni());
        System.out.println("A - Sınıf değişkeni: " + A.getSinifDegiskeni());

      // A.sinifDegiskenineEkle(7);
      //  System.out.println("a1 - Sınıf değişkeni: " + a1.getSinifDegiskeni());
       // System.out.println("A - Sınıf değişkeni: " + A.getSinifDegiskeni());

        //A.sinifDegiskenineEkle(27);
        //System.out.println("a2 - Sınıf değişkeni: "+ a2.getSinifDegiskeni());
       // System.out.println("A - Sınıf değişkeni: " + A.getSinifDegiskeni());
    }

}
