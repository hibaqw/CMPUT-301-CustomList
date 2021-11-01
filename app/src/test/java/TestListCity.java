import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;

    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }
    @Test
    /**
     * this function tests add function
     */
    public void addCityTest(){
        createList();
        int listSize= list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize +1);
    }

    @Test
    /**
     * this function tests if list contains given city
     */
    public void hasCityTest(){
        createList();
        City city1= new City("Edmonton", "AB");
        list.addCity(city1);
        assertTrue(list.hasCity(city1),"City is in list");
        City city2= new City("Miami", "Florida");
        assertFalse(list.hasCity(city2),"City is NOT list");


    }
    @Test
    /**
     * this function tests if list contains given city has been succesfully deleted
     */
    public void deleteCity(){
        createList();
        City city1= new City("Edmonton", "AB");
        list.addCity(city1);
        int listSize= list.getCount();
        list.deleteCity(city1);
        assertEquals(list.getCount(),listSize -1);


    }
}


