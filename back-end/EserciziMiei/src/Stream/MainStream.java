package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

	public static void main(String[] args) {
		
    List <Integer> number = Arrays.asList(2 , 4, 5, 6, 7 ,8);
    
    Stream<Integer> risultato = number.stream().filter(x -> x>5);
    risultato.forEach(System.out::println);

	List <Integer> number1 = Arrays.asList(2 , 4, 5);
	
    Stream<Integer> risultato1 = number1.stream().map(n ->n * 2);
    risultato1.forEach(System.out::println);
    
    List <String>Lista = new ArrayList<>();
    Lista .add("Mario");
    Lista .add("Stella");
    Lista .add("Briciola");
    
    Set<String>Lista1 = Lista.stream().collect(Collectors.toSet());
    System.out.println(Lista1);
    
	}
    
    
    
    

}
