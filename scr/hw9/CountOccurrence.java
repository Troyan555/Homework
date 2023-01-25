package hw9;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CountOccurrence {
    public static void testCountOccurrence() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add("Java");

        String str = "Hello";
        System.out.println(str + " - " + countOccurrence(list, str));
        str = "World";
        System.out.println(str + " - " + countOccurrence(list, str));
        str = "C++";
        System.out.println(str + " - " + countOccurrence(list, str));

    }

    private static int countOccurrence(List<String> list,String str ){
            int res = 0 ;

            for( String s : list ) {
                if( s.equals( str ) ) {
                    ++res ;
                }
            }
            return res;
        }

    private static void testToList() {
        Integer[] arr = { 5, 4, 3, 2, 1 } ;
        System.out.println( toList( arr ).getClass() ) ;
    }
    private static List<?> toList( Object[] arr ) {
        // return Arrays.asList( arr ) ;
         List<Object> res = new ArrayList<>() ;
         for( Object element : arr ) {
         res.add( element ) ;
         }
         return res ;
        }
}

