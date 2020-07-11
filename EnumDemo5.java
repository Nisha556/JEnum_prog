package Enum;
enum Apple5 {
	Jonathan, GoldenDel , RedDel, Winesap, Cortland
}
public class EnumDemo5 {
	public static void main(String args[])
	{
		Apple5 ap, ap2, ap3;
		System.out.println("Here are all apple constants" +
				" and their ordinal values: ");
		for(Apple5 a : Apple5.values())
			System.out.println(a + " " + a.ordinal());
		ap = Apple5.RedDel;
		ap2 = Apple5.GoldenDel;
		ap3 = Apple5.RedDel;
		if(ap.compareTo(ap2)<0 )
			System.out.println(ap + "comes before" +ap2);
		if(ap.compareTo(ap2)>0)
			System.out.println(ap2 + "comes before " +ap);
		if(ap.compareTo(ap3)==0 )
			System.out.println(ap + " equals" +ap3);
		System.out.println();
		if(ap.equals(ap3))
			System.out.println(ap + "equals"+ap3);
		if(ap==ap3)
			System.out.println(ap + "==" +ap3);
		
	}

}
