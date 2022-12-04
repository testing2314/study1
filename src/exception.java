public class exception {

	public static void main(String[] args) {
	main1();
	System.out.println("0");
	}

	private static void main1() {
    main2();
    System.out.println("1");
	}

	private static void main2() {
	try {
		main3();
	}
	catch(Exception e) {
		System.out.println("handled");
	}
	}

	private static void main3(){
	System.out.println(2/0);	
	}

}
