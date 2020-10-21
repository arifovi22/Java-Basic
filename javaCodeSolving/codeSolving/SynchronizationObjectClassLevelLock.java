package codeSolving;

class A{
	public static synchronized void loop() {
		for (int i = 0; i < 6; i++) {
			System.out.println("loop is running "+ i);
		}
	}	
}

class B extends Thread{
	A a;
	public B(A a) {
		this.a = a;
	}
	public void run() {
		a.loop();
	}
	
}

public class SynchronizationObjectClassLevelLock {
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		B b = new B(a);
		B b2 = new B(a1);
		b.start();
		b2.start();
	}

}
