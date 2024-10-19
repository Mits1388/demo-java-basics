package by.itacademy.artsiommitskevich.pages;

public class BasePage {
    protected String BASE_URL = "https://github.com/";

    public void open() {
        System.out.println("Пользователь открыл страницу " + BASE_URL);
    }
}
