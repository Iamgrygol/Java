
public class czas {

	private int hours;
	private int minuts;
	
	public czas()
	{
		this(0,0);
	}
	
	public czas(int hours, int minuts)
	{
		this.hours = hours;
		this.minuts = minuts;
	}
	
	public void wyswietl()
	{
	if(hours < 10 && minuts < 10)
	System.out.println("0" + hours + " : " + "0" + minuts );
	else
	System.out.println(hours + " : " + minuts);
	}
	
	public czas Dodaj (czas dodaj)
	{
		return doing (dodaj.hours, dodaj.minuts);
	}
	
	public czas odejmij (czas odejmij)
	{
		return doing (-odejmij.hours, -odejmij.minuts);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
