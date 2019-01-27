package zad9;

public class zad_9 {

	public static void main(String[] args) {
		int pKola, oKola, pKuli, oKuli;
		int r = 6;
		pKola = (int) (2*Math.PI * r);
		oKola = (int) (Math.PI * r);
		pKuli = (int) (4* Math.PI * r*r);
		oKuli = (int) (4/3*(Math.PI*r*r*r));
		
		System.out.println("Pole kola: " + pKola);
		System.out.println("Obwod kola: " + oKola);
		System.out.println("Powierzchnia kuli: " + pKuli);
		System.out.println("Objetosc kuli: " + oKuli);

	}
}
