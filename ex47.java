import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex47 {
    public void solution(String str, String str1)
    {
        String result = "YES";
        Queue <Character> qu = new LinkedList<>();
        for(char c :  str.toCharArray())
        {
            qu.offer(c);
        }
        for(char x : str1.toCharArray())
        {
            if(qu.contains(x))
            {
                if(qu.poll() != x)
                {
                    result = "NO";
                }
            }
        }
        if(qu.isEmpty())
        {
            result = "YES";
        }
        else
        {
            result = "NO";
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        ex47 main = new  ex47();
        Scanner in  = new Scanner(System.in);
        System.out.println("글귀 두개를 입력해주세요");
        String str = in.nextLine();
        String str1 = in.nextLine();
        main.solution(str, str1);
    }
}
