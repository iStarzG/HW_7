import PagesAndComponents.Components.Base;
import PagesAndComponents.TextBoxPage;
import PagesAndComponents.TextBoxSelect;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxTestWhithPages extends Base{

    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxSelect textBoxSelect = new TextBoxSelect();
    @Test
    void textBoxWithPages () {
        textBoxPage.openPage()
                .setFirstName("Kirill")
                .setEmailName("kiryamironov@mail.ru")
                .setCurrentAdress("Random STREET-1")
                .setPermanentAdress("Random STREET-2")
                .submitClick();
        textBoxSelect.nameCheck("Kirill")
                .emailCheck("kiryamironov@mail.ru")
                .currentAdressCheck("Random STREET-1")
                .permanentAdressCheck("Random STREET-2");

    }
}
