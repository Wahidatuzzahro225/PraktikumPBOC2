package Praktikum2;

public class Garis {
	private Titik t1;
	private Titik t2;
	private static int counterGaris;
	
	public Garis() {
		t1 = new Titik(0,0);
		t2 = new Titik(0,0);
		counterGaris++;
	}
	
	public Garis(Titik t1, Titik t2){
		this.t1 = t1;
		this.t2 = t2;
		counterGaris++;
	}
	
	public void setTitikAwal(Titik t1){
		this.t1 = t1;
		
	}
	
	public void setTitikAkhir(Titik t2){
		this.t2 = t2;
		
	}
	
	public Titik getTitikAwal(){
		return t1;
	}
	
	public Titik getTitikAkhir() {
		return t2;
	}
	
	public static int getCounterGaris() {
		return counterGaris;
	}
	
	public double getPanjang() {
		return Math.sqrt(Math.pow((t2.getAbsis()-t1.getAbsis()),2) + (Math.pow(t2.getAbsis()-t1.getOrdinat(),2)));
	}
	
	public double getGradien() {
		return (t2.getOrdinat()-t1.getOrdinat()/t2.getAbsis()-t1.getAbsis());
	}
	
	public Garis getRefleksiY() {
		return new Garis(t1.getRefleksiY(),t2.getRefleksiY());
	}
	
	public boolean isTegakLurus(Garis Garis){
        if (this.t2.getAbsis() == this.t1.getAbsis()){
            return Garis.getTitikAwal().getOrdinat() == Garis.getTitikAkhir().getOrdinat();
        }
        else if (Garis.getTitikAwal().getAbsis() == Garis.getTitikAkhir().getAbsis()){
            return this.t1.getOrdinat() == this.t2.getOrdinat();
        }
        return this.getGradien() * Garis.getGradien() == -1;

    }
}
