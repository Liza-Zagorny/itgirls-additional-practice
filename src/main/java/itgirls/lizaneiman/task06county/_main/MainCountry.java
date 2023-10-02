package _main;

import model.Country;
import service.CitizenService;
import service.RegionService;

public class MainCountry {
    public static void main(String[] args) {
        System.out.println("Country Exercise");

        Country country = Country.getInstance();

        CitizenService citizenService = new CitizenService();
        RegionService regionService = RegionService.getInstance();

       country.setRegions(regionService.setRegionList());

        System.out.println(country);
    }
}
