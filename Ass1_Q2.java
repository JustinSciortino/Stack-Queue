//Justin Sciortino 40247931 Individual Question 2
import java.util.Stack;
public class Ass1_Q2 {
    private static boolean isOpeningBracket(char b){
        if(b == '[' || b == '(' || b == '{'){
            return true;
        }
        return false;
    }
    private static boolean isClosingBracket(char b){
        if(b == ']' || b == ')' || b == '}'){
            return true;
        }
        return false;
    }
    private static boolean isMatching(char o, char c){
        if ((o == '{' && c == '}') || (o == '(' && c == ')') || (o == '[' && c == ']')) {
            return true;
        }
        return false;
    }

    public static boolean Balanced(String bracket){
        Stack<Character> stack = new Stack<>();

        for (char b: bracket.toCharArray()){
            if(isOpeningBracket(b)){
                stack.push(b);
            } else if (isClosingBracket(b)) {
                if (stack.isEmpty() || !isMatching(stack.pop(), b)){
                    return false;
                }
            }
        }
        return true;
    }
}
