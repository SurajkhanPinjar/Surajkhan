package CustonUnChecked;

public class Election {
	void vote (int age) throws AgeLimitException {
		if(age<18) {
			throw new AgeLimitException();
		}
		else {
			System.out.println("Allowed For Voting");
		}
	}

}
