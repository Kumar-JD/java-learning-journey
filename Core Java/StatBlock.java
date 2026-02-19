class StatBlock{
	//static main ki mundhu rasina or tharuvatha rasina high priority is static block
	public static void main(String args[]){
		System.out.println(" This Message From main Method");
	}
	static // static block is used to perform any task before the main method 
	{
		
		System.out.println("this message from static block");
		System.out.println(9+10);
		
	}
}