package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_scenario_2 {

	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launchbrowser();
		navigateurl();
		loginasadmin();
		minimizeFlyOutWindow();
		createuser01();
		logout1();
		Loginasuser1();
		userwindow1();
		createuser02();
		logout2();
		loginasuser2();
		userwindow2();
		createuser03();
		logout3();
		loginasuser3();
		userwindow3();
		logout4();
		/*loginasuser02();
		userwindow4();
		modifypasswordforUser3();
		logout5();
		loginasuser03();
		userwindow5();
		logout6();
		Loginasuser01();
		userwindow6();
		modifypasswordforUser2();
		logout7();
		loginasuser02();
		logout8();
		loginasadmin1();
		modifypasswordforUser1();
		logout9();
		loginuser001();
		logout10();
		loginuser002();
		deleteUser3();
		logout11();
		loginuser0001();
		deleteUser2();
		logout12();
		loginasadmin2();
		deleteUser1();
		logout13();
		closeApplication();*/
		
	}

	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigateurl()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
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

	static void logout1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void Loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1demo");
			oBrowser.findElement(By.name("pwd")).sendKeys("america");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
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

	static void logout2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
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
	
	static void userwindow2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
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


	static void logout3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
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
	
	
	static void userwindow3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void logout4()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("successful");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
