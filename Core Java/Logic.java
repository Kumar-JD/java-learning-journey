class Logic{

public static void main(String x[]){
	byte a=1,b=7,c=9,d=15;
	if(a < b && b < c)//logical and both condition has to true
	{
		System.out.println("this was on output scrreen that means both condition are correct  ");
	}
	if (a > b || a< b)//logical or is any condition is true its fine
	{
		System.out.println("this logical need any one condition is true this message on output scrren ");
	}
}
}