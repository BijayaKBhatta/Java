package searchExample;


public class BinarySearch{

    public static void main(String []args){
       int a[] = {1,2,3,4,5,6,7};
       BinarySearch bs =  new BinarySearch();
       int number=3;
       int index = bs.binarySearch(a, number);
       System.out.println("Index is:"+index+"\n");
      
    }
    
    
    
    public int binarySearch(int arr[], int number){
       int high,low,mid;
       high=arr.length-1;
       low=0;
       while(low<=high){
           mid=(low+high)/2;
           if(arr[mid]==number){
               //System.out.println("Found\t"+number);
               return mid;
           }else if(arr[mid]>number){
                 //System.out.println(">"+arr[mid]);
               high=mid-1;
           }else{
               low=mid+1;
               System.out.println("<"+arr[mid]);
           }
       }
      
       return -1;
        
    }
}