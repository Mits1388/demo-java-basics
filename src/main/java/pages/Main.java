package pages;

public class Main {

    public static void main(String[] args) {

        BasePage basePage = new BasePage();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        basePage.open();
        homePage.open();
        System.out.println(homePage.getTitle());
        homePage.clickLogin();
        loginPage.open();
        System.out.println(loginPage.getTitle());
    }
}
