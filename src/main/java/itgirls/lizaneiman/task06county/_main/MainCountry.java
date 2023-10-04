package _main;

import model.Citizen;
import model.City;
import model.Country;
import model.Region;
import service.CitizenService;
import service.CityService;
import service.RegionService;

import java.util.List;

public class MainCountry {
    public static void main(String[] args) {
        System.out.println("Country Exercise");
        CityService cityService = CityService.getInstance();
        City city1 = cityService.generateCity("Roseau");
        System.out.println(city1);


    }
}
