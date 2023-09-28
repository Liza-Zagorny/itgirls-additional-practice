package service;

import model.Citizen;

public class CitizenService {

    private int generateInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public String generateWord() {
        int length = generateInt(3, 8);
        // Unicode Decimal Code of letters A-Z (capital) 65-90
        int randomCapitalChar = generateInt(65, 90);
        StringBuilder word = new StringBuilder();
        word.append((char) randomCapitalChar);
        while (word.length() < length) {
            // Unicode Decimal Code of letters a-z (small) 97-122
            int randomSmallChar = generateInt(97, 122);
            word.append((char) randomSmallChar);
        }
        return word.toString();
    }

    public Citizen generateCitizen() {
        Citizen citizen = new Citizen();
        citizen.setId();
        citizen.setAge(generateInt(0, 99));
        citizen.setFirstName(generateWord());
        citizen.setLastName(generateWord());

        return citizen;
    }

    ;

}
