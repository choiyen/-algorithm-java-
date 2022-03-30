import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ex46 {
    
    public int solution(int prince, int n)
    {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= prince; i++) queue.add(i);
        while(queue.size() != 1)
        {
            for(int j = 1; j < n; j++)
            {
                queue.add(queue.remove());
            }
            queue.remove();
        }
        answer = queue.poll();
        return answer;
    } 
    public static void main(String[] args) 
    {
        ex46 main = new ex46();
        Scanner scan = new Scanner(System.in);
        System.out.println("왕자의 숫자를 입력하세요?");
        int prince = scan.nextInt();
        System.out.println("없앨 순 번의 녀석을 임력해주세요");
        int n = scan.nextInt();
        System.out.println(main.solution(prince, n));

    }
}
