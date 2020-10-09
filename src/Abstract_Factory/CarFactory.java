package Abstract_Factory;

public class CarFactory {
	
	private CarType model;
	private Location location;
	
CarFactory() {
	this.location = location;
	this.model = model;
		
	}
	

	public static Car buildCar(CarType model, Location location) {
		
		Car car ;
		
		switch(location) {
		
		case DEARBORN:
			car = DearbornFactory.buildCar(model);
			
			break;

		case TOLEDO: 
			car = ToledoFactory.buildCar(model);
		
			 break;
			 
		case WARREN:
			car = WarrenFactory.buildCar(model);
			
			 break;
			
			default:
				car=defaultfactory.buildcar(model);
			 break;
		}
		return car;	

     }


	


	
}