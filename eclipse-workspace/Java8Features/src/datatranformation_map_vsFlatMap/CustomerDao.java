package datatranformation_map_vsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {

	public List<Customer> getCustomers(){
		return Stream.of(
				new Customer(11,"john","john@gmail.com", Arrays.asList("999999","777777")),
				new Customer(11,"smith","smith@gmail.com", Arrays.asList("999999","777777")),
				new Customer(11,"marry","mary@gmail.com", Arrays.asList("999999","777777"))
				).collect(Collectors.toList());
	}
	
}
