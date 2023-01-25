package hw9;
import hw9.phonebook.Phonebook;
import hw9.phonebook.Record;

import java.util.List;
public class Main {
    private static Phonebook phonebook;
    private static List<Record<String>> phonebook2 ;
    private static List< Record<Number> > phonebook3 ;
    public static void main(String[] args) {
        CountOccurrence.testCountOccurrence();
        System.out.println("------------------------");
        phonebook = new Phonebook();
        phonebook.fillPhonebook();
        phonebook.printPhonebook();
    }
    private static void fillPhonebook2() {
        Record<String> rec1 = new Record<>() ;
        rec1.setName( "User2" ) ;
        rec1.setPhone( "256-93-02" ) ;
        phonebook2.add( rec1 ) ;
    }
    private static void fillPhonebook3() {
        Record<Number> rec1 = new Record<>() ;
        rec1.setName( "User2" ) ;
        rec1.setPhone( 3470291 ) ;
        phonebook3.add( rec1 ) ;
    }
}
