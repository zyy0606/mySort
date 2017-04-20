package mySort;

public class test{
	static Integer[] test1={10,9,8,7,6,5,5,3,2,1,0};
	static Integer[] test2=new Integer[20];
	
	public static void main(String[] args){
		for(int i=0;i<test2.length;i++){
			test2[i]=(int)(Math.random()*1000);
		}
		mySort.insertionSort(test1);
		mySort.insertionSort(test2);
		print(test1);
		print(test2);
	}
	
	public static void print(Comparable<?>[] a){
		for(Comparable<?> obj:a){
			System.out.print(obj+" ");
		}
		System.out.println();
	}
}
