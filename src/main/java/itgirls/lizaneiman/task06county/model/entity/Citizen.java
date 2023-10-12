package model.entity;

public class Citizen {
    int id;
    String firstName; // Rand
    String lastName; // Rand
    int age; // Rand
    private static Country country;
    public static int count;

    static int generateID() {
        return ++count;
    }

    public void setId() {
        this.id = generateID();
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Country getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void setCountry() {
        Citizen.country = Country.getInstance();
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Citizen{" + "id='" + id + '\'' + ", age=" + age + '\'' + ", firstName=" + firstName + '\'' + ", lastName=" + lastName + '}';
    }
}
