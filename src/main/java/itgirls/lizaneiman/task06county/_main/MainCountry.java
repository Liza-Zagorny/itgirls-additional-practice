package _main;

import model.Country;
import model.Region;
import service.CitizenService;
import service.RegionService;

import java.util.List;

public class MainCountry {
    public static void main(String[] args) {
        System.out.println("Country Exercise");
        Country country = Country.getInstance();

        System.out.println(country);

    }
}
