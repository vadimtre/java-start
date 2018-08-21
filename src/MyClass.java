
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r =Runtime.getRuntime();
		System.out.println("OS name: " + System.getProperty("os.name"));
		System.out.println("OS.version: " + System.getProperty("os.version"));
		System.out.println("Quantity of processors: " + r.availableProcessors());
		//total amount of memory in the Java virtual machine.
		System.out.println("Total memory: "+ r.totalMemory());
	}

}
