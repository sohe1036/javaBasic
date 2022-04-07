package sec1;

public class NullPointerEx {

	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("출력할 내용에 null이 있음");
			e.printStackTrace();
		} catch (Exception e) {
			
		}

	}

}
