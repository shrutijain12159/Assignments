import java.util.Scanner;
import java.util.Stack;

public class bracketMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        String exp=sc.next();
        char[] expArray = exp.toCharArray();
        Stack<Character> stack=new Stack<Character>();
        Boolean balanced=true;
        outer:
        for (char c : expArray) {

            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()==false)
            {
                if(c==')')
                {
                    if(stack.peek()=='(')
                        stack.pop();
                    else
                    {
                        balanced=false;
                        break outer;
                    }
                }
                if(c=='}')
                {
                    if(stack.peek()=='{')
                        stack.pop();
                    else
                    {
                        balanced=false;
                        break outer;
                    }
                }

                if(c==']')
                {
                    if(stack.peek()=='[')
                        stack.pop();
                    else
                    {
                        balanced=false;
                        break outer;
                    }
                }
            }
            else if(c=='}' || c==']' || c==')')
            {
                balanced=false;
                break outer;
            }
            
            
        }
        if(balanced && stack.isEmpty())
        {
            System.out.println("Expresssion is balanced");
        }
        else
            System.out.println("Unbalanced expression");
        
    }
}
