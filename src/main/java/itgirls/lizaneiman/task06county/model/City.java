package model;

import java.util.List;

public class City {
    private String name;
    private boolean isCapital;
    private boolean isAdministrativeCentre;
    private List<District> districts;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setAdministrativeCentre(boolean administrativeCentre) {
        isAdministrativeCentre = administrativeCentre;
    }

    public boolean isAdministrativeCentre() {
        return isAdministrativeCentre;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public List<District> getDistricts() {
        return districts;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + ", isCapital=" + isCapital + ", isAdministrativeCentre=" + isAdministrativeCentre + ", districts=" + districts + '}';
    }
}
