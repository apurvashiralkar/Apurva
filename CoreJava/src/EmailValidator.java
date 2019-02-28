//Name:Email validator
/*
 *Validation Rules
 *There should be 1-1 occurence of "@" and"."
 *min 4 letters before @
 *min 3 letters between @ and.
 *
 *
 *min 2 letters after .
 */
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "zubair@email.com";

		if ((email.indexOf('@') == email.lastIndexOf('@')) && (email.indexOf('.') == email.lastIndexOf('.'))
				&& (email.indexOf('@') > 4) && (email.indexOf('.') > 9) && (email.length() > 11)) {

			System.out.println("valid");
		} else {
			System.out.println("not valid");

		}

	}

}
