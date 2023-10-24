package model.service;

import model.entity.City;
import model.entity.Country;
import model.entity.Region;

import java.util.ArrayList;
import java.util.List;

public class CountryService {

    private static CountryService instance = null;
    private Country country;

    private CountryService() {
    }

    public static CountryService getInstance() {
        if (instance == null) {
            instance = new CountryService();
            instance.country = Country.getInstance();
        }
        return instance;
    }

    public String getCapitalName() {
        return country.getCapitalName();
    }

    public String getRegionsNumber() {
        return String.valueOf(country.getRegions().size());
    }

    public String getTotalCountryArea() {
        return String.valueOf(country.getAreaSqKm())+ " square kilometers";
    }

    public ArrayList<City> getListOfAdministrativeCentres() {
        List<Region> regions =  country.getRegions();
        ArrayList<City> administrativeCentres = new ArrayList<>();
        for (Region region : regions) {
            administrativeCentres.add(region.getAdministrativeCentre());
        }
        return administrativeCentres;
    }
}
