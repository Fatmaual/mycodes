package day54;
public interface WebDriver {
    public void openBrowser();
    public void navigateTo(String url);
    public abstract void maximize();
    public abstract void closeBrowser();

}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Openning FireFox Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url +" using FireFox Browser ");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser");
    }
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {

        System.out.println("Openning Chrome Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url +" using Chrome Browser ");

    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
class Automation{
    public static void main(String[] args) {
        System.out.println("--running on Chrome--");
        WebDriver driver= new ChromeDriver();
        driver.openBrowser();
        driver.navigateTo("www.cybertekschool.com");
        driver.maximize();
        driver.closeBrowser();

        System.out.println("===running on FireFox=====");
        driver=new FireFoxDriver();
        driver.openBrowser();
        driver.navigateTo("www.cybertekschool.com");
        driver.maximize();
        driver.closeBrowser();

    }
}