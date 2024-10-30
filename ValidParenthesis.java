import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str="()[]{}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else{
                if(stack.empty()) return false;
                else if(c==')'){
                    if(stack.peek()=='(') stack.pop();
                    else return false;
                }
                else if(c=='}'){
                    if(stack.peek()=='{') stack.pop();
                    else return false;
                }
                else if(c==']'){
                    if(stack.peek()=='[') stack.pop();
                    else return false;
                }
            }
        }
        if(stack.size()==0) return true;
        return false;
    }
}
