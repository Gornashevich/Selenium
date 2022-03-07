package onliner.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static final String BROWSER = "chrome";
    public static final Boolean BROWSER_OPEN = true;

    protected static FileInputStream fileInputStream;
    protected static FileInputStream fileInputStreamData;
    protected static Properties CONFIG_PROPERTIES;
    protected static Properties DATA_PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            CONFIG_PROPERTIES = new Properties();
            CONFIG_PROPERTIES.load(fileInputStream);
            fileInputStreamData = new FileInputStream("src/main/resources/data.properties");
            DATA_PROPERTIES = new Properties();
            DATA_PROPERTIES.load(fileInputStreamData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getConfigProperties(String key) {
        return CONFIG_PROPERTIES.getProperty(key);
    }
    public static String getDataProperty(String key) {
        return DATA_PROPERTIES.getProperty(key);
    }
}


