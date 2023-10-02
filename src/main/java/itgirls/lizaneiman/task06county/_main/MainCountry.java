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
        System.out.println(country.toString());
        CitizenService citizenService = new CitizenService();
        List<Citizen> citizenList = new ArrayList<>();
//        String word = citizenService.generateWord();
//        String word1 = citizenService.generateWord();
//        String word2 = citizenService.generateWord();
//
//        System.out.println(word);
//        System.out.println(word2);
//        System.out.println(word1);
//        while(Citizen.count < country.getPopulation()) {
//            Citizen citizen = citizenService.generateCitizen();
//            citizenList.add(citizen);
//            System.out.println(citizen.toString());
//
//        }
    }
}
