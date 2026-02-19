class StrBuf{
	public static void main(String args[]){
		StringBuffer s= new StringBuffer("Failure will never overtake me if my determination to succeed is strong enough");
		System.out.println(s);
		
		//Add some text to our String
		
		System.out.println(s.append(" am i corect"));
		
		//insert index 0 lo oka text ni change chyali 
		System.out.println(s.insert(0," ! "));
		
		System.out.println(s.length());
		
		System.out.println(s.capacity());
		
		s.ensureCapacity(98);// ( capacity x 2 )+2 
		
		System.out.println(s.capacity());
		
	}
}