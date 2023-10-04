package service;

import model.Region;

import java.util.ArrayList;
import java.util.List;

public class RegionService {
    private final List<String> regionsNamesList = new ArrayList<>(List.of("Saint Andrew",
            "Saint David", "Saint George", "Saint John", "Saint Joseph",
            "Saint Luke", "Saint Mark", "Saint Patrick", "Saint Paul",
            "Saint Peter"));
    private static RegionService instance = null;

    private RegionService() {
    }

    public static RegionService getInstance() {
        if (instance == null) {
            instance = new RegionService();
        }
        return instance;
    }

    public List<String> getRegionsNamesList() {
        return regionsNamesList;
    }

    public Region createRegionByName(String regionName) {
        Region region = new Region();
        switch (regionName) {
            case "Saint Andrew" -> {
                region.setName("Saint Andrew");
                region.setSettlementsNames(List.of("Marigot", "Wesley", "Woodford Hill", "Calibishie", "Hampstead", "Bense"));
                region.setAdministrativeCentre("Marigot");
                region.setAreaSqKm(179.9);
                region.setPopulation(10250);
            }
            case "Saint David" -> {
                region.setName("Saint David");
                region.setSettlementsNames(List.of("Castle Bruce", "Grand Fond", "Rosalie", "Good Hope", "Petit Soufrière"));
                region.setAdministrativeCentre("Castle Bruce");
                region.setAreaSqKm(125.8);
                region.setPopulation(6758);
            }
            case "Saint George" -> {
                region.setName("Saint George");
                region.setSettlementsNames(List.of("Roseau", "Bath Estate", "Elmshall", "Kings Hill", "Copthall"));
                region.setAdministrativeCentre("Roseau");
                region.setAreaSqKm(56.2);
                region.setPopulation(19863);
            }
            case "Saint John" -> {
                region.setName("Saint John");
                region.setSettlementsNames(List.of("Portsmouth", "Capucin", "Clifton", "Cottage", "Toucari", "Tanetane"));
                region.setAdministrativeCentre("Portsmouth");
                region.setAreaSqKm(59.1);
                region.setPopulation(5322);
            }
            case "Saint Joseph" -> {
                region.setName("Saint Joseph");
                region.setSettlementsNames(List.of("Saint Joseph", "Salisbury", "Coulibistrie", "Mero", "Morne Raquette", "Belles"));
                region.setAdministrativeCentre("Saint Joseph");
                region.setAreaSqKm(118.4);
                region.setPopulation(5770);
            }
            case "Saint Luke" -> {
                region.setName("Saint Luke");
                region.setSettlementsNames(List.of("Pointe Michel"));
                region.setAdministrativeCentre("Pointe Michel");
                region.setAreaSqKm(10.8);
                region.setPopulation(1569);
            }
            case "Saint Mark" -> {
                region.setName("Saint Mark");
                region.setSettlementsNames(List.of("Soufrière", "Scotts Head", "Galion"));
                region.setAdministrativeCentre("Soufrière");
                region.setAreaSqKm(13.5);
                region.setPopulation(1909);
            }
            case "Saint Patrick" -> {
                region.setName("Saint Patrick");
                region.setSettlementsNames(List.of("Berekua", "La Plaine", "Bagatelle", "Boetica", "Bordeaux", "Delices", "Dubuc"));
                region.setAdministrativeCentre("Berekua");
                region.setAreaSqKm(86.7);
                region.setPopulation(8451);
            }
            case "Saint Paul" -> {
                region.setName("Saint Paul");
                region.setSettlementsNames(List.of("Pont Cassé", "Canefield", "Mahaut", "Massacre", "Cochrane", "Springfield Estate", "Pont Cassé"));
                region.setAdministrativeCentre("Pont Cassé");
                region.setAreaSqKm(66.4);
                region.setPopulation(8435);
            }
            case "Saint Peter" -> {
                region.setName("Saint Peter");
                region.setSettlementsNames(List.of("Colihaut", "Dublanc", "Bioche"));
                region.setAdministrativeCentre("Colihaut");
                region.setAreaSqKm(34.2);
                region.setPopulation(1448);
            }
            default -> {
                throw new IllegalStateException("Unexpected region name: " + regionName);
            }
        }
        return region;
    }

    public List<Region> setRegionList() {
        List<Region> regions = new ArrayList<>();
        for (String regionName : regionsNamesList) {
            regions.add(instance.createRegionByName(regionName));
        }
        return regions;
    }
}
