
/*2)launchBrowser-->navigate-->login as admin-->createuser [User1] -->logout ->login as User1-->
createUser [User2] -->logout -->login as User2 --> createUser [User3]--> logout-->
login as User3 --> logout -->login as User2 -->modify password for User3-->logout --> 
login as User3 --> logout-->login as User1 -->modify password for User2 -->
 logout -->login as User2 --> logout-->login as admin--> modify password for User1 
--> logout -->login as User1 --> logout --> login as User2 --> Delete User3--> logout -->
 login as User1 --> delete USer2 --> logout --> login as Admin -->
 delete User1 --> logout --> closeApplication*/



package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCENARIO_2_ACTITIME_ASSIGNMENT {
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
		loginasuser02();
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
		closeApplication();
		
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

	static void loginasuser02()
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
	
	static void userwindow4()
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

	static void modifypasswordforUser3()
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

	static void logout5()
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

	static void loginasuser03()
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
	
	static void userwindow5()
	{
		try
		{
		//	oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		//	Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout6()
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

	static void Loginasuser01()
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
	
	static void userwindow6()
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

	static void modifypasswordforUser2()
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

	static void logout7()
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

	static void loginuser02()
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

	static void logout8()
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

	static void loginasadmin1()
	{
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

	static void modifypasswordforUser1()
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
	
	static void logout9()
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
	
	static void loginuser001()
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

	static void logout10()
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
	
	static void loginuser002()
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
	
	static void logout11()
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

	static void loginuser0001()
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
	
	static void logout12()
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
	
	static void loginasadmin2()
	{
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
	

	static void logout13()
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
