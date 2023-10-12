package model.entity;

import java.util.List;

public class City {
    private String name;
    private boolean isCapital;
    private boolean isAdministrativeCentre;
    private long population;
    private List<Citizen> citizensList;
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

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public void setCitizensList(List<Citizen> citizensList) {
        this.citizensList = citizensList;
    }

    public List<Citizen> getCitizensList() {
        return citizensList;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public List<District> getDistricts() {
        return districts;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + ", isCapital=" + isCapital + ", isAdministrativeCentre=" + isAdministrativeCentre + ", districts=" + districts + ", population=" + population + ", citizensList=" + citizensList +'}';
    }
}
