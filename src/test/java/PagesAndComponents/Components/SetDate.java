package PagesAndComponents.Components;

import static com.codeborne.selenide.Selenide.$;

public class SetDate {
    public void setBirthday(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption("September");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--006:nth-child(4)").click();
    }
}
