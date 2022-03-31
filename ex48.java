class ex48 
{
    public void solution(int [] arr)
    {
        int [] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            answer[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++)
        {
            int idx = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(answer[j] < answer[idx]) idx = j;
            }
            int temp = answer[idx];
            answer[idx] = answer[i];
            answer[i] = temp;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
    }
    public static void main(String[] args) {
        ex48 ex = new ex48();
        int [] p = {13,5,11,7,23,15};
        ex.solution(p);
        
    }   
}
