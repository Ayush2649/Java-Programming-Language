import java.util.*;
public class SDP{
   public static void main(String args[]){
    // Array first element backgound size 10 next formula (n + (n/2) +1)
    // ArrayList<String> studentName=new ArrayList<>();
    // studentName.add("Ashwini");
    // List<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(10);
    // list.add(100);
    // list.add(2);
    // list.add(20);
    // list.add(200);
    // list.add(3);
    // list.add(7,30);
    // System.out.println(list);
    
    // List <Integer> newList = new ArrayList<>();
    // newList.add(300);
    // newList.add(4);
    // list.addAll(newList);
    // System.out.println(list);
    // System.out.println(list.get(1));  
    // list.remove(1);
    // System.out.println(list);
    // list.remove(Integer.valueOf(30));
    // System.out.println(list);
    // // list.clear();
    // System.out.println(list);
    // System.out.println(list.contains(50));

    // //Traversal using for loop
    // for(int i = 0; i < list.size(); i++){
    //     System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

    // //Traversal using for each
    // for(Integer element : list) {
    //     System.out.print(element + " ");
    // }   
    
    // Hashset
    // Set<Integer> set = new HashSet<Integer>(); 
    // Set<Integer> set = new LinkedSet<Integer>(); 
    // Set<Integer> set = new TreeSet<Integer>(); 
    // set.add(1);
    // set.add(10);
    // set.add(100);
    // set.add(2);
    // set.add(20);
    // set.add(20);
    // System.out.print(set);
    // set.remove(100);
    // System.out.print(set);


    // Maps
    // Map<String, Integer> numbers = new HashMap<>();
    Map<String, Integer> numbers = new TreeMap<>();
    numbers.put("One",1);
    numbers.put("Two",2);
    numbers.put("Three",3);
    numbers.put("Four",4);
    numbers.put("Five",5);
    System.out.println(numbers);
    if(!numbers.containsKey("Two")){
    numbers.put("Two",20);
    }
    System.out.println(numbers);

    // Iteration in map using Entry class
    for(Map.Entry<String,Integer> e:numbers.entrySet()){
        System.out.println(e);
    }
   } 
}
