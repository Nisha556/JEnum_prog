package Enum;
enum Apple {
	Jonathan, GoldenDel,RedDel,Winesap, Cortland
}
public class EnumDemo {
public static void main(String args[])
{
	Apple ap;
	ap = Apple.RedDel;
	System.out.println("value of apple  " +ap);
	System.out.println();
	ap = Apple.GoldenDel;
	if(ap == Apple.GoldenDel)
		System.out.println("ap contains GoldenDel.");
switch (ap)
{
case Jonathan:
	System.out.println("Jonathan is red");
	break;
case GoldenDel:
	System.out.println("Golden Delicious is yellow");
	break;
case RedDel :
	System.out.println("Red Delicious is red");
case Winesap :
	System.out.println("Winesap is red");
case Cortland :
	System.out.println("Cotland is red");
}
}
}
