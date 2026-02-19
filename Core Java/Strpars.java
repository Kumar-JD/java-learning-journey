import java.util.*;
class Strpars{
	public static void main(String args[]){
		String l="Extraction Access Parsing Data 789 ";
		
		//starting topics of substring
		System.out.println("this is sub string--------------: "+l.substring(10));
		
		System.out.println("this is sub string from 10-15---: "+l.substring(10,17));
		
		System.out.println("this is subSequence-------------: "+l.subSequence(10,17));
		 
		//Arrays.toString without this we got accsi values 
		System.out.println("this rayy "+Arrays.toString(l.toCharArray()));
		
		System.out.println("replace a to o -----------------: "+l.replace('a','o'));
		
		System.out.println("replace data to date -----------: "+l.replace("Data","Date"));
		
		// \\d anty select all digits ani 
		//replace vs replaceAll ki diffence enti anty ,replaceAll lo \d alanti code ni read chysthundhi ,but replace() \d ni kuda text laga chusthundhi 
		System.out.println("in our string masked the numbers----: "+l.replaceAll("\\d","X"));
		
		//string lo vuna a letter chala vune but a vuna first index lo a == m
		System.out.println("replace first letter on our string--: "+l.replaceFirst("a","m"));
		
		//concat(String str) , repeat(int count)
		
		
		System.out.println("make it .toUppercase()--------------: "+l.toUpperCase());
		
		
		System.out.println("make it .toLowercase()--------------: "+l.toLowerCase());
		
		//System.out.println(" %s text %d is for digits---------: "+l.format(stringname,startingname));
		
		System.out.println("checking the entire string matches--: "+l.matches("data"));
		
		//string into array 
		//split(String regex, int limit)
		System.out.println("spli into string into array---------: "+Arrays.toString(l.split(" ")));
		
		System.out.println(l.hashCode());
		
	}
}