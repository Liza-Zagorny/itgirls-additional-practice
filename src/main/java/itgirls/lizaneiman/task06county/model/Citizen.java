package model;

public class Citizen {
    int id;
    String firstName; // Rand
    String lastName; // Rand
    int age; // Rand
    private static Country country;
    public static int count;

    static int generateID(){
        return  count++;
    }
    public int getID() {
        return Citizen.generateID();
    }
}
