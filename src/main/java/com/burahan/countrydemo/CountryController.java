package com.burahan.countrydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController
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

    @RequestMapping("size")
    public ArrayList<Country> listBySize(@RequestParam(value = "num") int num)
    {
        return CountryDemoApplication.ourCountryList.listBySize(num);
    }
}
