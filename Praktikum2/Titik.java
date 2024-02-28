package Praktikum2;

public class Titik {
		private double absis;
		private double ordinat;
		private static int counterTitik;
		
		public Titik(){
			absis = 0;
			ordinat = 0;
			counterTitik++;
		}
		
		public Titik(double a, double o){
			this.absis = a;
			this.ordinat = o;
			counterTitik++;
		}
		
		public void setAbsis(double a){
			this.absis = a;
			
		}
		
		public void setOrdinat(double o){
			this.ordinat = o;
			
		}
		
		public double getAbsis(){
			return absis;
		}
		
		public double getOrdinat() {
			return ordinat;
		}
		
		public static int getCounterTitik() {
			return counterTitik;
		}
		
		public double getJarakPusat() {
			return Math.sqrt(absis*absis + ordinat*ordinat);
		}
		
		public void refleksiX(Titik t) {
			t.ordinat = ordinat*(-1);
		}
		
		public void refleksiY(Titik t) {
			t.absis = absis*(-1);
		}
		
		public Titik getRefleksiX() {
			return new Titik(this.absis*(-1),this.ordinat);
		}
		
		public Titik getRefleksiY() {
			return new Titik(this.absis*(-1),this.ordinat);
		}
}
