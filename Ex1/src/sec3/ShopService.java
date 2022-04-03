package sec3;

public class ShopService {

	private static ShopService singleton = new ShopService ();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
	
}
