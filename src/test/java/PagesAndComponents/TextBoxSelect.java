package PagesAndComponents;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxSelect {
    private SelenideElement
    nameCheck = $("#output #name"),
    emailCheck = $("#output #email"),
    currentAdressCheck = $("#output #currentAddress"),
    permanentAdressCheck = $("#output #permanentAddress");


    public TextBoxSelect nameCheck (String value) {
        nameCheck.shouldHave(text(value));
        return this;
    }
    public TextBoxSelect emailCheck (String value) {
        emailCheck.shouldHave(text(value));
        return this;
    }
    public TextBoxSelect currentAdressCheck (String value) {
        currentAdressCheck.shouldHave(text(value));
        return this;
    }
        public TextBoxSelect permanentAdressCheck (String value) {
            permanentAdressCheck.shouldHave(text(value));
            return this;
        }

}
