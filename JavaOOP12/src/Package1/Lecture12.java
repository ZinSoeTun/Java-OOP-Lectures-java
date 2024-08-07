package Package1;
import Package2.*;

public class Lecture12 {

	public static void main(String[] args) {
		
       //		public: visible in all classes in all packages
       //		protected: visible to all classes in the same package or classes in other packages that are a subclass
       //		default: visible to all classes in the same package 
       //		private: visible only in the same class
		
//		B b = new B();
//		A a = new A();
//		Asub asub = new Asub();
		Asub asub = new Asub();
//		System.out.print(asub.protectedMessage);//show "I am Protected Message" because Asub class is inherited from A class
//		System.out.print(asub.defaultMessage) //not show "I am Default Message" because Asub class is not existed in same package
//		System.out.print(a.defaultMessage);   //show "I am Default Message" because A class is existed in same package
//		System.out.print(b.publicMessage);    //show "I am Public Message" because of public key word
//		System.out.print(b.privateMessage);   //this is not showed "I am Private Message" because of private key word
//		System.out.print(b.defaultMessage);   //this is not showed "I am Default Message" because of private key word
//		System.out.print(b.protectedMessage); //this is not showed "I am Protected Message" because of Protected key word


	}

}
