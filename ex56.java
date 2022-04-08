import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Time implements Comparable<Time>
{ 
	int time; 
	char status; //S: 도착시간, E: 떠나는 시간 
	public Time(int time, char status) 
	{ 
		this.time = time; 
		this.status = status; 
	} 
	@Override 
	public int compareTo(Time o) 
	{ 
		if (this.time == o.time) 
		return this.status - o.status; 
		else 
		return this.time - o.time; 
	} 
}


//결혼식 
public class Main9_3 
{ 
	public static int solution(List<Time> list) 
	{ 
		int answer = 0; //최대 인원수 
		int count = 0; //현재 피로연에 있는 인원수 
		Collections.sort(list); 
		
		for (Time t : list) 
		{ //정렬된 리스트를 순차적으로 돌며 status가 S이면 count 변수를 1증가 시키고, E이면 1감소시킨다. 
			if (t.status == 'S') 
			{ 
				count++; 
				answer = Math.max(answer, count); 
			} 
			else 
			count--; 
		} 
		return answer; 
	} 
	public static void main(String[] args) throws IOException 
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("몇명의 친구가 참석할 예정인가요?");
		int n = Integer.parseInt(br.readLine()); 
		List<Time> list = new ArrayList<>(); 
		StringTokenizer st = null; 
		for (int i = 0; i < n; i++) 
		{ 
			System.out.println((i+1)+"번째 친구가 들어온 시간, 나간 시간을 입력해주세요?");
			st = new StringTokenizer(br.readLine()); 
			int start = Integer.parseInt(st.nextToken()); 
			int end = Integer.parseInt(st.nextToken()); 
			list.add(new Time(start, 'S')); //도착 시간 
			list.add(new Time(end, 'E')); //떠나는 시간 
		} 
		System.out.println(solution(list)); 
		br.close(); 
	} 
}
