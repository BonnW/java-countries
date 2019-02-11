package com.burahan.countrydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NameController
{
    @RequestMapping("/all")
    public ArrayList<Country> getAllCountries()
    {
        return CountryDemoApplication.ourCountryList.getAllCountries();
    }

    @RequestMapping("begin")
    public ArrayList<Country> getByFirstLetter(@RequestParam(value = "letter") char letter)
    {
        return CountryDemoApplication.ourCountryList.getByFirstLetter(letter);
    }

    @RequestMapping("namesize")
    public ArrayList<Country> listByNameSize(@RequestParam(value = "letters") int num)
    {
        return CountryDemoApplication.ourCountryList.listByNameSize(num);
    }

    @RequestMapping("popsize")
    public ArrayList<Country> listByPopSize(@RequestParam(value = "people") int num)
    {
        return CountryDemoApplication.ourCountryList.listByPopSize(num);
    }

}

