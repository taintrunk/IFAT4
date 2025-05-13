import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import parent.BaseTest;

import static org.testng.Assert.assertEquals;

public class HerokkuTest extends BaseTest {
    @Test
    public void EnteredKeysCheck() {
        browser.get("https://the-internet.herokuapp.com/key_presses?");
        browser.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ESCAPE);
        assertEquals(browser.findElement(By.xpath("//p[@id='result']")).getText(), "You entered: ESCAPE", "Expected - You entered: ESCAPE");
    }
}
