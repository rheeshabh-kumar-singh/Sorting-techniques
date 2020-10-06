
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
		quicksort.quickSort(arr, 0, arr.length-1);
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]);
		}
		
		int[] arr2= new int[] {2,4,-1,6,-9,-65,34,99,23,100};
		MergeSort ms= new MergeSort();
		ms.mergeSort(arr2, 0, 9);
		
	}

}
