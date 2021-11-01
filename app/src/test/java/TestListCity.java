import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void hasCityTest(){
        createList();
        City city= new City("Edmonton", "AB");
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity(city),"City is in list");



    }





}
