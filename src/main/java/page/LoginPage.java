package page;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = BASE_URL + "demo-java-basics";
    String title = "Форма логина";

    public void open() {
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }

    public String getTitle() {
        return title;
    }

}
