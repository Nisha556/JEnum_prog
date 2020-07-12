package Enum;

public class AutoBox3 {
public static void main(String ags[])
{
	Integer iOb , iOb2;
	int i
	;
	iOb = 100;
	System.out.println("After ++iOb: " + iOb);
	iOb2 = iOb+(iOb/3);
	++iOb;
	System.out.println("iOb2 after expression: " + iOb2);
	i = iOb + (iOb/3);
	System.out.println("i after expression: " + i);
}
}
