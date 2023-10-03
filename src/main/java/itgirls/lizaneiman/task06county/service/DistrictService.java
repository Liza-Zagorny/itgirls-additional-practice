package service;

import model.District;

import java.util.ArrayList;
import java.util.List;

public class DistrictService {

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
