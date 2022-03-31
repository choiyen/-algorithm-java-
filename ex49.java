public class ex49 {
    
    private  void BubleSort(int [] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int k = 0; k < arr.length-i-1; k++)
            {
                if(arr[k] > arr[k+1])
                {
                    int temp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        ex49 ex = new ex49();
        int [] arr = {13, 5, 11, 7, 23, 15,3};
        ex.BubleSort(arr);
    }
}
