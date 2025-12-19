abstract class Produk2 {
    protected String judul;
    protected String penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    abstract String getInfoProduk();
}

class Komik2 extends Produk2 {
    Komik2(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    String getInfoProduk() {
        return "Komik: " + judul + ", Penulis: " + penulis;
    }
}

public class rian6 {
    public static void main(String[] args) {
        Produk2 komik = new Komik2("Bleach", "Tite Kubo");
        System.out.println(komik.getInfoProduk());
    }
}