import java.io.FileNotFoundException;

public class exception3 {

	public static void main(String[] args) {
		main1();
		System.out.println("0");
		}
		private static void main1() {
	    main2();
	    System.out.println("1");
		}
		private static void main2() {
			try{main3();}
			catch(Exception e) {
				System.out.println("Handled in main3");
			}
		}
		private static void main3() throws Exception{
			throw new FileNotFoundException();
		}
}
