class Strfun{
	public static void main(String args[]){
		String s ="  Hello welcome ";
		String s1 =" friends ";
		
		//addition of two strings or concat of Two String
		System.out.println("String concat------------------: "+(s+s1));
		
		System.out.println("index 5 which character is-----: "+s.charAt(5));
		
		//String s1 length use .length() method
		System.out.println("Length of the String .length()-: "+s.length());
		
		//We Are checking the String is empty or not
		System.out.println("use this .isEmpty()------------: "+s1.isEmpty());
		
		//java 11 has isBlank()
		System.out.println("checking String .isBlank()-----: "+s.isBlank());
		
		//if we use trim() remove the space in starting 
		//compare in output screen line 1 vs 5
		System.out.println("original String is ------------: "+s);
		System.out.println("remove space use .trim()-------: "+s.trim());
		
		
		//strip()  remove spaces in  ends of the string.
		System.out.println("original String is ------------: "+s);
		System.out.println("remove space use .strip()------: "+s.strip());
		
		//stripTrailing(): Removes only the trailing (right-side) whitespace.
		System.out.println("original String is ------------: "+s);
		System.out.println("remove space .stripLeading()---: "+s.stripLeading());
		
		//stripLeading(): Removes only leading (left-side) whitespace. 
		System.out.println("original String is ------------: "+s);
		System.out.println("remove space .stripTrailing()--: "+s.stripTrailing());
	}
}