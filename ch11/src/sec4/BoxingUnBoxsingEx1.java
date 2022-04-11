package sec4;

public class BoxingUnBoxsingEx1 {

	public static void main(String[] args) {
		//Boxing = 기본타입-> 래퍼타입으로
			//		int -> Integer
			//		float->Float
		
		//Boxing
		Integer int1 = new Integer(1004);
		Integer int2 = new Integer("1004");
		Integer int3 = Integer.valueOf("1004");
		Integer int4 = Integer.valueOf(i1);
		Integer int5 = new Integer(i1);
		
		Float fl1 = new Float(3.14);
		Float fl2 = new Float("3.14");
		Float fl3 = Float.valueOf("3.14");
		Float fl4 = Float.valueOf(f1);
		Float fl5 = new Float(F1);
		
		//UnBoxing
		int iv1 = int1.intValue();
		
	}

}
