
public class exception2 {

	public static void main(String[] args) throws Throwable {
		main1();
		System.out.println("0");
		}
		private static void main1() throws Exception{
	    main2();
	    System.out.println("1");
		}
		private static void main2() throws Exception{
			main3();
		}
		private static void main3() throws Exception{
			throw new ArithmeticException();
		}
	}
