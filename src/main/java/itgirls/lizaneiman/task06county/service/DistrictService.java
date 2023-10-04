package service;

import model.City;
import model.District;

import java.util.ArrayList;
import java.util.List;

public class DistrictService {

    private static DistrictService instance = null;

    private DistrictService() {
    }

    public static DistrictService getInstance() {
        if (instance == null) {
            instance = new DistrictService();
        }
        return instance;
    }

    public List<District> createDistrictsInCity (String cityName) {
        List<District> districts = new ArrayList<>();
        District northDistrict = new District();
        northDistrict.setDistrictDirection("North");
        northDistrict.setCityName(cityName);
        District southDistrict = new District();
        southDistrict.setDistrictDirection("South");
        southDistrict.setCityName(cityName);
        districts.add(northDistrict);
        districts.add(southDistrict);

        return districts;
    };
}
