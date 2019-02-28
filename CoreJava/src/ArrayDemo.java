
public class ArrayDemo {
	public static void main(String[] args) {
		
//int [] arr= {10,20,30,40,50};
int [][]jaggu= {{1,2},{3,4,5},{6,7,8,9}};
		


for (int i = 0; i < jaggu.length; i++) {
	for (int j = 0; j < jaggu[i].length; j++) {
		System.out.print(jaggu[i][j] + "\t");
	
	}
	System.out.println();
    }
  }
}
