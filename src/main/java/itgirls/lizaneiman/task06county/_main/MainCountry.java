package _main;

import model.Citizen;
import model.Country;
import service.CitizenService;

import java.util.ArrayList;
import java.util.List;

public class MainCountry {
    public static void main(String[] args) {
        System.out.println("Country Exercise");

        Country country = Country.getInstance();
        CitizenService citizenService = new CitizenService();
        List<Citizen> citizenList = new ArrayList<>();

        while(Citizen.count < country.getPopulation()) {
            Citizen citizen = citizenService.generateCitizen();
            citizenList.add(citizen);
            System.out.println(citizen.getID());
        }
    }
}
