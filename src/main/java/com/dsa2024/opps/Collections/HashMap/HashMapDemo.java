package com.dsa2024.opps.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulationMap = new HashMap<>();

        // Add country-population pairs to the map
        countryPopulationMap.put("China", 1444216107); // Population in billions
        countryPopulationMap.put("India", 1393409038);
        countryPopulationMap.put("United States", 331883986);
        countryPopulationMap.put("Indonesia", 276361783);
        countryPopulationMap.put("Pakistan", 225199937);

        // Print the entire map
        System.out.println("Country Population Map: " + countryPopulationMap);

        // Iterate over using keySet()
        Set<String> keys = countryPopulationMap.keySet();
        System.out.println(keys);

        // Iterate over the map to print each country and population
        System.out.println("All countries and their populations:");
        for (String key : keys) {
            System.out.println(key + ": " + countryPopulationMap.get(key));
        }

        // Iterating using entrySet()
        for (Map.Entry<String, Integer> entry : countryPopulationMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Population: " + entry.getValue());
        }

        // Iterating using values()
        for (Integer population : countryPopulationMap.values()) {
            System.out.println("Population: " + population);
        }

        // using forEach() (Lambda Expression)
        countryPopulationMap.forEach(
                (country, population) -> System.out.println("Country: " + country + ", Population: " + population));

    }
}
