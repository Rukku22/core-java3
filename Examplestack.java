package project4;
import java.util.Stack;
public class Examplestack {

	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();  

		boolean result=st.empty();
		System.out.println(result);
		st.push(45);
		st.push(56);
		st.pop();
		st.peek();
		System.out.println(st);
	
		result=st.empty();
		System.out.println(result);
	}
	
		




	}


