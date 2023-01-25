package hw9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Cell> phonebook ;

    public Phonebook() {
        phonebook = new ArrayList<>();
        }
        public void add(Cell cell){
        phonebook.add(cell);
        }
    public void fillPhonebook() {
        Cell cell = new Cell() ;
        cell.setName( "User" ) ;
        cell.setPhone( 1234455 ) ;
        phonebook.add( cell ) ;
        Cell cell1 = new Cell( "Admin", 3215544 ) ;
        phonebook.add( cell1 ) ;
        phonebook.add( new Cell( "Moder", 2317744 ) ) ;
    }

    public void printPhonebook() {
        for( Cell cell : phonebook ) {
            System.out.println( cell.getName() + "\t" + cell.getPhone() ) ;
        }
        System.out.println( "-----------------------------" ) ;
    }

    public void printByName() {
        phonebook.sort( (c1, c2) -> c1.getName().compareTo( c2.getName() ) ) ;
        for( Cell cell : phonebook ) {
            System.out.println( cell.getName() + "\t" + cell.getPhone() ) ;
        }
        System.out.println( "-----------------------------" ) ;
    }

    public void printByPhone() {
        phonebook.sort( (c1, c2) -> c1.getPhone() - c2.getPhone() ) ;
        for( Cell cell : phonebook ) {
            System.out.println( cell.getName() + "\t" + cell.getPhone() ) ;
        }
        System.out.println( "-----------------------------" ) ;
    }
}
