package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver = hooks.driver;
	
	@Given("^URL$")
	public void url() {
		driver.get("http://elearningm1.upskills.in/");
	   
	}

	@When("^Click on Sign Up$")
	public void click_on_Sign_Up() {
		driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
		
	}

	@When("^Provide details for FirstName \"([^\"]*)\"$")
	public void provide_details_for_FirstName(String FirstName) {
		driver.findElement(By.xpath("//*[@id='registration_firstname']")).sendKeys(FirstName);
	}

	@When("^LastName \"([^\"]*)\"$")
	public void lastname(String LastName) {
	     driver.findElement(By.xpath("//*[@id='registration_lastname']")).sendKeys(LastName);	
	}

	@When("^Email \"([^\"]*)\"$")
	public void email(String Email){ 
		driver.findElement(By.xpath("//*[@id='registration_email']")).sendKeys(Email);
	}

	@When("^UserName \"([^\"]*)\"$")
	public void username(String UserName) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(UserName);
	}

	@When("^Password \"([^\"]*)\"$")
	public void password(String Password) {
		driver.findElement(By.xpath("//*[@id='pass1']")).sendKeys(Password);
	}

	@When("^ConfirmPassword \"([^\"]*)\"$")
	public void confirmpassword(String CofirmPassword) {
		driver.findElement(By.xpath("//*[@name='pass2']")).sendKeys(CofirmPassword);
	}

	@Then("^Register$")
	public void register() {
		driver.findElement(By.xpath("//*[@id='registration_submit']")).click();
	}

	@When("^Click on dropdown$")
	public void click_on_dropdown() {
		driver.findElement(By.xpath("//div[@id='navbar']//a[@role='button']")).click();
			
	}
	
	
   // @Then("^User verifies the gmail address$")
	//public void user_verifies_the_gmail_address(String Gmail) { 
    	
    	
	//	String A= driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	//if(A.equalsIgnoreCase(Email)){
    	//System.out.println(Gmail);
    	
    	//if(driver.getPageSource().contains(Gmail)){
    
		//System.out.println("User verifies the address");
    	//}
	//}
	//System.out.println(driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p/text()")));
		//System.out.println(driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText());
	//}
	
	@Then("^Click on Inbox$")
	public void click_on_Inbox() {
		driver.findElement(By.xpath("(//a[@href ='http://elearningm1.upskills.in/main/messages/inbox.php'])[2] ")).click();
		
	}

	@Then("^click on Compose$")
	public void click_on_Compose() {
		driver.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
	}

	@Then("^Provide the details for Sendto \"([^\"]*)\"$")
	public void provide_the_details_for_Sendto(String Gmail) throws InterruptedException {
		//driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Gmail);
		driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']//input[@role='textbox']")).sendKeys(Gmail);	    
		Thread.sleep(3000);	    		
		driver.findElement(By.xpath("//ul[@id='select2-compose_message_users-results']/li")).click();	    
		System.out.println("User enters the recepient email address");
	}
	

	@Then("^Subject \"([^\"]*)\"$")
	public void subject(String Subject) {
		driver.findElement(By.xpath("//*[@id='compose_message_title']")).sendKeys(Subject);
	}

	@Then("^Message \"([^\"]*)\"$")
	public void message(String Message) {
		driver.findElement(By.xpath("/html")).sendKeys(Message);
	}

	@Then("^SendMessage$")
	public void sendmessage() {
		driver.findElement(By.xpath("//*[@id='compose_message_compose']")).click();
	}
	

	@Then("^Verify the acknowledgement$")
	public void verify_the_acknowledgement() {
	}



}
