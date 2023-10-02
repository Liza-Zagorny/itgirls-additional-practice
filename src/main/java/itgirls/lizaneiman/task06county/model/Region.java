package model;

import java.util.List;

public class Region {
    private String name;
    private List<String> settlementsNames;
    private String administrativeCentre;

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
        this.administrativeCentre = administrativeCentre;
    }

    public String getAdministrativeCentre() {
        return administrativeCentre;
    }

    @Override
    public String toString() {
        return "Region{" + "name='" + name + '\'' + ", settlementsNames=" + settlementsNames + ", administrativeCentre='" + administrativeCentre + '\'' + '}';
    }
}
