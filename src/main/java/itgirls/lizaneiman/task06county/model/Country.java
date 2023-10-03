package model;

import java.util.List;

public class Country {
    private final String countryName = "Dominica";
    private List<Region> regions;
    private final int areaSqKm = 751;
    private final long population = 7;
    private final String capitalName ="Roseau";
    private static Country instance = null;

    //private List<String> region;
    private Country() {
    }

    public static Country getInstance() {
        if (instance == null) {
            instance = new Country();
        }
        return instance;
    }

    public String getName() {
        return "Dominica";
    }
    public String getCapitalName() {
        return "Roseau";
    }
    public int getAreaSqKm() {
        return 751;
    }

    public long getPopulation() {
        return 7;//72412;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" + "countryName='" + instance.countryName + '\'' + ", area=" + instance.areaSqKm + '\'' + ", population=" + instance.population + '\'' +"capitalName='" + instance.capitalName + '\'' + ", regions=" + instance.regions  + '}';
    }
}
