class A{
	int a,b,c;
	A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	A(){
		
	}
}
class B extends A{
	int d,e;
	B( int d, int e){
		super.(a,b,c); //calling the super classs constrcotr
		this.d=d;
		this.e=e;
	}
	void add(){
		System.out.println(a+b);
	}
}

class Superex2{
	public static void main(String args[]){
		
		B obj= new B(6,7);
		
		obj.add();
		
	}
}