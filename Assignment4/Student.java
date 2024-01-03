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
        Student student1 = new Student("A", 101, "City1", 751006);

        System.out.println("Creating student number " + studentCount);
        Student student2 = new Student("B", 102, "City2", 751004);

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
