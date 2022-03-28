import java.util.Stack;

class solution
{
    String solution1(String s)
    {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char temp = s.charAt(i);
            if(temp == ')' && stack.size() == 0)
            {
                answer = "NO";
                break;
            }
            else if(temp == ')'&& stack.size() > 0)
            {
                stack.pop();
            }
            else if(temp == '(')
            {
                stack.push(temp);
            }
        }
        if(stack.size() > 0) answer = "NO";        
        return answer;
    }
}
public class ex41 {
    public static void main(String[] args) {
        String a="(()(";
        solution s = new solution();
        System.out.println(s.solution1(a));
    }
}
