package service;

import model.City;
import model.Country;

import java.util.Objects;

public class CityService {

    private final String capitalName = Country.getInstance().getCapitalName();
    DistrictService districtService = new DistrictService();
    public City generateCity(String cityName) {
        City city = new City();
        city.setName(cityName);
        city.setCapital(Objects.equals(cityName, capitalName));
        city.setAdministrativeCentre(true); // Should check if administrative centre later.
        city.setDistricts(districtService.createDistrictsInCity(cityName));
        return city;
    }
}
