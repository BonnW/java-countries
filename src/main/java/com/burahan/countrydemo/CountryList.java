package com.burahan.countrydemo;

import java.util.ArrayList;

public class CountryList
{
    public ArrayList<Country> countryList = new ArrayList<Country>();

    public CountryList()
    {
        countryList.add(new Country("Thailand", 100000, 150000, 32));
        countryList.add(new Country("Taiwan", 50000, 64000, 52));
        countryList.add(new Country("United States", 8000000, 320000, 64));
        countryList.add(new Country("Antarctica", 1, 1000000, 22));
        countryList.add(new Country("Japan", 80000, 75000, 40));
        countryList.add(new Country("Africa", 800000, 300000, 28));
    }

    public Country findCountry(CheckCountry tester)
    {
        for (Country c : countryList)
        {
            if (tester.test(c))
            {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Country> getAllCountries()
    {
        countryList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));
        return countryList;
    }

    public ArrayList<Country> getByFirstLetter(char x)
    {
        ArrayList<Country> returnList = new ArrayList<Country>();

        for (Country c : countryList)
        {
            if (c.getName().charAt(0) == x)
            {
                returnList.add(c);
            }
        }
        returnList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));

        return returnList;
    }

    public ArrayList<Country> listByNameSize(int num)
    {
        ArrayList<Country> returnList = new ArrayList<Country>();

        for (Country c : countryList)
        {
            if (c.getName().length() >= num)
            {
                returnList.add(c);
            }
        }
        returnList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));

        return returnList;
    }

    public ArrayList<Country> listByPopSize(int num)
    {
        ArrayList<Country> returnList = new ArrayList<Country>();

        for (Country c : countryList)
        {
            if (c.getPopuluation() >= num)
            {
                returnList.add(c);
            }
        }
        returnList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));

        return returnList;
    }

}
