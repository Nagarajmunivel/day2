public interface colour{
	default void red() {
		System.out.println("Red in interface");
		colour.blue();
	}
	private static void blue()
	{
		System.out.println("all thing to be done here fully");
	}
	static void green()
	{
		System.out.println("green in interface");
	}
	void black();
	
}