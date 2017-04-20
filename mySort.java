package mySort;

public class mySort {
	//基于比较的排序
	/**
	 * Simple insertion sort.
	 * Time complexity: O(N^2)
	 * @param a an array of Comparable items.
	 */
	public static <AnyType extends Comparable<? super AnyType>>
	void insertionSort(AnyType [] a){
		int j;
		
		for(int p=1;p<a.length;p++){
			AnyType tmp=a[p];
			for(j=p-1;j>=0&&tmp.compareTo(a[j])<0;j--)
				a[j+1]=a[j];
			a[j+1]=tmp;
		}
	}

	public static <AnyType extends Comparable<? super AnyType>>
	void shellSort(AnyType [] a){
		
	}
}
