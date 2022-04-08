package sec6;

public class WrongPasswordExcoption extends Exception{
	public WrongPasswordExcoption() { }
	public WrongPasswordExcoption(String message) {
			super(message);
		}
	}
