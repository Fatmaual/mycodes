package day54.Selenium;

public interface WebDriver {
    //adding behavior

    public abstract void openBrowser();
    public abstract void navigateTo(String url);
    abstract void maximize();
    void closeBrowser();


}
