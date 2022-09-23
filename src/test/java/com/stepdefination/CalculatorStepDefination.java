package com.stepdefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.cucumber.utilities.PropertyData;
import com.pageobjectmodel.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorStepDefination {
	WebDriver driver;
	HomePage page;
	PropertyData data;
	SoftAssert softasrt = new SoftAssert();
	

	@Given("Open the browser and enter the ANZurl")
	public void open_the_browser_and_enter_the_an_zurl() throws Exception {
		data =new PropertyData();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(data.getPropertyData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Click on single button in application type")
	public void select_the_application_type_as_single_button() {
		page = new HomePage(driver);
		page.ClickBtn();
	}

	@When("Select zero in Number of dependants dropdown")
	public void select_zero_in_number_of_dependants_dropdown() {
		WebElement dependantsdropdown = driver.findElement(By.xpath("//select[@title='Number of dependants']"));
		Select select = new Select(dependantsdropdown);
		select.selectByVisibleText("0");
	}

	@When("Click on  Home to live button in Property you would like to buy")
	public void select_the_property_you_would_like_to_buy_as_home_to_live_button() {
		page= new HomePage(driver);
		page.ClickliketoBuyBtn();
	}

	@When("Enter anual income as {int}")
	public void enter_anual_income_as(int Income) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.EnterAnualIncome(data.getPropertyData("Income"));
	}

	@When("enter the anual other income {int}")
	public void enter_the_anual_other_income(int Other_Income) throws Exception {
		page= new HomePage(driver);
		page.EnterOtheIncome(data.getPropertyData("Other_Income"));
	}

	@When("Enter monthly living expenses {int}")
	public void enter_monthly_living_expenses(int living_Expenses) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.EnterLvExp(data.getPropertyData("living_Expenses"));
	}

	@When("Enter Current home loan monthly repayments as {int}")
	public void enter_current_home_loan_monthly_repayments_as(int Loan_Repayment ) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.Enterrepmt(data.getPropertyData("Loan_Repayment"));	
	}

	@When("Enter Other loan monthly repayments as {int}")
	public void enter_other_loan_monthly_repayments_as(int Other_Loan_Repayments ) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.EnterOtherrepmt(data.getPropertyData("Other_Loan_Repayments"));
	}

	@When("Enter Other monthly commitments as {int}")
	public void enter_other_monthly_commitments_as(int  commitments ) throws Exception {
		page= new HomePage(driver);
		page.EnterOthercommitment(data.getPropertyData("commitments"));
	}

	@When("Enter Total credit card limits as {int}")
	public void enter_total_credit_card_limits_as(int total_credit_card_limit ) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.EntercreditCardLimit(data.getPropertyData("total_credit_card_limit"));
	}

	@When("Click on Work out how much i could borrow button")
	public void click_on_work_out_how_much_i_could_borrow_button() {
		page= new HomePage(driver);
		page.clickSubmit();
	}

	@When("Verify the outcomes estimate as ${int}")
	public void verify_the_outcomes_estimate_as_$( int a) {
		
	}

	@When("Click on start over Button")
	public void click_on_start_over_button() {
		page= new HomePage(driver);
		page.clickStartOver();
	}

	@When("verify the form is cleared")
	public void verify_the_form_is_cleared() {

	}

	@When("Enter the Monthly living expenses as {int} and all the field as zero")
	public void enter_the_monthly_living_expenses_as_and_all_the_field_as_zero(int living_Expenses_rpt ) throws Exception {
		page= new HomePage(driver);
		data =new PropertyData();
		page.EnterLvExp(data.getPropertyData("living_Expenses_rpt"));
	}

	
	@When("Click on the Work out how much i could borrow button")
	public void click_on_the_work_out_how_much_i_could_borrow_button() {
		page= new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnBorrowCalculater")));
		page.clickSubmit();
	}

	@Then("verify the Message")
	public void verify_the_message() throws Exception {
		data =new PropertyData();
		String actualResult = driver.findElement(By.xpath("//div[@class='borrow__error__text']")).getText();
		System.out.println(actualResult);
		softasrt.assertEquals(actualResult,data.getPropertyData("expectedResult"));
		softasrt.assertAll();
		driver.quit();
	}

}
