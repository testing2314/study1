import java.io.FileNotFoundException;
import java.io.IOException;

public class excepion4 {

		public static void main(String[] args) throws IOException {
			main1();
			System.out.println("0");
			}
			private static void main1()throws IOException {
		    main2();
		    System.out.println("1");
			}
			private static void main2() throws IOException  {
			main3();
			}
			private static void main3() throws IOException {
				throw new IOException();
			}
}
