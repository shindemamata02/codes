import java.io.*;

public class CmdLineAdd
{
	public static void main(String args[]) throws Exception
	{
		int a = Integer.parseInt(args[0]);
	
		int b = Integer.parseInt(args[1]);
	
		int c = a + b;

		System.out.println("addition of command line arguments is :" +c);
	}
}
