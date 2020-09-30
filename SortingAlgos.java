
public class SortingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {5,3,2,4,1,7,6};
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		QuickSort quicksort=new QuickSort();
		arr= quicksort.quickSort(arr);
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
