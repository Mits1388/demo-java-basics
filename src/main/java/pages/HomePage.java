package pages;

public class HomePage extends BasePage {
    protected String HOME_URL = BASE_URL + "Mits1388";
    String title = "Домашняя страница";

    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);
    }

    public String getTitle() {
        return title;
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }
}
