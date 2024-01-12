package PagesAndComponents;

import PagesAndComponents.Components.SetDate;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    SetDate setDate = new SetDate();
    private SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            genderName = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            subject = $("#subjectsInput"),
            hobbyName = $("#hobbiesWrapper"),
            uploadPictureName = $("#uploadPicture"),
            dateName = $("#dateOfBirthInput"),
            adressName = $("#currentAddress"),
            stateName = $("#react-select-3-input"),
            cityName = $("#react-select-4-input"),
            submitName = $("#submit");










    public RegistrationPage openPage() {
        open("/automation-practice-form"); // Открытие браузера с нужной ссылкой
        executeJavaScript("$('#fixedban').remove()");//Скрытие рекламы
        executeJavaScript("$('footer').remove()");// Скрытие футера
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderName.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateName.click();
        setDate.setBirthday(day, month, year);
        return this;

    }

    public RegistrationPage setSubject(String value) {
        subject.setValue(value).sendKeys(Keys.ENTER);
        return this;
    }


    public RegistrationPage setHobby(String value) {
        hobbyName.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String... strings) {
        uploadPictureName.uploadFromClasspath("1.jpeg");
        return this;

    }

    public RegistrationPage setCurrentAdress(String value) {
        adressName.setValue(value);
        return this;
    }

    public RegistrationPage selectState(String value) {
        stateName.setValue(value).sendKeys(Keys.ENTER);
        return this;
    }

    public RegistrationPage selectCity(String value) {
        cityName.setValue(value).sendKeys(Keys.ENTER);
        return this;
    }

    public RegistrationPage clickSubmit() {
        submitName.click();
        return this;
    }

    public RegistrationPage colorCheck(String findColor, String color) {
        firstName.shouldHave(cssValue(findColor,color));
        lastName.shouldHave(cssValue(findColor,color));
        userNumber.shouldHave(cssValue(findColor,color));
        genderName.$("label[for='gender-radio-1']").shouldHave(cssValue(findColor,color));
        genderName.$("label[for='gender-radio-2']").shouldHave(cssValue(findColor,color));
        genderName.$("label[for='gender-radio-3']").shouldHave(cssValue(findColor,color));
        return this;
    }

}





