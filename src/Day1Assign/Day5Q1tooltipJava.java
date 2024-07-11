package Day1Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
public class TooltipAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Tekarch.com");

		{
            // Hover over the element to trigger the tooltip
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();

            // Get the tooltip text
            String tooltipText = element.getAttribute("title");
            System.out.println("Tooltip Text: " + tooltipText);
        }

        // Close the browser
        driver.quit();
    }

	}

