package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Properties;
import models.Restapi;
import views.MainConsole;

public class MainController 
{
    MainConsole mainConsole;

    public MainController() 
    {
        this.mainConsole = new MainConsole();
        this.showProp();
    }

    private void showProp()
    {
        Restapi restapi = new Restapi();
        String res = restapi.getProperties();
        ArrayList<Properties> propList = convertStringToArray(res); 
        this.mainConsole.printProperties(propList);
    }

    private ArrayList<Properties> convertStringToArray(String res) 
    {
        ArrayList<Properties> propList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Properties[] propArray = gson.fromJson(res, Properties[].class);
        propList = new ArrayList<>(Arrays.asList(propArray));
        return propList;
        
    }
    
}
