
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";//primitive style
		String s2 = new String("Hello");//object style
		String s3 = "Hello";

		// REFERNCE COMPARISON

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		// VALUE CAMPARISON
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		s1 = s1 + "world";

		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));

		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));

		System.out.println(s1.concat("of Java"));
		System.out.println(s1.replace('o', 'a'));

		System.out.println(s1);
	}

}
