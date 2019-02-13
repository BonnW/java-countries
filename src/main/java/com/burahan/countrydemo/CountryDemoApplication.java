package com.burahan.countrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryDemoApplication
{

    static CountryList ourCountryList;
    public static void main(String[] args)
    {
        ourCountryList = new CountryList();
        SpringApplication.run(CountryDemoApplication.class, args);
    }

}

