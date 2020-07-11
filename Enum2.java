package Enum;

enum Apple1  {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
	
}
public class Enum2 {
	public static void main(String args[])
	{
		
	
	Apple1 ap;
	System.out.println("Here are all Apple constants:");
	Apple1 allapples[] = Apple1.values(); //show the value of all Apple
	for(Apple1 a : allapples)
		System.out.println(a);
	System.out.println();
	ap = Apple1.valueOf("Winesap"); //valueOf is use for String value 
	System.out.println("ap contains " +ap);
	
	}
}
