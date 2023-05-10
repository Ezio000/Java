public class ConsoleApplication {
}
public static void main(String[] args) {
    Person person1 = new Person("p1", "t1", 2000);
    Person person2 = new Person("p2", "t2", 2001);
    Person person3 = new Person("p3", "t3", 2002);
    Person person4 = new Person("p4", "t4", 2003;
    Person person5 = new Person("p5", "t5", 2004);

}
}
public class Person's info' {
    private String firstName;
    private  String lastName;
    private int birthYear;
    public static int count = 0;

    public Person(){
        count++;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        count++;
    }

    public int getAge(){
        return 2020 - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}