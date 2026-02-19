class Strcon{
	public static void main(String args[]){
		String a ="Hello";
		String b ="world";
		String c ="hello";
		
		//compare the both string use this .equals method
		System.out.println("both string are equal or not-----------: "+a.equals(b));
		
		//compare without charcter comparition
		System.out.println("compare both string are equal ot not --: "+a.equalsIgnoreCase(c));
		
		System.out.println("use the compareTo() method-------------: "+a.compareTo(b));
		
		System.out.println("use .compareToIgnoreCase() method------: "+a.compareToIgnoreCase(b));
		
		System.out.println("use contentEquals() method-------------: "+a.contentEquals(c));
		
		//regionMatches(...) i dont aware at this time 
		
	}
}