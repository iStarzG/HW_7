package PagesAndComponents;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    private SelenideElement
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAdressName = $("#currentAddress"),
            permanentAdressName = $("#permanentAddress"),

    submitClick = $("#submit");


    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage setFirstName(String value) {
        userName.setValue(value);
        return this;
    }

    public TextBoxPage setEmailName(String value) {
        userEmail.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAdress(String value) {
        currentAdressName.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAdress(String value) {
        permanentAdressName.setValue(value);
        return this;
    }

    public TextBoxPage submitClick() {
        submitClick.click();
        return this;
    }
}