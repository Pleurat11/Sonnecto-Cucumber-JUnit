package com.sonnecto.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties = new Properties();

    static {
        try {
            //Open the file using Inputstream
            FileInputStream inputStream = new FileInputStream("configuration.properties");
            //Load to properties object
            properties.load(inputStream);

            //Close the file after loading
            // if we leave the file opened it will take space from memory.
            inputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Error occured while reading config file");
        }
    }
    /**
     Method is used to read value from  configuration.properties file.
     key-> key name in properties file
     return-> value for the key. Returns null if key not found

     */
    public static String getProperty(String key){

        return properties.getProperty(key);

    }
}
