interface Executable {
	int execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block....");
		int value = e.execute();
		System.out.println("Return Value is:" + value);
	}
}

/*
  runner.run(() -> {
	System.out.println("This code is passed in Lambda Expression");
System.out.println("Hello Everyone.");
 */


public class Lambda {

	public static void main(String[] args) {
		
Runner runner = new Runner();
runner.run(new Executable() {
	public int execute() {
		System.out.println("Hello Everyone.");
		return 7;
	}
});

System.out.println("========================");
runner.run(() -> {
	System.out.println("This code is passed in Lambda Expression");
System.out.println("Hello Everyone.");
return 8;
});

}
}
