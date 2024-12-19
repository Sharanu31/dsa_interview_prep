package queue_stack_ds_ques;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		// String s = "{[}";
		String s = "][";
		isValid(s);
	}

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else {
				if (st.isEmpty())
					return false;
				char ch = st.pop();
				if ((c == ')' && ch == '(') || (c == '}' && ch == '{') || (c == ']' && ch == '['))
					continue;
				else
					return false;
			}
		}
		return st.isEmpty();
	}
}
