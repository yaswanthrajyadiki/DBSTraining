
public class Utility {
	
	int flag;
	
	private static Utility utility = new Utility();
	
	private Utility() {
		flag = 1;
	}
	
	public static Utility getUtilityObj() {
		return utility;
	}
	
}
