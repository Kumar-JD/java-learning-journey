class Ex{
	
	int a,b;
	void add()//method without paramter add(int a, int b)
	{
		System.out.println("additio of two numbers : "+(a+b));
	}
}

class Methodex{
	public static void main(String args[]){
		Ex obj =new Ex();
		obj.a=10;
		obj.b=20;
		
		//calling method 
		obj.add();
		
		//call with paramter without no paramter function or method is got error no arruguments 
		//obj.add(5,7);
		
	}
	
}