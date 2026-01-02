package Lambda;

public class Main {

	public static void main(String[] args) {
		
//		MyInterface abc = new LambdaClass();
//		abc.sayHello();
		
		
//		MyInterface A = new MyInterface() {
//
//			@Override
//			public void sayHello() {
//				System.out.println("This is the 1st anonymous class.");
//				
//			}
//			
//	   };
//	   A.sayHello();
//	   
//	   MyInterface B = new MyInterface() {
//
//		@Override
//		public void sayHello() {
//			System.out.println("This is other anonymous class.");
//			
//		}
//		   
//		   
//	   };
//	   B.sayHello();
		
		
		MyInterface i = () -> System.out.println("This is the first time i am using lambda exp");
		i.sayHello();
		
		MyInterface i2 = () -> System.out.println("This is 2nd time using lambda exp.");
		i2.sayHello();
		
		SumInter X = ( a, b) ->  a+b;
//		int result = X.Sum(5, 9);
		System.out.println(X.Sum(7, 5));
		
		LengthInter abc = (str) ->  str.length();
		System.out.println("Length of the string is " + abc.getLength("Abhishek"));

   }
}
