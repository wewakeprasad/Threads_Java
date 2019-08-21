
public class RealWordMultiThread{

public static class Greet extends Thread{
	private String country;
	public Greet(String country)
	{
		super(country+" thread");
		this.country=country;
	}
	public void run()
	{
		System.out.println("Hello "+country+" ! ");
	}
}

	public static void main(String[] args) 
	{
		String countries []={"France","India","China","USA","Germany"};

		for(String country:countries)
		{
			new Greet(country).start();
		}
	}
}
