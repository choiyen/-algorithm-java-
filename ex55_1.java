import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex55_1 
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try 
        {
            
            System.out.println("강의의 숫자를 입력해주세요?");
            int N = Integer.parseInt(br.readLine());
            int [][] time = new int[N][2];
            StringTokenizer st;

            for(int i = 0; i<N; i++)
            {
                System.out.println((i+1)+ "번째 시작과 끝 시간을 입력해주세요");
                st = new StringTokenizer(br.readLine()," ");
                time[i][0] = Integer.parseInt(st.nextToken());                
                time[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(time, new Comparator<int []>() {
            
                public int compare(int [] p1 , int [] p2)
                {
                    if(p1[1] == p2[1])
                    {
                        return p1[0] - p2[0];
                    }

                    return p1[1] - p2[1];
                 }
            });//시간 순서대로 정리.
            int count = 0;
            int prev_end_time = 0;

            for(int i = 0; i<N; i++)
            {
                if(prev_end_time <= time[i][0])
                {
                    prev_end_time = time[i][1];
                    count++;
                }//배열의 i번째 끝 지점이랑, i+1 시작 지점이 같을 경우. 최종 끝지점의 값을 변경.
                    //그리고 갯수를 ++
            }

            System.out.println("정답 :" + count);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
				if (br != null) 
                {
					br.close();
				}
			} 
            catch (IOException e) 
            {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
    }
            
}
