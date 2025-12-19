class Produk2 {
    protected String judul;
    protected String penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

class Komik2 extends Produk2 {
    int jumlahHalaman;

    Komik2(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() +
                ", Jumlah Halaman: " + jumlahHalaman;
    }
}

class Games2 extends Produk2 {
    int waktuMain;

    Games2(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() +
                ", Waktu Main: " + waktuMain + " jam";
    }
}

public class rian3 {
    public static void main(String[] args) {
        Produk2 p1 = new Komik2("One Piece", "Eiichiro Oda", 200);
        Produk2 p2 = new Games2("Minecraft", "Mojang", 50);

        System.out.println(p1.getInfoProduk());
        System.out.println(p2.getInfoProduk());
    }
}