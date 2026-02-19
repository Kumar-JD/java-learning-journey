class A{
	int p =10;
	 void show(){
		 System.out.println("this from class A  :" +p);
		 
	 }
}
class B extends A{
	int q=20;
	int p =50;
	
	void show(){
	System.out.println("P value is  : "+p);
	System.out.println("P value is  : "+super.p);//same name to any varibles vunty ,mari super class vuna varibles ni accese chyadaniki super use chystham
	System.out.println("P value is  : "+this.p);//this current and temprory
	}

}

class Superex{
	public static void main(String args[]){
		B obj = new B();
		obj.show();
		obj.show();
	}
}