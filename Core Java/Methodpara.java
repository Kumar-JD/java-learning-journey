class Ex{
	
	int a,b;
	
	//methode with no paramters
	void add(){
		System.out.println("Addition of two numbers : "+(a+b));
		
	}
	
	//method with paramters
	//a,b predefine chysthay we go error
	void mul(int a, int b){
		System.out.println("multipication of two numbers :"+(a*b));
	}
	
	//method with different paramters same name 
	void mul(int a){
		System.out.println("multipication of two nu,bers : "+(a*2));
	
	}
void mul( float a){
	System.out.println("multipication of teo numbers is :"+(a*9));
	
}

	
}
class Methodpara{
	public static void main(String args[]){
		byte n=10,m=50;
		Ex obj=new Ex();
		
		obj.mul(n,m);
		obj.mul(1.5f);  // folat is f evali
	}
}