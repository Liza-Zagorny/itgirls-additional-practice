package _main;

import model.City;
import model.Country;
import service.CitizenService;
import service.CityService;
import service.RegionService;

public class MainCountry {
    public static void main(String[] args) {
        System.out.println("Country Exercise");

        Country country = Country.getInstance();

        CitizenService citizenService = new CitizenService();
        RegionService regionService = RegionService.getInstance();
        CityService cityService = new CityService();
        country.setRegions(regionService.setRegionList());

        City city1 = cityService.generateCity("Roseau");
        City city2 = cityService.generateCity("Marigot");

        System.out.println(city1);
        System.out.println();
        System.out.println(city2);
    }
}
