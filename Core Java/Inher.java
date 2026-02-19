class A{
	int a;
	void hello(){
		System.out.println("hello from super class");
		
	}
	A(){
		a=10;
	}
	
}
class B extends A{
	int b;
	void add(){
	System.out.println("Addition of Two Number : "+(a+b));
}
}
class Inher{
	public static void main(String args[]){
		
	B obj=new B(); // low level ki manam object create chyali 
	
	// obj.a=100;
	obj.b=10;
	obj.hello();
	obj.add();
}
}