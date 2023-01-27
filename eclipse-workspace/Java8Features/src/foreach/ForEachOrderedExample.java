package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample {  
    public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky"); 
        String s = "weclome";
        String s1 = "weclome";
        if(s1==s) {
        	System.out.println("ssssssssssssssss");
        }
        if(s1.equals(s)) {
        	System.out.println("bbbbbbbbb");
        }
        s.concat("aaaaa");
        System.out.println(s);
        System.out.println("------------Iterating by FOR Each Method---------------");  
        gamesList.forEach(l->System.out.println(l));
        
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println); 
        
    }  
  
}  
