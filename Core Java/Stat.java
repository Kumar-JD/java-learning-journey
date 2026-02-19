class Com{
	String name; //instanace varible
	void weight(int a){
		System.out.println(name+" - with weight of  -"+a);
	}
	static int cl; //static varible
	static void Grade()//static method 
	{
		
		System.out.println("All the studnets are  -"+ cl);
		
	}
}
class Stat{
	public static void main(String args[]){
		//instance varibles reqquired the object
		 Com obj= new Com();
		 obj.name="kumar";
		 obj.weight(54);
		 
		 //static varible and methods we can acceses with class name 
		 Com.cl=17;
		 Com.Grade();
	}
	
}