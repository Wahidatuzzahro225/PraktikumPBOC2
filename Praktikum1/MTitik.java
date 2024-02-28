package Praktikum1;

public class MTitik {
	public static void main(String[] args) {
		
        Titik t1 = new Titik(3, 2);
        Titik t2 = new Titik(3, 1);
        Titik t3 = new Titik(-5, 7);
        System.out.println(String.format("Jumlah Titik: %d", Titik.getCounterTitik()));
        System.out.println(String.format("Titik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t2 memiliki absis: %.1f dan ordinat: %.1f", t2.getAbsis(), t2.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki absis: %.1f dan ordinat: %.1f", t3.getAbsis(), t3.getOrdinat()));
    }
}
