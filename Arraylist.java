package project4;

import java.util.*;

public class Arraylist {
	public static void main(String args[]) {
		ArrayList <String> list=new ArrayList<String>();
	list.add( "ruk");
	list.add( "raj");
	list.remove(1);
	list.add( 1,"mus");
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		
		
		
	
	
	System.out.println(itr.next());
	}
}
}
