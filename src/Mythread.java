class MyThread1 extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++)
			
		System.out.println("sita thread");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class Mythread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		t.start();
		t.join();
		for(int i=0;i<=10;i++)
			//Thread.yield();
		{
			System.out.println("rama thread");
			Thread.sleep(4000);
			
		}

	}

}
