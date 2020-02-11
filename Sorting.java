
import java.util.*;
public class Sorting{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> product = new ArrayList<String>(); 
		 product.add("wheat"); 
		 product.add("jowar"); 
		 product.add("maize"); 
		 product.add("ragi");
		 product.add("paddy"); 
		 product.stream().sorted().forEach(System.out::println); 
	}
}
