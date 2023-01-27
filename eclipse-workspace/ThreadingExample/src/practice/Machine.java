package practice;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	List<TimeContainer> list = new ArrayList<>();

	Machine(){
		
	}
	Machine(List<TimeContainer> list){
		this.list = list;
	}
	public List<TimeContainer> getList() {
		return list;
	}

	public void setList(List<TimeContainer> list) {
		this.list = list;
	}
	
}
