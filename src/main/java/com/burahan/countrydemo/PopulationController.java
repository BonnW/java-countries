package com.burahan.countrydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController
{
    @RequestMapping("size")
    public ArrayList<Country> getFromPopSize(@RequestParam(value = "people") int num)
    {
        return CountryDemoApplication.ourCountryList.listByPopSize(num);
    }

    @RequestMapping("/min")
    public Country getMinPop()
    {
        return CountryDemoApplication.ourCountryList.getMinPop();
    }

    @RequestMapping("/max")
    public Country getMaxPop()
    {
        return CountryDemoApplication.ourCountryList.getMaxPop();
    }
}
