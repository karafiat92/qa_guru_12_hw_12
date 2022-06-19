package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void someTest1 (){
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    void someTest2 (){
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    @Tag("test5")
    void someTest5 (){
        String version = System.getProperty("version", "100");
        String browserSize = System.getProperty("browserSize", "1920x1280");
        String browser = System.getProperty("browser", "safari");
        System.out.println(browser);
        System.out.println(browserSize);
        System.out.println(version);
    }
}
