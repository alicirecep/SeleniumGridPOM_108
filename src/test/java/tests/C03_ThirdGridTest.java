package tests;

import org.testng.annotations.*;

import static manager.GridManager.*;
import static org.testng.Assert.assertEquals;

public class C03_ThirdGridTest {

    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser")String browser){

        setDriver("grid_Edge");
    }

    @Test
    void test01(){

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        String expectedWord="Google";
        assertEquals(expectedWord, driver.getTitle());

    }

    @AfterMethod
    void afterTest() {
        closeDriver();
    }


}
