abstract class Kendaraan {
    abstract void informasi();
}

class Mobil extends Kendaraan {
    String nama, jenis;

    Mobil(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("Mobil");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class Pesawat extends Kendaraan {
    String nama, jenis;

    Pesawat(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("Pesawat");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class KapalLaut extends Kendaraan {
    String nama, jenis;

    KapalLaut(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi() {
        System.out.println("Kapal Laut");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

public class rian7 {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Avanza", "Darat");
        Kendaraan k2 = new Pesawat("Boeing", "Udara");
        Kendaraan k3 = new KapalLaut("Pelni", "Laut");

        k1.informasi();
        k2.informasi();
        k3.informasi();
    }
}