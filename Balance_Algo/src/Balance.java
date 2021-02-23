import java.util.Stack;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "(([]))";
		
		Stack<Character> stack = new Stack<Character>();
//		System.out.println(input.toCharArray());
		for( char c : input.toCharArray()) {
//			System.out.println(c);
			
			if(c == '(' || c == '[' || c == '{' ) {
				stack.push(c);
//				System.out.println("push");
				continue;
			}
			//System.out.println(stack.peek());
			if(c == ')' && stack.peek() == '(' ){
				stack.pop();
				System.out.println("pop");
//				stack.pop()
				continue;
			}
			if(c == ']' && stack.peek() == '['){
				stack.pop();
				continue;
			}
			if(c == '}' && stack.peek() == '{'){
				stack.pop();
				continue;
			}
			else if(c == ')' || c == ']' || c == '}' ){
				//stack.empty();
				break;
			}
		}
		
		System.out.println("its balance? " + stack.isEmpty());
		System.out.print(stack);
		
		

	}

}
