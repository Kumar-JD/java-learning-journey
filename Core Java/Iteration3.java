class Iteration3{
	
/* for  : Used when the number of repetitions is known in advance — like looping through all students in a class list.
 while  : Used when repetitions depend on a condition — like retrying login until the correct password is entered.
do-while: Used when the task must run at least once — like showing an ATM menu before asking to exit.
*/
	
	public static void main(String args[]){
		byte c=5;
		do{
			System.out.println(c+"hello");
			c++;
		}while(c<=10);// if condition c>10 this was not correct right but above block was run once beacuse of its do while
	}
}