package model;

import service.CityService;

import java.util.List;

public class Region {
    private String name;
    private List<String> settlementsNames;
    private City administrativeCentre;
    private long population;
    private double areaSqKm;
    CityService cityService = CityService.getInstance();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSettlementsNames(List<String> settlementsNames) {
        this.settlementsNames = settlementsNames;
    }

    public List<String> getSettlementsNames() {
        return settlementsNames;
    }

    public void setAdministrativeCentre(String administrativeCentre) {

        this.administrativeCentre = cityService.generateCity(administrativeCentre);
        ;
    }

    public void setAreaSqKm(double areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public double getAreaSqKm() {
        return areaSqKm;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public City getAdministrativeCentre() {
        return administrativeCentre;
    }

    @Override
    public String toString() {
        return "Region{" + "name='" + name + '\'' + ", settlementsNames=" + settlementsNames + ", administrativeCentre=" + administrativeCentre + '}';
    }
}
