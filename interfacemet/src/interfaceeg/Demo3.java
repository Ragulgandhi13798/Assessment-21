package interfaceeg;
interface example11
{
	public void name();
}
interface example22
{
	public void add();
	public void name1();
}
interface example3
{
	public void run();
	public void run1();
	default void  display() {
	
	System.out.println("python");
	
	}
	
}
public class Demo3 implements example1,example2,example3 {

	@Override
	public void run() {
		System.out.println("run method");
	}

	@Override
	public void run1() {
		
		System.out.println("run1 method");
	}

public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.run();
		d.run1();
        d.display();
        
	}
}
