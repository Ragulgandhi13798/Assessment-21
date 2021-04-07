package interfaceeg;

interface example1
{
	public static void name() {
		
		System.out.println("hell0");
		
	}
}
interface example2
{
	default void test()
	{
		System.out.println("hi");
	}
}
public class Demo implements example2 {

	public static void main(String[] args) {
		example1.name();
		Demo e2 = new Demo(); 
		e2.test();
	}

}
