class Student{
	//instance varible creation
    String name;
    int age;

    //instance method
    void display(){
	System.out.println("student name is : "+name);
	System.out.println("student age is  : "+age);
	}
}
class Cobj{
	public static void main(String args[]){
		System.out.println("--Class and Objects");
		
		//create object
		Student s1=new Student();
		
		//insert values into instance varibles
		s1.name="kumar";
		s1.age=23;
		
		//call the function
		s1.display();
	}
}