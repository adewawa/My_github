
public class TestWrite implements Runnable{
        SerialTest st = new SerialTest();   
	private MessagePool mp;
	public MessagePool getMessagePool(){
		return mp;
	}
	public void setMessagePool(MessagePool mpp){
		mp=mpp;
	}
        
	public void run(){
		while(true){
			try{
                st.initialize();
                String msg = mp.getMessage();
				System.out.println(msg);
                                output=serialPort.getOutputStream();
                                output.write(msg);
			}catch(Exception ex){
                            System.err.println(ex.toString());
			}
		}
	}
    
}
