package hw3;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String email;
    private String phone;

    public Employee() {
        name = null;
        age = 0;
        position = null;
        email = null;
        phone = null;
    }

    public Employee(String FullName, int Age, String Pos, String Email, String number) {
        name = FullName;
        age = Age;
        position = Pos;
        email = Email;
        phone = number;
    }

    public void Print() {
        System.out.println(this.name + '\t' + this.age + '\t' + this.position + '\t' + this.email + '\t' + this.phone + '\n');
    }
}

