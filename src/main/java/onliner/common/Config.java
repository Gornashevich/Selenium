package onliner.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static final String BROWSER = "chrome";
    public static final Boolean BROWSER_OPEN = true;

    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            fileInputStream = new FileInputStream("src/main/resources/data.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);

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

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}


