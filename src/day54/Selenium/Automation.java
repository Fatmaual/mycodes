package day54.Selenium;

class FireFox implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url
                + " using Firefox Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Firefox Browser");
    }

    @Override
    public void closeBrowser(){
        System.out.println("Closing Firefox Browser");
    }
}
 class ChromeDriver implements WebDriver{
@Override
     public void openBrowser(){
    System.out.println("Opening Chrome Browser");
}

     @Override
     public void navigateTo(String url) {
         System.out.println("Navigating to "+url+" using Chrome Browser");
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
public class Automation {
    public static void main(String[] args) {
   // ChromeDriver cDriver1=new ChromeDriver();
   // WebDriver wDriver1=cDriver1;
    System.out.println("---Running on Chrome-----------");
    WebDriver cDriver1=new ChromeDriver();
    cDriver1.openBrowser();
    cDriver1.navigateTo("www.cybertekschool.com");
    cDriver1.closeBrowser();
    cDriver1.maximize();

    System.out.println("---Running on Firefox----------");
    cDriver1=new FireFox();
    cDriver1.openBrowser();
    cDriver1.closeBrowser();
    cDriver1.navigateTo("www.cybertekschool.com");
    cDriver1.maximize();

    }
}
