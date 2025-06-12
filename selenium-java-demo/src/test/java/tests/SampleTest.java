package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void openGoogleAndCheckTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"), "Title should contain 'Google'");
    }
}
