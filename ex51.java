class ex51 {
    private static void solution(int [] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int temp = arr[i], j;
            for(j = i-1; j>=0; j--)
            {
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    } 
    public static void main(String[] args) {
        int [] arr = {11,7,5,6,10,9};
        ex51 ex = new ex51();
        ex.solution(arr);
    }
}
