package mavenproject1;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Ashot14 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		AShot ashot = new AShot();
		Screenshot sc = ashot.takeScreenshot(driver);
		ImageIO.write(sc.getImage(), "PNG", new File("C:\\Users\\Anand\\Downloads\\screenshot\\Ashot1.png"));
	}

}
