package Com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.adactin.runner.Runner_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {
	
	public static WebDriver driver = Runner_class.driver; 
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");   
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("ganesh001");   
	}
	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ganesh@001");  
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click(); 
	}
	@When("^user Click The Location Button And User Select The Location$")
	public void user_Click_The_Location_Button_And_User_Select_The_Location() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		
		Select a=new Select(location);
		a.selectByValue("London");
	}

	@When("^user Click The Hotels Button And User Select Hotel$")
	public void user_Click_The_Hotels_Button_And_User_Select_Hotel() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.click();
		
		Select b=new Select(hotels);
		b.selectByValue("Hotel Sunshine");
	}

	@When("^user Click The Room Type Button And User Select Room Type$")
	public void user_Click_The_Room_Type_Button_And_User_Select_Room_Type() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.click();
		
		Select c=new Select(roomtype);
		c.selectByValue("Standard");
	}

	@When("^user Click The Number OF Rooms Button And User Select Number Of Rooms$")
	public void user_Click_The_Number_OF_Rooms_Button_And_User_Select_Number_Of_Rooms() throws Throwable {
		WebElement roomsnos = driver.findElement(By.id("room_nos"));
		roomsnos.click();
		
		Select d=new Select(roomsnos);
		d.selectByValue("2");
	}
	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		WebElement Checkin = driver.findElement(By.id("datepick_in"));
		Checkin.sendKeys("26/08/2022");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		WebElement Checkout = driver.findElement(By.id("datepick_out"));
		Checkout.sendKeys("27/08/2022");
	}

	@When("^user Click The Adults per Room And User Select Adults per Room$")
	public void user_Click_The_Adults_per_Room_And_User_Select_Adults_per_Room() throws Throwable {
		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.click();
		
		Select e=new Select(adult);
		e.selectByValue("2");
	}

	@When("^user Click The Children per Room And User Select Children per Room$")
	public void user_Click_The_Children_per_Room_And_User_Select_Children_per_Room() throws Throwable {
		WebElement Child = driver.findElement(By.id("child_room"));
		Child.click();
		
		Select f=new Select(Child);
		f.selectByValue("0");
	}
	@Then("^user Click The Search Button And It Navigates To Select Hotel$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}

	@When("^user Click The Select Button In Select Field$")
	public void user_Click_The_Select_Button_In_Select_Field() throws Throwable {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
	}
	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		WebElement continue_1 = driver.findElement(By.id("continue"));
		continue_1.click();
	}

	@When("^user Enter The First Name In first Name Field$")
	public void user_Enter_The_First_Name_In_first_Name_Field() throws Throwable {
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Ganesh");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("D");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no 14/a korattur");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys("1234567890123456");
	}

	@When("^user Click The Credit Card Type Button And User Select Credit Card Type$")
	public void user_Click_The_Credit_Card_Type_Button_And_User_Select_Credit_Card_Type() throws Throwable {
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		cc_type.click();
		
		Select g = new Select(cc_type);
		g.selectByValue("VISA");
	}

	@When("^user Click Expiry Date Button And User Select Month$")
	public void user_Click_Expiry_Date_Button_And_User_Select_Month() throws Throwable {
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		cc_exp_month.click();
		
		Select h=new Select(cc_exp_month);
		h.selectByValue("2");
	}

	@When("^user Click Expiry Date Button And User Select Year$")
	public void user_Click_Expiry_Date_Button_And_User_Select_Year() throws Throwable {
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		cc_exp_year.click();
		
		Select i =new Select(cc_exp_year);
		i.selectByValue("2013");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("234");
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
	}

	@Then("^user Click The Logout Button And It Navigates To Logout Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_Logout_Page() throws Throwable {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scroll(0,400)");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
	}

	@Then("^user Click The Click Here To Login Again Button And It Navigates To Login Page$")
	public void user_Click_The_Click_Here_To_Login_Again_Button_And_It_Navigates_To_Login_Page() throws Throwable {
		WebElement Login_again = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
	    Login_again.click();
	    
	    Thread.sleep(3000);
	}
	
	}