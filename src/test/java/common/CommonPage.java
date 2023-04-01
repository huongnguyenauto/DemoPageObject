package common;

import org.openqa.selenium.By;
import page.LoginPage;
import untils.WebKeyword;

public class CommonPage {

    public LoginPage loginPage;

    public By logout = By.xpath("//img[@class='img img-responsive staff-profile-image-small tw-ring-1 tw-ring-offset-2 tw-ring-primary-500 tw-mx-1 tw-mt-2.5']");
    public By buttonLogout = By.xpath("//ul[@class='dropdown-menu animated fadeIn']//li[@class='header-logout']//a[@href='#'][normalize-space()='Logout']");


}
