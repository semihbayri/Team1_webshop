package com.example.Team1_webshop.Pages;

import com.example.Team1_webshop.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
          PageFactory.initElements(Driver.getDriver(),this);
}


}