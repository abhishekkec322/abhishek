package prep_2019;

public class LearnSinglton {

	// Lazy Initialization Singleton Start
	/*
	 * private static LearnSinglton instance; private LearnSinglton () {} public
	 * static LearnSinglton getInstance() { if(instance ==null) { instance = new
	 * LearnSinglton(); } return instance; }
	 */
	// Lazy Initialization Singleton End

	// Eager Initialization Singleton Start
	/*
	 * private static LearnSinglton instance = new LearnSinglton(); private
	 * LearnSinglton() {} public static LearnSinglton getInstance() { return
	 * instance; }
	 */
	// Eager Initialization Singleton End

	// Static Block Singleton Start
/*	private static LearnSinglton instance;

	private LearnSinglton() {
	}

	static {
		try {
			instance = new LearnSinglton();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static LearnSinglton getInstance() {
		return instance;
	}*/
	// Static Block Singleton End
	
	// ThreadSafe (Synchronized) Singleton Start
	
	
	// ThreadSafe (Synchronized) Singleton End
	
	
}
