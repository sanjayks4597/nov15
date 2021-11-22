package mathamaticals_operations;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr[]= {10,5,30,15,7};
		
		int low=0;
		int high=arr.length-1;
		mergeSort(arr,low,high);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

	private static void mergeSort(int[] arr, int low, int high) {
		
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		
		int n1=mid-low+1;
		int n2=high-mid;
		int []leftArray=new int[n1];
		int []rightArray=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftArray[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++)
		{
			rightArray[j]=arr[(mid+1)+j];
		}
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k++]=leftArray[i++];
			}
			else {
				arr[k++]=rightArray[j++];
			}
		}
		while(i<n1)
		{
			arr[k++]=leftArray[i++];
		}
		while(j<n2)
		{
			arr[k++]=rightArray[j++];
		}
		
		
	}

}
