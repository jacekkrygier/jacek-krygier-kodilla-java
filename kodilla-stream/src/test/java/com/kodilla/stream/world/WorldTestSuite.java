package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country england = new Country("England", new BigDecimal("60000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        Country japan = new Country("Japan", new BigDecimal("120000000"));
        Country iran = new Country("Iran", new BigDecimal("80000000"));
        Country USA = new Country("USA", new BigDecimal("300000000"));
        Country canada = new Country("Canada", new BigDecimal("40000000"));
        Country mexico = new Country("Mexico", new BigDecimal("120000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(england);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(iran);

        Continent northAmerica = new Continent("Africa");
        northAmerica.addCountry(USA);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("2240000000"), result);
    }
}

