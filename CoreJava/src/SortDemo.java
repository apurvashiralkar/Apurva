//Name of Program:Bubble Sort
public class SortDemo {

	public static void main(String[] args) {
		// TODO 
		int []arr= {3,1,5,2,4};
		int temp1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1])
				{
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
					
				}
				
				
			}
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println(+ arr[j]);
				
			}
			
		}

	}

}
