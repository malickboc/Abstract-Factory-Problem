package Abstract_Factory;
/**
 * Entry point for the application.
 * 
 * @author
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Car carFa1=  CarFactory.buildCar(CarType.LUXURY,Location.DEARBORN);
		Car carFa2=  CarFactory.buildCar(CarType.SUV,Location.DEARBORN);
		Car carFa3=  CarFactory.buildCar(CarType.SPORTS,Location.DEARBORN);
		
		System.out.println(carFa1);
		System.out.println(carFa2);
		System.out.println(carFa3);
		

		Car carFa11=  CarFactory.buildCar(CarType.LUXURY,Location.TOLEDO);
		Car carFa21=  CarFactory.buildCar(CarType.SUV,Location.TOLEDO);
		Car carFa31=  CarFactory.buildCar(CarType.SPORTS,Location.TOLEDO);
		
		System.out.println(carFa11);
		System.out.println(carFa21);
		System.out.println(carFa31);
		
		Car carFac=  CarFactory.buildCar(CarType.LUXURY,Location.WARREN);
		Car carFac1=  CarFactory.buildCar(CarType.SUV,Location.WARREN);
		Car carFac2=  CarFactory.buildCar(CarType.SPORTS,Location.WARREN);
		
		System.out.println(carFac);
		System.out.println(carFac1);
		System.out.println(carFac2);
		
			
	      
	}



}
