
public class QuickSort {
	
	int[] array;
	
	int[] quickSort(int[] arr)
	{
		array=arr;
		qs(0,array.length-1);
		return array;
	}
	
	void qs(int l, int h)
	{
		if(l<h)
		{
			int j=partition(l,h);
			qs(l,j);
			qs(j+1,h);
		}
	}
	
	int partition(int l,int h)
	{
		int pivot= array[l];
		int i=l,j=h;
		while(i<j)
		{
		do
		{
			i++;
		}while(array[i]<=pivot && i<j);
		
		do
		{
			j--;
		}while(array[j]>pivot);
		if(i<j) swap(i,j);
		}
		swap(l,j);
		for(int k=0;k<7;k++)
		{
			System.out.print(array[k]);
		}
		System.out.println();
		
		return j;
		
	}
	
	void swap(int i, int j) 
	{
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
