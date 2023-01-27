package datatranformation_map_vsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Customer> list = new CustomerDao().getCustomers();
		// get email ids of all customer 1-1 mapping 
		List<List<String>> phon = list.stream().map(c->c.getPhone()).collect(Collectors.toList());
	}

}
