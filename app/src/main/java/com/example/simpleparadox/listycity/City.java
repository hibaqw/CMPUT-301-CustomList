package com.example.simpleparadox.listycity;

public class City implements Comparable<City> {
    /**
     * This variable contains the name of a city
     * this var is of type {@link String}
     */
    private String city;
    /**
     * This variable contains the name of a province
     * this var is of type {@link String}
     */
    private String province;


    /**
     * this is a constructor for the city
     * @param city
     * Give name of city, which should be of type {@link String}
     * @param province
     * Give name of province, which should be of type {@link String}
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * this function returns {@link City#city}
     * @return
     * return type is {@link String}
     */
    String getCityName(){
        return this.city;
    }
    /**
     * this function returns {@link City#province}
     * @return
     * return type is {@link String}
     */
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City city) {
        //compare this city to city another city
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object instanceof City)
        {
            sameSame = this.city == ((City) object).city;
        }

        return sameSame;
    }
}