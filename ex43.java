import java.util.Stack;

public class ex43 {
    
    public static int solution(int [][] board, int [] moves)
    {
        int answer = 0;
        Stack <Integer>  Stack = new Stack<>();
        Stack.push(0);
        for(int move : moves)
        {
            for(int j = 0; j < board.length; j++)
            {
                if(board[j][move-1] != 0)
                {
                    if(Stack.peek() == board[j][move - 1])
                    {
                        Stack.pop();
                        answer += 2;
                    }
                    else
                    {
                        Stack.push(board[j][move-1]);
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) 
    {
        int [][] a=
        {{0,0,0,0,0},
        {0,0,1,0,3},
        {0,2,5,0,1},
        {4,2,4,4,2},
        {3,5,1,3,1}};

        int [] b={1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(a, b));
    }
}
