package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {

@Test
    public void search(){
    driver.findElement(By.id("gh-search-input")).sendKeys("iPhone", Keys.ENTER);
    driver.close();
}
}
