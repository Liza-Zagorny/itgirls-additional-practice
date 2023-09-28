package service;

import model.Citizen;

public class CitizenService {

    private int generateAge() {
        int minAge = 0;
        int maxAge = 99;
        return (int)Math.floor(Math.random() * (maxAge - minAge + 1) + minAge);
    }
    public Citizen generateCitizen() {
        Citizen citizen = new Citizen();

        return citizen;
    };

}
