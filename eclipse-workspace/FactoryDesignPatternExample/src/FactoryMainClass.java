import com.phone.Android;
import com.phone.OS;
import com.phone.OSFactory;

public class FactoryMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OS operatingSystem = new Android();
		//operatingSystem.specification();
		
		
		
		// no change in here only change in the corrosponding class
		OSFactory factory = new OSFactory();
		OS os = factory.getInstance("open");// -->Android
		os.specification();
		
	}

}
