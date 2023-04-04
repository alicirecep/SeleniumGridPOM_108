package tests;

import org.testng.annotations.*;

import static manager.GridManager.*;
import static org.testng.Assert.assertEquals;

public class C04_FourthGridTest {
    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser")String browser){

        setDriver("grid_IE");
    }

    @Test
    void test01(){

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
        String expectedWord="IT Bootcamp, Distance education method - Wise Quarter Course";
        assertEquals(expectedWord, driver.getTitle());

    }

    @AfterMethod
    void afterTest() {
        closeDriver();
    }
}
