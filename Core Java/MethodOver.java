class A{
	void add(int a, int b){
		System.out.println("this class from A  : "+(a+b));
	}
}

class B extends A{
	void Add(int q , int r){
		super.add(q,r);
		System.out.println("this from class B  : "+(q+r));
	
	}
}
class MethodOver{
	public static void main(String args[]){
		B obj = new B();
		
		
		obj.Add(3,5);
		
	}
}