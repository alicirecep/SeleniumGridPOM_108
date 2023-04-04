package tests;

import org.testng.annotations.*;

import static manager.GridManager.*;
import static org.testng.Assert.assertEquals;

public class C02_SecondGridTest {

    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser") String browser) {

        setDriver("grid_chrome");
    }

    @Test
    void test01() {

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        String expectedWord = "Amazon.com. Spend less. Smile more.";
        assertEquals(expectedWord, driver.getTitle());

    }

    @AfterMethod
    void afterTest() {
        closeDriver();
    }


}
