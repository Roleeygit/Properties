package views;

import java.util.ArrayList;
import models.Properties;

public class MainConsole 
{

    public MainConsole() 
    {}
    

    public void printProperties(ArrayList<Properties> props) 
    {
        for(Properties prop: props)
        {
            System.out.println(prop.getAddress());
            System.out.println(prop.getCity());
            System.out.println(prop.getPrice());
            System.out.println(prop.getSize());
        }
    }
}
