
/*1) launchBrowser-->navigate-->login as admin-->createuser [User1,User2,User3] -->logout--->
 * login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->login as admin
 *  [modify the password for User1,User2,User3] --> logout -->login as User1--->logout-->Login as User2 --> 
 *  logout -->login as User3 --> logout-->login as Admin --> Delete [User1,User2,User3]
 *  -->logout -->closeApplication*/

package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_assignment_scenario_01 {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser01();
		createuser02();
		createuser03();
		logoutasadmin();
		loginasuser1();
		welcomeWindow1();
		userwindow1();
		logoutasuser1();
		loginasuser2();
		welcomeWindow2();
		userwindow3();
		logoutasuser2();
		loginasuser3();
		welcomeWindow3();
		userwindow3();
		logoutasuser3();
		loginasadmin1();
		userwindow4();
		modifyUser01();
		modifyUser02();
		modifyUser03();
		logout();
		loginuser1();
		logoutuser1();
		loginuser2();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginasadmin();
		userwindow0();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logoutasadmin0();
		closeApplication();

	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".//library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createuser01()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user1demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("america");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("america");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}

	static void createuser02()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user2demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("mexico");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("mexico");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createuser03()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user3demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("england");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("england");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutasadmin()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




	static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("america");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void welcomeWindow1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void userwindow1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutasuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("mexico");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void welcomeWindow2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void userwindow2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutasuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("england");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void welcomeWindow3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void userwindow3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutasuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginasadmin1()	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void userwindow4()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void modifyUser01()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("usaaa");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("usaaa");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifyUser02()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("usaaa1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("usaaa1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifyUser03()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).click();
			Thread.sleep(2000); 
			oBrowser.findElement(By.name("password")).sendKeys("usaaa2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("usaaa2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("usaaa");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("usaaa1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("usaaa2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginasadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void userwindow0()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutasadmin0()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
