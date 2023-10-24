package model.entity;

import model.service.RegionService;

import java.util.List;

public class Country {
    private final String countryName = "Dominica";
    private List<Region> regions;
    private double areaSqKm;
    private long population;
    private final String capitalName = "Roseau";
    private static Country instance = null;

    static RegionService regionService = RegionService.getInstance();

    private Country() {
    }

    public static Country getInstance() {
        if (instance == null) {
            instance = new Country();
            instance.setRegions(regionService.setRegionList());
            List<Region> regions = instance.getRegions();
            double totalAreaSqKm = regionService.calcTotalArea(regions);
            long totalPopulation = regionService.calcTotalPopulation(regions);
            instance.setAreaSqKm(totalAreaSqKm);
            instance.setPopulation(totalPopulation);
        }
        return instance;
    }

    public String getName() {
        return "Dominica";
    }

    public String getCapitalName() {
        return this.capitalName;
    }

    public void setAreaSqKm(double areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public double getAreaSqKm() {
        return areaSqKm;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" + "countryName='" + instance.countryName + '\'' + ", area=" + instance.areaSqKm + ", population=" + instance.population + ", capitalName='" + instance.capitalName + '\'' + ", regions=" + instance.regions + '}';
    }
}
