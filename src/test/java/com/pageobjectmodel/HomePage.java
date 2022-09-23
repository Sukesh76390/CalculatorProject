package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	WebDriver driver;
	
	
	@FindBy(xpath = "//label[contains(text(),'Single')]")
	WebElement appButton;
	
	@FindBy(xpath="//label[@for='borrow_type_home']")
	WebElement liketoBuyBtn;
	
	@FindBy(xpath="//input[@aria-describedby='q2q1i1 q2q1i2']")
	WebElement anualIncome;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q2']")
	WebElement otherIncome;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q1']")
	WebElement livingExp;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q2']")
	WebElement repayment;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q3']")
	WebElement otherRepayment;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q4']")
	WebElement otherCommitment;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q5']")
	WebElement creditCardLimit;
	
	@FindBy(id="btnBorrowCalculater")
	WebElement submit;
	
	@FindBy(xpath="(//button[@aria-label='Start over'])[1]")
	WebElement startOver;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickBtn() {
		appButton.click();
	}
	public void ClickliketoBuyBtn() {
		liketoBuyBtn.click();
	}
	public void EnterAnualIncome(String strIncome) {
		anualIncome.sendKeys(strIncome);
	}
	public void EnterOtheIncome(String strOtherIncome) {
		otherIncome.sendKeys(strOtherIncome);
	}
	public void EnterLvExp(String strExpenses) {
		livingExp.sendKeys(strExpenses);
	}
	public void Enterrepmt(String strrepaymenst) {
		repayment.sendKeys(strrepaymenst);
	}
	public void EnterOtherrepmt(String strOtherRepayment) {
		otherRepayment.sendKeys(strOtherRepayment);
	}
	public void EnterOthercommitment(String strCommitment) {
		otherCommitment.sendKeys(strCommitment);
	}
	public void EntercreditCardLimit(String strCardLimit) {
		creditCardLimit.sendKeys(strCardLimit);
	}
	public void clickSubmit() {
		submit.click();
	}
	public void clickStartOver() {
		startOver.click();
	}

}
