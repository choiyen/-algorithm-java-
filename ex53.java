import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

class solution
{
    
}
public class ex53 {
    
    
    public static void solution1(int[] count)
    {
        Stack <Integer> stack = new Stack<>();
        Integer [] rest = Arrays.stream(count).boxed().toArray(Integer[] :: new);
        Integer [] restclone = rest.clone();
        Arrays.sort(restclone);//레퍼 클레스에서만 사용가능.
        System.out.println("일단 내림차순으로 정렬부터 합니다.");
        for(int i = 0; i < restclone.length; i++)
        {
            System.out.print(restclone[i] + " ");
        }
        System.out.println("\n");
        for(int i = 0; i < restclone.length; i++)
        {
            System.out.print(rest[i] + " ");
        }

        System.out.println("\n");
        int[] b = Arrays.stream(restclone).mapToInt(Integer::intValue).toArray();
        for(int i = 0; i < count.length; i++)
        {
            if(count[i] != b[i]) stack.push(i+1);
        }
        System.out.println("자리를 바꾼 인물은");
        for(int i = 0; i < stack.size(); i++)
        {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println("\n 키 정보 " + count[stack.get(0)-1] + "가 현수이고," + count[stack.get(1)-1]+"가 현수 짝궁입니다." );
    }
    public static void main(String[] args) 
    {
        Scanner scan  = new Scanner(System.in);
        int n = 0;

        while(true)
        {
            System.out.println("5부터 100 이하의 자연수를 입력해주세요?");
            n  = scan.nextInt();
            if(n>=5 && n <=100)
            {
                break;
            }
            else
            {
                System.out.println("다시 입력 부탁드립니다.");
            }
        }
        int [] count = new int[n];
        int i = 0;
        while(true)
        {
            System.out.println((i+1)+"번째 자연수를 입력해주세요?(120부터 180까지)");
            count[i] = scan.nextInt();
            if(120<= count[i] && count[i] <= 180)
            {
               
                if(i>= n-1)
                {
                    break;
                } 
                i++;
            }
            else
            {
                System.out.println("입력값이 조건에 만족하지 않습니다. 재입력 부탁드립니다.");
            }
        }
        solution1(count);
    }   
}
