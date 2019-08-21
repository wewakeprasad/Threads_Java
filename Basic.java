
/*class myTask 
{
	void print()
	{
		for(int i=1;i<10;i++)
		System.out.println("@@Printed by 2 "+ i);
	}
}*/

//using thread

//programm doesn't run sequentially 

class myTask extends Thread
{
	@Override 
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("@@Printed by 2-- "+i);
	}
}
public class Basic {
	public static void main(String args[])
	{
		System.out.println("Programm Started");
		System.out.println();
		//if first task is very large,app may crash
		myTask obj=new myTask();
		obj.start();
		//if first task is very large ,it may not happen
		for(int i=1;i<=10;i++)
		{
			System.out.println("^^Printed by 1-- "+i);
		}
		System.out.println();
		System.out.println("Programm Ended");
	}

}
