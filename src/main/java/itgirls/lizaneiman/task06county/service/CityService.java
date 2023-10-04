package service;

import model.Citizen;
import model.City;
import model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CityService {

    private final String capitalName = Country.getInstance().getCapitalName();
    private final long cityPopulation = 1000;

    private static CityService instance = null;

    private CityService() {
    }

    public static CityService getInstance() {
        if (instance == null) {
            instance = new CityService();
        }
        return instance;
    }

    DistrictService districtService = DistrictService.getInstance();

    public City generateCity(String cityName) {
        City city = new City();
        city.setName(cityName);
        city.setCapital(Objects.equals(cityName, capitalName));
        // Currently only administrative centers are created. Should check if administrative centre later.
        city.setAdministrativeCentre(true);
        city.setPopulation(cityPopulation);
        city.setCitizensList(populateCitizens(cityPopulation));
        city.setDistricts(districtService.createDistrictsInCity(cityName));
        return city;
    }

    private List<Citizen> populateCitizens(long citizensNumber) {
        CitizenService citizenService = new CitizenService();
        List<Citizen> citizensList = new ArrayList<>();
        long i = 0;
        while (i < citizensNumber) {
            citizensList.add(citizenService.generateCitizen());
            i++;
        }
        return citizensList;
    }
}
