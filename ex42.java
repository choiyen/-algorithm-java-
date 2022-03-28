import java.util.Stack;

class use
{
    void solution(String s)
    {
        String answer = "";
        Stack <Character> stack = new Stack<>();
        for(char x : s.toCharArray())
        {
            if(x == ')')
            {
                while(stack.pop()!= '(');
            }
            else
            {
                stack.push(x);
            }
        }
        for(char ch : stack)
        {
            answer += ch;
        }

        System.out.println(answer);
    }
}
public class ex42 {
    public static void main(String[] args) {
        String str="(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        use use = new use();
        use.solution(str);
    }
}
