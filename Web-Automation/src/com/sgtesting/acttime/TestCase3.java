package com.sgtesting.acttime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {


	public static WebDriver oBrowser = null;
	
	public static void main(String[] args) {
		
			launchBrowser();
			navigate();
			login();
			createCustomer();
			deleteCustomer();
			logout();
			closeApplication();
			
		}
		
		public static void launchBrowser() {
			
			try {
				
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser = new ChromeDriver();
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		
		public static void navigate() {
			try {
				
				oBrowser.get("http://localhost:8081/login.do");
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void login() {
			try {
				
				oBrowser.findElement(By.name("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		static void minimizeFlyOutWindow() {
			try {
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		static void createCustomer() {
			try {
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
				oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
				Thread.sleep(500);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
				oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("New Customer for ActiTime");
				oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		static void deleteCustomer() {
			try {
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(500);
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]")).click();
				oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
				oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		static void logout() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		static void closeApplication() {
			try {
				oBrowser.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

