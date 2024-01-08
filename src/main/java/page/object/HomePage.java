package page.object;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.example.Urls.STELLAR_BURGERS_HOME_PAGE_URL;

public class HomePage {

    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //кнопка Войти в аккаунт на главной странице
    private final By buttonToEnterAccountHp = By.xpath(".//button[text() = 'Войти в аккаунт']");
    //Кнопка Войти в личный кабинет на главной странице
    private final By personalAccountButtonHp = By.xpath(".//p[text() = 'Личный Кабинет']");
    //Заголовок конструктора - "Соберите бургер"
    private final By constructorHeaderText = By.xpath(".//h1[text() = 'Соберите бургер']");
    //Логотип Stellar Burgers
    private final By logoStellarBurgers = By.xpath(".//div[@class = 'AppHeader_header__logo__2D0X2']");
    //Кнопка Соусы в конструкторе
    private final By saucesButton = By.xpath(".//span[text() = 'Соусы']");
    //Заголовок Соусы в разделе конструктора
    private final By saucesText = By.xpath(".//h2[text() = 'Соусы']");
    //Кнопка Начинки в конструкторе
    private final By fillingsButton = By.xpath(".//span[text() = 'Начинки']");
    //Заголовок Начинки в разделе конструктора
    private final By fillingsText = By.xpath(".//h2[text() = 'Начинки']");
    //Кнопка Булки в конструкторе
    private final By bunsButton = By.xpath(".//span[text() = 'Булки']");
    //Заголовок Булки в разделе конструктора
    private final By bunsText = By.xpath(".//h2[text() = 'Булки']");

    @Step("Открытие главной страницы")
    public HomePage openHomePage(){
        webDriver.get(STELLAR_BURGERS_HOME_PAGE_URL);
        return this;
    }

    @Step("Клик по кнопке Личный кабинет на главной странице")
    public HomePage clickOnPersonalAccountButtonHp(){
        webDriver.findElement(personalAccountButtonHp).click();
        return this;
    }

    @Step("Клик по кнопке Войти в аккаунт на главной странице")
    public HomePage clickOnButtonToEnterAccountHp(){
        webDriver.findElement(buttonToEnterAccountHp).click();
        return this;
    }

    @Step("Проверка наличия заголовка конструктра на главной странице")
    public HomePage checkConstructorHeaderText(){
        webDriver.findElement(constructorHeaderText).isDisplayed();
        return this;
    }

    @Step("Клик по логотипу Stellar Burgers")
    public HomePage clickOnLogoStellarBurgers(){
        webDriver.findElement(logoStellarBurgers).click();
        return this;
    }

    @Step("Клик по кнопке Соусы в конструкторе")
    public HomePage clickOnSaucesButton(){
        webDriver.findElement(saucesButton).click();
        return this;
    }

    @Step("Проверка наличия заголовка Соусы в разделе конструктора")
    public HomePage checkConstructorSaucesText(){
        webDriver.findElement(saucesText).isDisplayed();
        return this;
    }

    @Step("Клик по кнопке Начинки в конструкторе")
    public HomePage clickOnFillingsButton(){
        webDriver.findElement(fillingsButton).click();
        return this;
    }

    @Step("Проверка наличия заголовка Начинки в разделе конструктора")
    public HomePage checkConstructorFillingsText(){
        webDriver.findElement(fillingsText).isDisplayed();
        return this;
    }

    @Step("Клик по кнопке Булки в конструкторе")
    public HomePage clickOnBunsButton(){
        webDriver.findElement(bunsButton).click();
        return this;
    }

    @Step("Проверка наличия заголовка Булки в разделе конструктора")
    public HomePage checkConstructorBunsText(){
        webDriver.findElement(bunsText).isDisplayed();
        return this;
    }
}
