package Praktikum2;

public class MTitik {
	public static void main(String[] args) {
        Titik t1 = new Titik(6, 7);
        Titik t2 = new Titik(3, 6);
        Titik t3 = new Titik(-1, 2);
        System.out.println(String.format("Jumlah Titik: %d", Titik.getCounterTitik()));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki jarak pusat: %.1f", t3.getJarakPusat()));
        t1.refleksiX(t1);
        System.out.println(String.format("Titik t1 telah direfleksi terhadap sumbu X"));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        t1.refleksiY(t1);
        System.out.println(String.format("Titik t1 telah direfleksi terhadap sumbu Y"));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        Titik t4 = t2.getRefleksiX();
        System.out.println(String.format("Titik t4 adalah hasil refleksi titik t2 terhadap sumbu X memiliki absis: %.1f dan ordinat: %.1f", t4.getAbsis(), t4.getOrdinat()));
        Titik t5 = t2.getRefleksiY();
        System.out.println(String.format("Titik t5 adalah hasil refleksi titik t2 terhadap sumbu Y memiliki absis: %.1f dan ordinat: %.1f", t5.getAbsis(), t5.getOrdinat()));
    }
}
