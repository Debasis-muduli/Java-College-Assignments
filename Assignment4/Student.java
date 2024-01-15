/*Create a class Student having data members name, roll and address. Note that address is an
object of inner class Address having data members city and pin. Create some student class
objects. Read, store (using constructor) and display their information. While creating the
objects your program should display a message “Creating student number n” from the
constructor. You can get the value of n by using a static member of Student class which is
initialized to 0. */
public class Student {
    String name;
    int roll;
    Address address;

    static int studentCount = 0;

    Student(String name, int roll, String city, int pin) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);

        studentCount++;
    }

    public void displayInformation() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address: " + address.getCity() + ", " + address.getPin());
    }

    public static void main(String[] args) {
        System.out.println("Creating student number " + studentCount);
        Student student1 = new Student("A", 101, "City1", 751116);

        System.out.println("Creating student number " + studentCount);
        Student student2 = new Student("B", 102, "City2", 751044);

        student1.displayInformation();
        student2.displayInformation();
    }

    class Address {
        String city;
        int pin;

        Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }

        String getCity() {
            return city;
        }

        int getPin() {
            return pin;
        }
    }
}
