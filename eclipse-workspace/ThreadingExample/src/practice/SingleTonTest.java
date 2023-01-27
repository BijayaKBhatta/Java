package practice;

public class SingleTonTest {

	public static void main(String[] args) {
		
	}
}
class OneObject{
	private static OneObject oneObject;
	private OneObject() {	}
	public static OneObject getObject() {
		synchronized (oneObject) {
			if(oneObject==null) {
				oneObject = new OneObject();
			}
			return oneObject;
		}
		
	}
}
// 2nd way - better way 
class Singleton
{
	//JVM executes static initializer when the class is loaded and hence this is guaranteed to be thread safe.
    private static Singleton obj = new Singleton();
 
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        return obj;
    }
}

