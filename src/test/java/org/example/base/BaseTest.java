package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.common.Configuration.BASE_URL;
import static org.example.common.Configuration.LOGIN_PATH;


    public abstract class BaseTest {
        protected WebDriver driver;

        @BeforeAll
        public static void setUp() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        public void beforeTest() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            //стенд тормозит, лучше использовать стратегию NORMAL
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(BASE_URL + LOGIN_PATH);
        }


        @AfterEach
        public void tearDown() {
            // Вывод всех ошибок браузера после каждого теста
            LogEntries browserLogs = driver.manage().logs().get("browser");
            List<LogEntry> allLogRows = browserLogs.getAll();

            if (allLogRows.size() > 0 ) {
                // Обработка ситуации
            }

            // -------------------------------
            driver.quit();
        }


       /* @AfterEach
        public void tearDown() {
            // Вывод всех ошибок браузера после каждого теста
            driver
                    .manage()
                    .logs()
                    .get(LogType.BROWSER)
                    .getAll()
                    .forEach(System.out::println);

            // -------------------------------
            driver.quit();
        }*/

    }

