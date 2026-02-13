package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructs a City object with a specified name and province.
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return Returns the city name as a String
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province.
     * @return Returns the province name as a String
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city to another city based on the city name.
     * @param o The other city to compare to
     * @return A negative integer, zero, or a positive integer as this city name
     * is less than, equal to, or greater than the specified city name
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Compares this City to the specified object. The result is true if and only if
     * the argument is not null and is a City object that has the same city name and province.
     * @param o The object to compare this City against
     * @return true if the given object represents a City equivalent to this city, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * Returns a hash code value for the object, based on the city name and province.
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}