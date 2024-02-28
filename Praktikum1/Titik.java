package Praktikum1;

public class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double o){
		this.absis = a;
		this.ordinat = o;
		counterTitik++;
	}
	
	void setAbsis(double a){
		this.absis = a;
		
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	static int getCounterTitik() {
		return counterTitik;
	}
	
	
}
