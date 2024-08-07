
public class Lecture19 {

	public static void main(String[] args) {

		/* inner class = 	A class inside of another class.
		useful if a class should be limited in scope.
		usually private, but not necessary
		helps group classes that belong together
		extremely useful for listeners for specific events
		precursor for anonymous inner classes			
*/
			Outside out = new Outside();
			Outside.Inside in = out.new Inside();
			in.Greeting();
	}

}
