
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("Sum:" + sum);
		// Auto-Boxing
		int x = 10;//primitive style
		Integer xobj = x;//object style
		int y = xobj + 5;
	}

}
