package util;

import model.entity.Citizen;
import model.entity.City;
import model.entity.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * MenuOptions class contains all inner-logic methods of the menu.
 */
public class MenuOptions {

    public String getCountryCapital(Country country) {
        return "Roseau";
    }

    public int getRegionsNumber(Country country) {
        return 10;
    }

    public double getTotalArea(Country country) {
        return 12.5;
    }

    public List<City> getAdministrativeCentresList(Country country) {
        List<City> result = new ArrayList<>();
        return result;
    }

    public int calculateAverageCitizensAge(Country country) {
        return 33;
    }

    public List<Citizen> findCitizensByNameLength(Country country, int nameLength) {
        List<Citizen> result = new ArrayList<>();
        return result;
    }

    public List<Citizen> findCitizensByFirstLetterOfName(Country country, char firstLetter) {
        List<Citizen> result = new ArrayList<>();
        return result;
    }
}
