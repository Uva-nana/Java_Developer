import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ForEachinStream {

	public static void main(String[] args) {
		
List <String> fruitlist = Arrays.asList("Banana", "Mango", "Orange" ,"Pienapple");
//Source
Stream <String> stream =  fruitlist.stream();
stream.forEach(System.out::println);
System.out.println();
//:: is called method reference 
//instead of this we can also use method reference lambda expression
//stream.forEach((element) ->System.out.println(element));

	//create a Stream from a Set

Set <String> fruitset = new HashSet<> (fruitlist);
Stream <String> stream1 = fruitset.stream();
stream1.forEach(System.out::println);
System.out.println();


//create a stream from a Map, map doesnt have stream method so we should use entrySet
// because entry set returns a set.

Map <String, Integer> fruits = new HashMap<>();
fruits.put("Banana", 30);
fruits.put("Orange", 40);
fruits.put("Mango", 10);
fruits.put("Apple", 50);

//above  is source
//stream , as map dont have stream we need to use entrySet

Stream<Map.Entry<String,Integer>> streammap = fruits.entrySet().stream();
streammap.forEach(System.out::println);
System.out.println();

//create a stream from a map's key

Stream <String> keySetStream = fruits.keySet().stream();
keySetStream.forEach(System.out::println);
System.out.println();

//create a stream from a map's values

Stream <Integer> valuesstresm = fruits.values().stream();
valuesstresm.forEach(System.out::println);
System.out.println();



//create a stream from arrays

String [] strArrays = {"Banana" ,"Mango" ,"Orange", "Apple"};
Stream <String> stringarrays = Arrays.stream(strArrays);
stringarrays.forEach(System.out::println);
System.out.println();

//create a stream using Stream.of()

Stream <String> streamof = Stream.of("Banana" , "Apple", "Oramge", "Mango");
streamof.forEach(System.out::println);
System.out.println();
}

}
