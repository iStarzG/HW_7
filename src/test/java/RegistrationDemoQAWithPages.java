import PagesAndComponents.Components.Base;
import PagesAndComponents.RegistrationPage;
import PagesAndComponents.SelectPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;

public class RegistrationDemoQAWithPages extends Base {
    RegistrationPage registrationPage = new RegistrationPage();

    SelectPage selectPage = new SelectPage();

    @Test
    void succesfulRegistration() {
        registrationPage.openPage()
                .setFirstName("Kirill")
                .setLastName("Mironov")
                .setUserEmail("kiryamironov@mail.ru")
                .setGender("Other")
                .setUserNumber("8800535353")
                .setDateOfBirth("06", "09", "2000")
                .setSubject("English")
                .setHobby("Music")
                .setHobby("Sports")
                .setHobby("Reading")
                .uploadPicture("1.jpeg")
                .setCurrentAdress("Nigeria")
                .selectState("Haryana")
                .selectCity("Karnal")
                .clickSubmit();
        selectPage.modalOpenCheck()
                .tableCheck("Student Name","Kirill Mironov")
                .tableCheck("Student Email","kiryamironov@mail.ru")
                .tableCheck("Gender", "Other")
                .tableCheck("Mobile", "8800535353")
                .tableCheck("Date of Birth", "06 September,2000")
                .tableCheck("Subjects", "English")
                .tableCheck("Hobbies", "Music, Sports, Reading")
                .tableCheck("Picture", "1.jpeg")
                .tableCheck("Address", "Nigeria")
                .tableCheck("State and City", "Haryana Karnal");
    }

    @Test
    void RegistrationWithMinimalInformation() {
        registrationPage.openPage()
                .setFirstName("Kirill")
                .setLastName("Mironov")
                .setGender("Other")
                .setUserNumber("8800535353")
                .setDateOfBirth("06", "09", "2000")
                .clickSubmit();
        selectPage.modalOpenCheck(visible)
                .tableCheck("Student Name","Kirill Mironov")
                .tableCheck("Gender", "Other")
                .tableCheck("Mobile", "8800535353")
                .tableCheck("Date of Birth", "06 September,2000");
    }

    @Test
    void RegistrationEmptyInformation () {
        registrationPage.openPage()
                .clickSubmit()
                .colorCheck("border-color","rgb(220, 53, 69)");
        selectPage.modalOpenCheck(hidden);

    }
}





