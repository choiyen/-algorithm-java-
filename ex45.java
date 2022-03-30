import java.util.Stack;

public class ex45 {
   
   public static int solution(String s)
   {
        int answer = 0;
        Stack <Character> stack = new Stack<>();
        char [] a = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            if(a[i] == '(') stack.push('(');
            else
            {
                stack.pop();
                if(a[i-1] == '(') answer+= stack.size();
                else answer++;
            }
        }
        return answer;
   }
   public static void main(String[] args) 
   {
         String a="(((()(()()))(())()))(()())";
         System.out.println(solution(a));
   } 
}
