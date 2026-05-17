package JAVA8CODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortonthebasisofid {
	
	public static void main(String[] args) {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "aa", 11));
        noteLst.add(new Notes(3, "cc", 33));
        noteLst.add(new Notes(4, "bb", 44));
		noteLst.add(new Notes(2, "dd", 34));
        noteLst.add(new Notes(5, "zz", 32));

		// java 8 sort according to id 1,2,3,4,5
        //noteLst.sort((n1, n2)->n1.getId()-n2.getId());
        
        
        
        
        // vailue 15 se bada na ho
        List<Notes> noteLst5 = noteLst.stream()
                .filter(note -> note.getValue() > 15).filter(note -> note.getId() > 3)
                .sorted(
                        Comparator.comparing(Notes::getId)
                                .thenComparing(Notes::getName)
                )
                .toList();
        
        Collections.sort(noteLst, Comparator.comparing(Notes::getId)); // for single
        
        //Collections.sort(noteLst, Comparator.comparing(Notes::getId).thenComparing(Notes::getName));

        // Printing the sorted list using Java 8 lambda expressions
        //noteLst5.forEach(note -> System.out.println(note.toString()));
        
        noteLst5.forEach(System.out::println);;

		//java 8 print the notes using lamda
		//noteLst.forEach((note)->System.out.println(note.toString()));
    }


}
