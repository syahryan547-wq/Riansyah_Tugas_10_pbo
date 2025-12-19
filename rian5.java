class Produk2 {
    protected String judul;
    protected String penulis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}

public class rian5 {
    public static void main(String[] args) {
        Produk2 p = new Produk2();
        p.setJudul("Attack on Titan");
        p.setPenulis("Hajime Isayama");

        System.out.println("Judul: " + p.getJudul());
        System.out.println("Penulis: " + p.getPenulis());
    }
}