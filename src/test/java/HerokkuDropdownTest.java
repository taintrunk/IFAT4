import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import parent.BaseTest;

import static org.testng.Assert.assertEquals;

public class HerokkuDropdownTest extends BaseTest {
    @Test
    public void DropdownCheck() {
        browser.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = browser.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        assertEquals(browser.findElement(By.cssSelector("option[value='1']")).getAttribute("selected"), "true");
    }
}
