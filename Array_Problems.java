package Pract_test;

public class Array_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rotatearray= {1,2,3,4,5,6,7};
		int order=3;
		rotate(rotatearray,order);

	}
 static void rotate(int arr[],int pivot)
{
	if (arr ==null||arr.length==0)
		throw new IllegalArgumentException("Data is missing Validation");
		int a =arr.length-pivot;
		reverse(arr,0,a-1);
		reverse(arr,a,arr.length-1);
		reverse(arr,0,arr.length-1);
		
}
 static void reverse(int[] a,int left,int right)
{
	int temp;
	while(left<right)
	{
		temp=a[left];
		a[left]=a[right];
		a[right]=temp;
	}
}
}
