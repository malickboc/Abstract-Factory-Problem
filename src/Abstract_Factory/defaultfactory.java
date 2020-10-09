package Abstract_Factory;

public class defaultfactory {

	public static Car buildcar(CarType model) {
	 Car car = null;
	 
	 switch(model) {
	 
	 case SUV:
		 car = new SUV(Location.DEFAULT);
		 break;
		 
	 case SPORTS:
		 car = new SportsCar(Location.DEFAULT);
		 break;
		 
	 case LUXURY:
		 car = new LuxuryCar(Location.DEFAULT);
		 break;
		 
		 default:
			 break;
	 }
		
		return null;
	}

}
