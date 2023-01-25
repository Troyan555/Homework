package hw9.phonebook;
/* Обобщенная ячейка с указанием типа для тлф. */
public class Record<T> {
    private String name ;
    private T phone ;

    public Record() {
    }

    public Record(String name, T phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPhone() {
        return phone;
    }

    public void setPhone(T phone) {
        this.phone = phone;
    }
}
