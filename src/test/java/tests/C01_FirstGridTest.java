package tests;

import org.testng.annotations.*;

import java.net.MalformedURLException;

import static manager.GridManager.driver;
import static manager.GridManager.setDriver;
import static org.testng.Assert.assertEquals;


public class C01_FirstGridTest {

    @Parameters("browser")  // Parametre olarak "browser" kulalnacagimizi belirttik.
    @BeforeMethod
    void beforeTest(@Optional("browser") String browser) {   // Optional parametre oalrak "browser" kullanarak setDriver methodunu
        //methodCall yaptik. Optional parametre yerine browser ismini girdik.
        setDriver("grid_firefox");
    }

    @Test
    void test01() throws MalformedURLException {

        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        String expectedWord = "YouTube";
        assertEquals(expectedWord, driver.getTitle());

    }

    @AfterMethod
    void afterTest() {
        driver.close();
    }

}
