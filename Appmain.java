
public class Appmain {

	public static void main(String[] args) {
                SerialTest st = new SerialTest();
                st.initialize();
                
		TestRead tr = new TestRead();
		TestWrite tw = new TestWrite();
		MessagePool mp = new MessagePool();
                tw.setMessagePool(mp);
                tr.setMessagePool(mp);

		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tw);

		t1.start();
		t2.start();
                System.out.println("started");
	}
}