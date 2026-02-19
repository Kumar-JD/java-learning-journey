class Una{
public static void main(String x[]){
	
	byte a=8,b=73;
	byte  c = (a += b);
	
	a++;
    b--;

	System.out.println("this unary minus       : "+(c));
	System.out.println("this is unary increment: "+(a));
	System.out.println("this is unary decrement: "+b);
	
}
}