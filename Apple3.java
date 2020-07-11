package Enum;

public enum Apple3 {
	Jonathan(10), GoldenDel, RedDel, Winesap(15), Cortland(8);
private int price;
Apple3(int p)
{
	price =p;
	
}
Apple3()
{
	price = -1;
	
}
int getPrice()
{
	return price;
	
}
}
class EnumDemo4 {
public static void main(String args[])
{
Apple3 ap;
//Display price of Winesap.
System.out.println("Winesap costs " +
Apple3.Winesap.getPrice() +
" cents.\n");
//Display all apples and prices.
System.out.println("All apple prices:");
for(Apple3 a : Apple3.values())
System.out.println(a + " costs " + a.getPrice() +
" cents.");
}
}
