package main;
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/
public class Demo {
	static int moveZero(int[] arr,int n) {
		
		int count=0;
		
		if(n==0) {
			return 0;
		}
		
		for(int i=0;i<n;i++) {
				if(arr[i] !=0) {
					arr[count++]=arr[i];
				}
		}
		
		while(count<n) {
			arr[count++]=0;
		}
		return 1;
	}
	
	 public static void main(String[] args) {
		 int[] num= {5};
		 int length=num.length;
		 moveZero(num,length);
		 for(int i=0;i<length;i++) {
			 System.out.print(num[i]+" ");
		 }
	 }
}
