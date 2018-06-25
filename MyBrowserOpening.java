import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyBrowserOpening {
    private WebDriver driver ;

    @Before

    public void start ()
    { driver= new ChromeDriver();
    }


    @Test
    public void MyFirst()
    { driver.get("http://www.ya.ru/");
    }

    @After
    public void close()
    {driver.quit();
        driver=null;}

}


