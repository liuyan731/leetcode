package ly.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class VaildParentheses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		while (scanner.hasNext()) {
			str = scanner.nextLine();
			System.out.println(isValid(str));
		}
	}

	public static boolean isValid(String s) {
		char[] chars = s.toCharArray();
		Stack<Character> characters = new Stack<Character>();

		characters.push(chars[0]);

		for (int i = 1; i < chars.length; i++) {
			characters.push(chars[i]);
			char peek = characters.peek();
			int peekIndex = characters.size() - 1;

			if (peekIndex == 0) {
				continue;
			} else if ((characters.get(peekIndex - 1) == '(' && peek == ')')
					|| (characters.get(peekIndex - 1) == '[' && peek == ']')
					|| (characters.get(peekIndex - 1) == '{' && peek == '}')) {
				characters.pop();
				characters.pop();
			}
		}

		if (characters.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
