package model;

import java.util.List;

public class Country {
    private final String name = "Dominica";
    private List<Region> regions;
    private final int areaSqKm = 751;
    private final long population = 7;
    private List<Citizen> citizens;
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

    public int getAreaSqKm() {
        return 751;
    }

    public long getPopulation() {
        return 7;//72412;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" + "name='" + instance.name + '\'' + ", area=" + instance.areaSqKm + '\'' + ", population=" + instance.population + '\'' + ", regions=" + instance.regions + ", citizens=" + instance.citizens + '}';
    }
}
