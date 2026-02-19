interface A{
	int x = 10;
	
	void show();
	void hello();
}
class B implements A{
	//we have to public all the abstract methods if not make public we have to got error like privilage errors
	public void show(){
		System.out.println(" -- this from class B  --"+x);
		
	}
	public  void hello(){
		System.out.println("-- Hello from class B  --");
	}
}


class Inter{
	public static void main(String args[]){
		B obj = new B();
		obj.show();
		obj.hello();
		
	}
}