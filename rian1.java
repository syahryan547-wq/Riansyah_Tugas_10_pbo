abstract class Bentuk {
    abstract double luas();
}

class PersegiPanjang extends Bentuk {
    double p, l;

    PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    @Override
    double luas() {
        return p * l;
    }
}

class Segitiga extends Bentuk {
    double a, t;

    Segitiga(double a, double t) {
        this.a = a;
        this.t = t;
    }

    @Override
    double luas() {
        return 0.5 * a * t;
    }
}

class Lingkaran extends Bentuk {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }
}

public class rian1 {
    public static void main(String[] args) {
        Bentuk b1 = new PersegiPanjang(5, 4);
        Bentuk b2 = new Segitiga(6, 3);
        Bentuk b3 = new Lingkaran(7);

        System.out.println("Luas Persegi Panjang : " + b1.luas());
        System.out.println("Luas Segitiga        : " + b2.luas());
        System.out.println("Luas Lingkaran       : " + b3.luas());
    }
}
