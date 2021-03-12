package com.sgtesting.acttime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssignment1 {

	public static WebDriver oBrowser = null;

	public static void main(String[] args) {

		launchbrowser();
		navigate();
		login();
		popupwindow();
		creatuser1();
		logout();
		loginasusername1();
		createuser2();
		modifyuser2();
		logout();
		loginasuser2();
		createuser3();
		logout();
		login();
		user1passwordchange();
		logout();
		loginaschangepassworduser1();
		logout();
		loginasuser2();
		deleteuser3();
		logout();
		loginaschangepassworduser1();
		deleteuser2();
		logout();
		login();
		deleteuser1();
		logout();
		closeapplication();

	}

	static void launchbrowser() {
		String path = null;
		try {
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();// case3
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void popupwindow() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void creatuser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='content users']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();// case4
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logout() {
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginasusername1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();// case3
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='startExploringArrow']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();// case3
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();// case4
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void modifyuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='userNameSpan']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();// case4
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginasuser2() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[contains(@class,'init')]")).click();// case12-contains
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createuser3() {
		try {
			oBrowser.findElement(By.xpath("//span[starts-with(@class,'startExploringArrow')]")).click();// case9
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();// case3
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();// case4
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();// case11
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void user1passwordchange() {
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginaschangepassworduser1() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteuser3() {
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='3, user']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteuser2() {
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='2, user']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteuser1() {
		try {
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeapplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
