package filter;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;  
class Products{  
    int id;  
    String name;  
    float price;  
      
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Products(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Products> productsList = new ArrayList<Products>();  
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000f));  
        productsList.add(new Products(2,"Dell Laptop",30000f));  
        productsList.add(new Products(3,"Lenevo Laptop",28001f));  
        productsList.add(new Products(4,"Sony Laptop",28000f));  
        Products one = new Products(5,"Apple Laptop",90000f);
        productsList.add(one); 
        //productsList.add(one);
        //productsList = productsList.stream().filter(p->p.name.length()>2).collect(Collectors.toList());
        List<Float> pro = productsList.stream().map(p->p.price).collect(Collectors.toList());
        
        
        // find first product 
        Optional<Products> firstP = productsList.stream().findFirst();
        Products firstProduct = firstP.get();
        System.out.println(firstProduct.name);
        

        // find any product
        Optional<Products> anyProduct = productsList.stream().findAny();
        Products anyProducts = anyProduct.get();
        System.out.println(anyProducts.name);
        
        
        
        Optional<Products> secondRecord = productsList.stream().skip(1).findFirst();
        Products secondRecordProduct = secondRecord.get();
        System.out.println("second product list - "+secondRecordProduct.name);

        // find the second height salary or second height mark of student - 
       Optional<Products> prod = productsList.stream().sorted(Comparator.comparingDouble(Products::getPrice).reversed()).skip(2).findFirst();
       System.out.println("3rd height price of product "+prod.get().price);

        
        
        
        long countR = productsList.stream().skip(1).count();
         System.out.println("count is - "+countR);
         System.out.println("count is -----"+productsList.stream().count());
         
         List<Products> distinct = productsList.stream().distinct().collect(Collectors.toList());
         distinct.forEach(l->System.out.println("prodct name"+l.name));
         //productsList.stream().
     
         List<Integer> myIntList = new ArrayList<>();
         myIntList.add(10);
         myIntList.add(20);
         myIntList.add(30);
         myIntList.add(null);
         // adding null object check  to handel a null obejct - myIntList.add(null);
        // myIntList.stream().filter(obj->Objects.nonNull(obj)).forEach(l->System.out.println("hey-"+l));
      // adding null object check - myIntList.add(null);
         myIntList.stream().filter(Objects::nonNull).forEach(i->System.out.println("hi"+i));

         //max
         
         Integer max =  myIntList.stream().mapToInt(i->i).max().orElseThrow(NoSuchElementException::new);
         System.out.println("Max = "+max);
         
         // min
         Integer min =  myIntList.stream().mapToInt(i->i).min().orElseThrow(NoSuchElementException::new);
         System.out.println("Min = "+min);
         
         System.out.println("Only Even number");
        //- it also work-  myIntList.stream().mapToInt(i->i).filter(i->i%2==0).forEach(l->System.out.println(l));
         // - consise code works - myIntList.stream().filter(i->i%2==0).forEach(l->System.out.println(l));
         //check if not null
         //myIntList.stream().filter(Objects::nonNull).forEach(i->System.out.println(i));
         
         productsList.stream().filter(obj->Objects.nonNull(obj)).forEach(l->System.out.println(l));
        // myIntList.parallelStream().forEach(l->System.out.println(l+20));
         //System.out.println("Only Steram");
         
         //update
         System.out.println("Updated Object of arraylist");
       //  myIntList.parallelStream().forEach(l->myIntList.add(l+20));
         
         //myIntList.stream().parallel().forEach(l->myIntList.add(l+30));
        // myIntList.forEach(l->System.out.println(l));
         
         
         
        /* IntStream.range(0, firstArray.length).parallel()
         .forEach(i -> { secArray[i] += firstArray[i]; });
         
         int[] result = IntStream.range(0, firstArray.length).parallel()
    .map(i -> firstArray[i] + secArray[i])
    .toArray();
         */
         
        
         System.out.println("new list is created");
         List<Integer> newMyIntList = new ArrayList<>();
         //--working //IntStream.range(0, myIntList.size()).forEach(i->newMyIntList.add((int)(myIntList.get(i))+20));
         //--check this - myIntList.stream().forEach(i->newMyIntList.add((int)(myIntList.get(i))+20));
         newMyIntList.forEach(l->System.out.println(l));
       //  myIntList.stream().forEach(l->System.out.println(l+20));
         // parallel stream for user defined object 
         
         //productsList.parallelStream().for
         
         
         
         System.out.println("Using set");
         Set<Products> setProdduct = productsList.stream().collect(Collectors.toSet());
         setProdduct.forEach(p->System.out.println("name = "+p.name));
        
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        //System.out.println(productPriceList);  
    }  
}  

// check max & min 
//parallelStream - check this 
//myIntList.stream().filter(Objects::nonNull).forEach(i->System.out.println(i));
//- it also work-  myIntList.stream().mapToInt(i->i).filter(i->i%2==0).forEach(l->System.out.println(l)); - maptoint

