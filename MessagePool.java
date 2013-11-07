
public class MessagePool {
	private String message="";
	public synchronized  String getMessage(){
		if (message == "") {
			try{
				wait();
			}catch(Exception ex){
			}
		}
		String msg=message;
		message ="";
		return msg;
	}    
	public synchronized void setMessage(String msg){
		message =msg;
		notifyAll();
	}
}
