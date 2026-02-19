class Strsre{
	public static void main(String args[]){
		String a="Today is great day today i practice java , on this day ";
		
		//this contains() method i love it we can check anything we want in our string use this 
		System.out.println("i try find day in my Staring-----: "+a.contains("day"));
		
		//case sensitive on this startsWith() function aslo so useful to check starting text in string 
		System.out.println("check the correct starting-------: "+a.startsWith("today"));//Today-true
		
		
		System.out.println("check the starting with number---: "+a.startsWith("great",9));//9 is exact index of string
		
		System.out.println("checking end with java or not----: "+a.endsWith("java"));//whitespace aslo sensitive
		
		//indexOf(int ch)
		System.out.println(" j character index  number-------: "+a.indexOf('j'));
		
		//indexOf(String str)
		System.out.println("find is string use indexof()---------: "+a.indexOf("is"));
		
		//indexOf(String str, int fromIndex)
		System.out.println("i am sure about this topic-----------: "+a.indexOf("day",2));// i didnt understand this 
		
		//lastIndexOf(String str)
		//output is 48 you know why in our string 48 index this lo "is"
		System.out.println("substring identify and end of string-: "+a.lastIndexOf("is"));
		
		//lastIndexOf(String str, int fromIndex)
		//i am not sure about this 
		System.out.println("i am not sure about this-------------: "+a.lastIndexOf("is",1));
	}
}