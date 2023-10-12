package model.entity;

public class District {
    private String districtDirection;
    private String cityName;

    public void setDistrictDirection(String districtDirection) {
        this.districtDirection = districtDirection;
    }

    public String getDistrictDirection() {
        return districtDirection;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return "District{" + "districtDirection='" + districtDirection + '\'' + ", cityName='" + cityName + '\'' + '}';
    }
}
