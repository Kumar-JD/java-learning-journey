 import java.util.*;
 abstract class Cgovt{
	
	abstract void action();//abstract	method
	
	void Hello()//concreate method
	{
		System.out.println("Hello from Central govt");
	}
}
class Ap extends Cgovt{
	void action()//abstract methods we have to write open and close in sub class
	{
		System.out.println("From Ap no rain Effect");
	
	}
	
}
class Tg extends Cgovt{
	void action(){
		System.out.println("From Tg no rain Effect");
	
	}
	
}

class Abstracts{
	public static void main(String args[]){
		Ap obj= new Ap();
		obj.action();
		
		
		Tg obj1= new Tg();
		obj1.action();
		
		
	}
	
}