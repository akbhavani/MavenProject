package appium_demo.demo;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	//public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub	
	
	File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Bhavani");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

//public static void main(String[] args) throws MalformedURLException {
	// TODO Auto-generated method stub
	
	//AndroidDriver<AndroidElement> driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
driver.findElementById("android:id/checkbox").click();
driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
driver.findElementById("android:id/edit").sendKeys("Hello");
driver.findElementById("android:id/button1").click();
driver.quit();
	//return driver;
	}

}
