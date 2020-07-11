package Enum;
enum dir {
	EAST,WEST, NORTH, SOUTH
}
public class Direction {
	public static void main(String args[])
	{
		
	
dir d1 = dir.NORTH;
if(d1 == dir.EAST)
{
	System.out.println("DIRECTION : EAST");
	
}
else if(d1==dir.WEST)
{
	System.out.println("DIRECTION : WEST");
	
}
else if (d1 == dir.NORTH)
{
	System.out.println("DIRECTION : NORTH");
	
}
else {
	System.out.println("DIRECION : SOUTH");
	
}

}
}
