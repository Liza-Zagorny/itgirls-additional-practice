package model;

public class District {
    private String districtDirection;
    private City city;

    public void setDistrictDirection(String districtDirection) {
        this.districtDirection = districtDirection;
    }

    public String getDistrictDirection() {
        return districtDirection;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
