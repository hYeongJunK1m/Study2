package thisex;

public class PersonTest {
    public static void main(String[] args) {

        Person personNoname = new Person();
        personNoname.showInfo();

        Person personLee = new Person("Lee", 30);
        personLee.showInfo();
        System.out.println(personLee);

        Person P =personLee.getSelf();
        System.out.println(P);
    }
}
