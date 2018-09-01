package hello;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message){
		this.message  = message;
	}
	
	public void getMessage(){
		System.out.println("Your Message : " + message);
		callCalledByHW();
	}
	
	public void callCalledByHW() {
		CalledByHW hw = new CalledByHW();
		hw.print();
	}
}
