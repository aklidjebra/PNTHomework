package uberSetupTest;

import org.testng.annotations.Test;
import uberSetup.UberHomePage;

public class UberhomePageTest extends UberHomePage  {




    @Test (priority = 1)
        public void UberAppTest () throws InterruptedException {
        uberHome();
        Thread.sleep(3000);

        getScreenshot(driver);


    }  @Test (priority = 2)
    public void UberAppTest2 () throws InterruptedException {
        uberHome();
        Uberlogin();
        Thread.sleep(3000);
        getScreenshot(driver);

    }

        @Test (priority = 3)
        public void UberAppTest3 () throws InterruptedException {
            uberHome();
            Uberlogin();
            ridersignin();
            Thread.sleep(3000);
            getScreenshot(driver);



        }
    @Test (priority = 4)
    public void UberAppTest4 () throws InterruptedException {
        uberHome();
        Uberlogin();
        ridersignin();
        inputemail("aklidjebra@gmail.com");
        Thread.sleep(3000);
        getScreenshot(driver);



    }
}
