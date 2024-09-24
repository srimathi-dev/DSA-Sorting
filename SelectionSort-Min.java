class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = i;
	    int len = arr.length;
	        for(int j = i+1;j < len;j++)
	        {
	            if(arr[j] < arr[min])
	            {
	                min = j;
	            }
	        }
	        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	        
	        for(int i = 0;i < n;i++)
	        {
    	        int minIndex = select(arr,i);
    	        if(minIndex != i)
    	        {
    	            int temp = arr[minIndex];
    	            arr[minIndex] = arr[i];
    	            arr[i] = temp;
    	        }
	        }
	}
}