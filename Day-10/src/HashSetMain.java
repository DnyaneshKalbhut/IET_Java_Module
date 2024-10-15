import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		    HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("ferrari");
		    cars.add("Mazda");
		    cars.add("porsche");
		    System.out.println(cars);
		    
		    System.out.println(cars.contains("BMW"));
		    cars.remove("BMW");
		    System.out.println(cars.size());
		    
		  }
		}
