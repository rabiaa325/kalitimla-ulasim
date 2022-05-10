package javaapplication9;

public class A {

    private int olguDegiskeni;
    private static int sinifDegiskeni;

    public int getOlguDegiskeni() {
        return olguDegiskeni;
    }

    public void olguDegiskenineEkle(int sayi) {
        olguDegiskeni += sayi;
    }

    public static void sinifDegiskenineEkle(int sayi) {
        sinifDegiskeni += sayi;
    }

    public static int getSinifDegiskeni() {
        return sinifDegiskeni;
    }
}

