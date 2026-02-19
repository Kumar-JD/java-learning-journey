class Strs{
	public static void main(String args[]){
		//type-1
		String s = "1.Kumar";
		System.out.println(s);
		
		//type-2
		String s2 = new String("2.Kumar");
		System.out.println(s2);
		
		//type-3
		char a[] ={'k','u','m','a','r'}; //string constracter
		String s3 = new String(a);
		System.out.println("3."+s3);
	}
}