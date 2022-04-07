import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class ex52 {
    
    public static int [] solution(int s , int n, int[] work)
    {
        LinkedList<Integer> cache = new LinkedList<>(); 
        int[] answer = new int[s]; 
        for (int i : work) 
        {   
            if (cache.contains(i)) 
            { //캐시에 최근 작업이 이미 있다면 
                cache.remove((Integer) i); 
            } 
            cache.addFirst(i); 
            if (cache.size() > s) 
            { 
                cache.removeLast(); 
            } 
        } 
        for (int i = 0; i < s; i++) 
        { 
            answer[i] = cache.get(i); 
        } 
        return answer;
    }
    public static int [] solution1(int s , int n , int [] work)
    {
        int[] cache = new int[s]; 
        for (int i : work) 
        { 
            int pos = -1; 
            for (int j = 0; j < s; j++) 
            { 
                if (cache[j] == i) 
                { //캐시에 최근 작업이 이미 있다면 
                    pos = j; 
                } 
            } 
            if (pos == -1) 
            { //캐시에 최근 작업이 없다면? 
                for (int j = s - 1; j > 0; j--) 
                { 
                    //전체 캐시를 한칸씩 뒤로 옮긴다. 
                    cache[j] = cache[j - 1]; 
                } 
            } 
            else 
            { 
                //캐시에 최든 작업이 이미 있다면? 
                for (int j = pos; j > 0; j--) 
                { 
                    //최근 작업이 있던 위치까지 한칸씩 뒤로 옮긴다. 
                    cache[j] = cache[j - 1]; 
                } 
            } 
            cache[0] = i; //최근 작업을 맨 앞에 넣는다. 
            // 큰 것도 나눠서 생각할 필요가 있다. 알고리즘을 구체적으로 생각해보기
        } 
        return cache;

    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());//토근 형식으로 입력받음. bufferedReader vs scanner의 차이.
        int n  = Integer.parseInt(st.nextToken()); //데이터를 입력할 크기.
        int [] work = new int[n];// 데이터의 양 n 만큼 공간을 확보함
        st = new StringTokenizer(br.readLine()); // 입력 받은 데이터를 토근 하나 씩 잘라낸다. 빈 공간은 0으로 처리.
        for(int i = 0; st.hasMoreTokens(); i++)
        {
            work[i] = Integer.parseInt(st.nextToken()); // 입력 받은 토큰을 배열에 차곡차곡 저장.
        }
        System.out.println("\n");
        for(int i : solution(s, n, work))
        {
            System.out.print(i + " "); // 저장 공간은 5 그러나, 입력 받은 데이터는 9 따라서 4개가 밀려남.
        }
        System.out.println("\n");
        for(int i : solution1(s, n, work))
        {
            System.out.print(i + " ");
        }
    }    
}
