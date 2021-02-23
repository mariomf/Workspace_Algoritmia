import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompareTest {

	public static void main(String[] args) {
		
		Car car1 = new Car("Chevrolet", "sport" , "red");
		Car car2 = new Car("Nissan", "4x4", "blue");
		Car car3 = new Car("Renault", "pick-up", "yellow");
		
		List<Car> carList = new ArrayList<>();
		carList.add(car3);
		carList.add(car1);
		carList.add(car2);
		/*FOR EACH CON CLASE ANONIMA*/
//		carList.forEach(new Consumer<Car>() {
//			@Override
//			public void accept(Car car) {
//				System.out.println(car.getBrand());
//				
//			}
//		});
		/*FOR EACH CON LAMBDA*/
		//carList.forEach(car -> System.out.println(car.getBrand()));
		
		/*FOR EACH NORMAL*/
//		for(Car car : carList) {
//			System.out.println(car.getBrand());
//		}
		
//		Collections.sort(carList, new Comparator<Car>() {
//
//			@Override
//			public int compare(Car car0, Car car1) {
//				return car0.getBrand().compareTo(car1.getBrand());
//			}
//			
//		});
		
		/*SORT CON LAMBDA*/
		carList = carList
			.stream()
			.sorted((car, car0)->{ 
				return car.getBrand().compareTo(car0.getBrand());
						})
			.collect(Collectors.toList());
			//.forEach(car -> System.out.println(car.getBrand()));
			//.forEach(System.out::println);
		
		for(Car car : carList) {
			System.out.println(car.getBrand());
		}
		
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("c");
		stringList.add("b");
		
		Collections.sort(stringList);
		
		Iterator<String> iter = stringList.iterator();
		
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		
		
		

	}	

}



class Car {
	private String brand;
	private String type;
	private String color;
	
	Car(String brand, String type, String color){
		this.brand = brand;
		this.type  = type;
		this.color = color;
	};
	
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
}

