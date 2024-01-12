package PagesAndComponents.Components;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Base {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
        System.out.println("\n\n### @BeforeAll\n");


    }

    @AfterAll
    static void afterAll() {
        System.out.println("\n### @AfterAll\n\n");
    }
}
