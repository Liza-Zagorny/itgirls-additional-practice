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
            }
            case "Saint David" -> {
                region.setName("Saint David");
                region.setSettlementsNames(List.of("Castle Bruce", "Grand Fond", "Rosalie", "Good Hope", "Petit Soufrière"));
                region.setAdministrativeCentre("Castle Bruce");
            }
            case "Saint George" -> {
                region.setName("Saint George");
                region.setSettlementsNames(List.of("Roseau", "Bath Estate", "Elmshall", "Kings Hill", "Copthall"));
                region.setAdministrativeCentre("Roseau");
            }
            case "Saint John" -> {
                region.setName("Saint John");
                region.setSettlementsNames(List.of("Portsmouth", "Capucin", "Clifton", "Cottage", "Toucari", "Tanetane"));
                region.setAdministrativeCentre("Portsmouth");
            }
            case "Saint Joseph" -> {
                region.setName("Saint Joseph");
                region.setSettlementsNames(List.of("Saint Joseph", "Salisbury", "Coulibistrie", "Mero", "Morne Raquette", "Belles"));
                region.setAdministrativeCentre("Saint Joseph");
            }
            case "Saint Luke" -> {
                region.setName("Saint Luke");
                region.setSettlementsNames(List.of("Pointe Michel"));
                region.setAdministrativeCentre("Pointe Michel");
            }
            case "Saint Mark" -> {
                region.setName("Saint Mark");
                region.setSettlementsNames(List.of("Soufrière", "Scotts Head", "Galion"));
                region.setAdministrativeCentre("Soufrière");
            }
            case "Saint Patrick" -> {
                region.setName("Saint Patrick");
                region.setSettlementsNames(List.of("Berekua", "La Plaine", "Bagatelle", "Boetica", "Bordeaux", "Delices", "Dubuc"));
                region.setAdministrativeCentre("Berekua");
            }
            case "Saint Paul" -> {
                region.setName("Saint Paul");
                region.setSettlementsNames(List.of("Pont Cassé", "Canefield", "Mahaut", "Massacre", "Cochrane", "Springfield Estate", "Pont Cassé"));
                region.setAdministrativeCentre("Pont Cassé");
            }
            case "Saint Peter" -> {
                region.setName("Saint Peter");
                region.setSettlementsNames(List.of("Colihaut", "Dublanc", "Bioche"));
                region.setAdministrativeCentre("Colihaut");

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
