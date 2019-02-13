package com.burahan.countrydemo;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private int populuation;
    private double landMassSize;
    private int medianAge;

    public Country(String name, int populuation, double landMassSize, int medianAge)
    {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.populuation = populuation;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopuluation()
    {
        return populuation;
    }

    public void setPopuluation(int populuation)
    {
        this.populuation = populuation;
    }

    public double getLandMassSize()
    {
        return landMassSize;
    }

    public void setLandMassSize(double landMassSize)
    {
        this.landMassSize = landMassSize;
    }

    public int getMedianAge()
    {
        return medianAge;
    }

    public void setMedianAge(int medianAge)
    {
        this.medianAge = medianAge;
    }
}
