package Banking;

public class WithdrawException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WithdrawException() {
	
	}
	
	public WithdrawException(String message) {
		super(message);
	}
	
	public WithdrawException(Throwable cause) {
		super(cause);
	}

	public WithdrawException(String message, Throwable cause) {
		super(message, cause);
	}

	public WithdrawException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
