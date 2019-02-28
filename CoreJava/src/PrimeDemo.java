
public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;
		System.out.println(2);
		System.out.println(3);
		for (num = 3; num < 100; num=num+2) {
        if(num%2!=0 && num%3!=0) {
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i != 0)
					count=1;
				else 
				{
					count = 0;
					break;
				}
			}
			if (count == 1)
				System.out.println(+num);
		}
	}
}
}