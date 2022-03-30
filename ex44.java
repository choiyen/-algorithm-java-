import java.lang.Thread.State;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class ex44 {
    
    public static boolean isOperator(char c)
    {
        if(c== '+' || c== '-' || c== '/' || c== '*' || c == '%')
        {
            return true;
        }
        return false;
    }
    public static int postfix(int a , int b, char oper)
    {
        if(oper == '+')
        {
            return a+b;
        }
        else if(oper == '-')
        {
            return a-b;
        }
        else if(oper == '/')
        {
            return a/b;
        }
        else if(oper == '*')
        {
            return a*b;
        }
        else
        {
            return a%b;
        }
        
    }
    public static void solution(String s)
    {
        int Result = 0;
        Stack <Integer> stack = new Stack<>();
        int a = 0, b = 0, z = 0;
        for(char x : s.toCharArray())
        {
            if(isOperator(x))
            {
               a = stack.pop(); 
               b = stack.pop();
               z = postfix(b, a, x);
               stack.push(z);                 
            }
            else
            {
                stack.push(Character.getNumericValue(x));
            }
        }
        Result = stack.pop();
        System.out.println(Result);
    }
    public static void main(String[] args) {
            String str="352+*9-";
            solution(str);
    }
}
