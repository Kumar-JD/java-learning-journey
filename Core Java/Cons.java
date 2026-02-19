class Jd{
	String Name;
	
	Jd()// constracter with no parameters
	{
		Name="kumarjd";
		System.out.println(Name);
		
		
	}
}


class Cons{
	public static void main(String args[]){
		
		Jd obj= new Jd();// this not only create aa object it was aslo include the calling the Constracter
		
		// if we use the constracter no need assgine the values  obj.Name="kumarjd";
			
		
		
	}
}