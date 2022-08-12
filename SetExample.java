package project4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String args[]) {
	Set<String>st=new HashSet<String>();
	st.add("ruk");
	st.add( "mus");
	st.add( "mus");
	Iterator itr=st.iterator();
	while(itr.hasNext()) {
		
	
	System.out.println(itr.next());
	
	}
	 
	
}
}