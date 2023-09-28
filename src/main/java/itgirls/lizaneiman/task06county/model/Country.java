package model;

import java.util.List;

public class Country {
    private List<Region> regions;
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
}
