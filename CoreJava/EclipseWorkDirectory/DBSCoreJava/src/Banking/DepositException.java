package Banking;

public class DepositException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DepositException() {
		
	}

	public DepositException(String message) {
		super(message);
	}

	public DepositException(Throwable cause) {
		super(cause);
	}

	public DepositException(String message, Throwable cause) {
		super(message, cause);
	}

	public DepositException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
