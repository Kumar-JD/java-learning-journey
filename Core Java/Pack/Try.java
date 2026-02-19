/*
package Pack;
import  C:\MyJavaCourse\Core Java\Pack\Pack\Add.*;
public class Try {
	public static void main(String args[]){
		System.out.println("hello wolrd");
		Add obj= new Add();
		obj.add1(5,9);
	}
}
*/

package Pack;

import Pack.Add.*;   // correct import

public class Try {

    public static void main(String args[]) {

        System.out.println("hello world");

        Add obj = new Add();   // create object of Add
        obj.add1(5, 9);        // call method
    }
}
