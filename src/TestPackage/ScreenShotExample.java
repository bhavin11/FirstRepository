package TestPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class ScreenShotExample extends BaseClass {
	public static void main(String[] args) throws IOException {
		chrome.get("http://www.facebook.com");
		File SourceSnapshot = chromeSS.getScreenshotAs(OutputType.FILE);
		System.out.println(SourceSnapshot);
		File DestinationSnapshot = new File("./Snapshot/facebook.png");
		FileUtils.copyFile(SourceSnapshot, DestinationSnapshot);
		chrome.close();
		chrome.quit();
	}

}
