package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	/*	loginasuser3();
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
		loginuser02();
		logout8();*/
		loginasadmin1();
		userwindow7();
		modifypasswordforUser1();
		logout9();
		loginuser001();
		logout10();
		
		loginuser001();
		userwindow9();
		deleteUser2();
		logout12();
		loginasadmin2();
		userwindow10();
		deleteUser1();
		logout13();
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
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
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
	
	static void userwindow7()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void modifypasswordforUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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
	
	static void userwindow8()
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
	
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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
	
	static void userwindow9()
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
	
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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
	
	static void userwindow10()
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
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
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
