
public class Lecture7 {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
				//			The class "owns" the static member
				
				Friend friend1 = new Friend("Sponegbob");
				Friend friend2 = new Friend("Patrick");
				Friend friend3 = new Friend("Patrick");
				Friend friend4 = new Friend("James");
				Friend friend5 = new Friend("Justin");
				Friend friend6 = new Friend("Mical");
				Friend friend7 = new Friend("Jones");
				Friend friend8 = new Friend("Sophia");
				
				System.out.println(Friend.numberOfFriends);

	}

}
