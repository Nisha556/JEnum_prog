package Enum;

enum Apple2{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(20), Cortland(80);
	private int price;
	Apple2 (int p)
	{
		price = p;
	}
		int getPrice()
		{
			return price;
			
		}	}

public class EnumDemo2 {
	public static void main(String ags[])
	{
		Apple2 ap;
		System.out.println("Winesap cost " + Apple2.Winesap.getPrice() +" cents. \n");
		System.out.println("All apple price :");
		for(Apple2 a : Apple2.values())
			System.out.println(a + " cost " +a.getPrice() +  " cents");
		
		
	}

}
