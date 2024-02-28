package Praktikum2;

public class MGaris {
	public static void main(String[] args) {
		Garis g1 = new Garis(new Titik(-5, 6), new Titik(4, -2));
        System.out.printf("Titik 1 pada garis 1 berada pada koordinat (%.2f, %.2f)\n",g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat());
        System.out.printf("Titik 2 pada garis 1 berada pada koordinat (%.2f, %.2f)\n",g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());
        System.out.printf("Panjang garis 1: %f\n", g1.getPanjang());
        System.out.printf("Gradien garis 1: %f\n", g1.getGradien());

        Garis g2 = g1.getRefleksiY();
        System.out.printf("Titik 1 pada garis 2 berada pada koordinat (%.2f, %.2f)\n",g2.getTitikAwal().getAbsis(), g2.getTitikAwal().getOrdinat());
        System.out.printf("Titik 2 pada garis 2 berada pada koordinat (%.2f, %.2f)\n",g2.getTitikAkhir().getAbsis(), g2.getTitikAkhir().getOrdinat());
        System.out.printf("Panjang garis 2: %f\n", g2.getPanjang());
        System.out.printf("Gradien garis 2: %f\n", g2.getGradien());
        System.out.printf("Apakah garis 1 dan garis 2 tegak lurus: %b\n", g1.isTegakLurus(g2));

        Garis g3 = new Garis(new Titik(-2, 5), new Titik(2, 5));
        Garis g4 = new Garis(new Titik(5, 1), new Titik(5, 7));
        System.out.printf("Apakah garis 3 dan garis 4 tegak lurus: %b\n", g3.isTegakLurus(g4));
}
}
