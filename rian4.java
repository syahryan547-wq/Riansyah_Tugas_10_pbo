class Produk2 {
    protected String judul;
    protected String penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

class Komik2 extends Produk2 {
    Komik2(String judul, String penulis) {
        super(judul, penulis);
    }

    void tampil() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

public class rian4 {
    public static void main(String[] args) {
        Komik2 komik = new Komik2("Naruto", "Masashi Kishimoto");
        komik.tampil();
    }
}