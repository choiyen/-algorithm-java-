import java.util.Scanner;

class ex50 
{
    
    private static void solution(int [] arr)
    {
         for(int i = 0; i < arr.length-1; i++)
         {
             for(int j = 0; j < arr.length-i-1; j++)
             {
                 if(arr[j] > 0 && arr[j+1] < 0)
                 {
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;
                 }
             }
         }

         for(int i = 0; i < arr.length; i++)
         {
             System.out.print(arr[i] + " ");
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true)
        {
            System.out.println("입력할 자연수의 갯수를 입력해주세요?");
            n = sc.nextInt();
            if(5<=n&& n<=100)
            {
                break;
            }
            else
            {
                System.out.println("다시 입력해주세요");
            }
        }
        int [] special = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println((i+1) + "번째 숫자를 입력해주세요?");
            special[i] = sc.nextInt();
        }
        ex50.solution(special);
        
    }   
}
