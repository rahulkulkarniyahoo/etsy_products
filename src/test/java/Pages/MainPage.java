package Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by rahul.kulkarni on 04/04/2017.
 */
public class MainPage extends PageObject{

    @FindBy (xpath = "//*[@id='listing-edit-image-upload']")
    WebElement btn_AddNewPhoto1;

    @FindBy (xpath = "//a[@title='Add a listing']")
    WebElement btn_AddNewProduct;

    @FindBy(id = "title")
    WebElement txt_title;

    @FindBy(id ="who_made")
    WebElement ddWhoMade;

    @FindBy(id ="is_supply")
    WebElement ddSupply;

    @FindBy(id ="when_made")
    WebElement ddWhenmade;



    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div/label/select")
    WebElement ddJewellery;

    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[2]/div/label/select")
    WebElement ddRings;

    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[3]/div/label/select")
    WebElement ddWedding_Engagement;


    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[4]/div/label/select")
    WebElement ddEngagement_Rings;


    //Primary colour
    @FindBy(id ="attribute-2")
    WebElement ddPrimaryColour;

    //Celebration
    @FindBy(id ="attribute-4")
    WebElement ddCelebration;
    //
    //Band color
    @FindBy(id ="attribute-341")
    WebElement ddBandColor;

    //Gem color
    @FindBy(id ="attribute-340")
    WebElement ddGemColor;

   // Ring size - Country
    @FindBy(id ="attribute-290-scale")
    WebElement ddCountry;

    // Ring size
    @FindBy(id ="attribute-290")
    WebElement ddRingSize;



    //Renewal
    @FindBy(xpath = "//input[@name='should_auto_renew'][@value='automatic']")
    WebElement rb_Automatic;


    //Desc
    @FindBy(xpath ="//*[@id='description']")
    WebElement txt_Description;

    //Tags
    @FindBy(xpath ="//*[@id='tags']")
    WebElement txt_Tags;

    //Tag Add button
    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[34]/div/div/div[2]/div[1]/div[1]/div/div[2]/button")
    WebElement btn_Tags_Add;

    //Materials
    @FindBy(id ="materials")
    WebElement txt_Materials;

    //Materials Add button
    @FindBy(xpath =" .//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[35]/div/div/div[2]/div[1]/div[1]/div/div[2]/button")
    WebElement btn_Materials_Add;


    //Price
    @FindBy(xpath = "//*[@name='price-input']")
    WebElement txt_Price;

    //Quantity
    @FindBy(xpath = "//input[@name='quantity-input']")
    WebElement txt_Qty;


    //SKU
    @FindBy(xpath = "//input[@name='sku-input']")
    WebElement txt_SKU;


    //Variation
    @FindBy(xpath = "//*[@id='add_variations_button']")
    WebElement btn_Variation;


    //Ring Size Options
    @FindBy(xpath = "//option[text()='Add ring size options']/..")
    WebElement dd_RingSizeOptions;


    //SubWindow Update Button
    @FindBy(xpath = "//*[text()='Update']")
    WebElement btn_Update;



    //Origin zip code *
    @FindBy(name ="origin_postal_code")
    WebElement txt_OriginZipCode;

    //Processing time
   // @FindBy(className ="select select-custom pr-xs-6")
    @FindBy(xpath =".//*[@id='page-region']/div/div/div/div[2]/div/div[12]/div/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/select")
    WebElement dd_ProcessingTime;

    //Item weight lBS
    @FindBy(id ="weight_primary")
    WebElement txt_Pounds;

    //Item weight oz
    @FindBy(id ="weight_secondary")
    WebElement txt_Ounces;


    //Item size Length
    @FindBy(id ="item_length")
    WebElement txt_Length;

    //Item size Width
    @FindBy(id ="item_width")
    WebElement txt_Width;


    //Item size Height
    @FindBy(id ="item_height")
    WebElement txt_Height;


    //publish button
    @FindBy(xpath ="//button[@class='btn btn-primary']")
    WebElement btn_Publish;



    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void clickAddNewProduct() throws InterruptedException, AWTException {

        //Click on Add a Listing
        int ok_size=getDriver().findElements(By.xpath("//a[@title='Add a listing']")).size();
        getDriver().findElements(By.xpath("//a[@title='Add a listing']")).get(ok_size-1).click();


        //Add Image
        //*[@id='listing-edit-image-upload']

//        getDriver().findElement(By.xpath("//*[@id='listing-edit-image-upload']")).click();
//
//        String path = "/Users/rahul.kulkarni/Downloads/FireShot/2Promo2Merchant__ReviewAndConfirmOrder.png";
//        File file = new File(path);
//        StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
//
//        //Copy to clipboard
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//        Robot robot = new Robot();
//        // Cmd + Tab is needed since it launches a Java app and the browser looses focus (note: @DD META is the CMD Key in MAC keyboard)
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_TAB);
//
//        robot.delay(3000);
//
//        //Hit Enter to open window (Choose File is selected)
//        try {
//
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//            robot.delay(
//                    4000);
//        }
//        catch(Exception e) {
//            System.out.println(" Am in catch ");
//        }
//
//        //Open Go to the Folder window
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_META); // Press CMD+SHIFT+G - to opens 'Go To The Folder'
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_G);
//        robot.keyRelease(KeyEvent.VK_META); //release CMD+SHIFT+G
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_G);
//
//        System.out.println("Did it open go to folder dialog? ");
//        //Paste the clipboard value
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.delay(2000);
//
//        //Press Enter key to close the Goto window and Upload window
//
//
//
//        robot.keyPress(KeyEvent.VK_ENTER); //Hit Enter then Release - to close the Go To The Folder (note: file is auto-selected)
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_ENTER); //Hit Enter then release - to close the window
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(2000);
//


//        waitFor(2).seconds();
//        //Okbutton().click();


        //Title
        txt_title.sendKeys("MyListing1");

        //I did
        Select ddSel = new Select(ddWhoMade);
        ddSel.selectByVisibleText("I did");

        //A Finished Product
        ddSel = new Select(ddSupply);;
        ddSel.selectByVisibleText("A finished product");

        //Made to order
        ddSel = new Select(ddWhenmade);;
        ddSel.selectByVisibleText("Made to order");

        // *** Categories
        //Jewellery

        ddSel = new Select(ddJewellery);;
        ddSel.selectByVisibleText("Jewellery");

        //Rings
        ddSel = new Select(ddRings);;
        ddSel.selectByVisibleText("Rings");

        //Wedding & Engagement
        ddSel = new Select(ddWedding_Engagement);
        ddSel.selectByVisibleText("Wedding & Engagement");

        //Engagement Rings
        ddSel = new Select(ddEngagement_Rings);;
        ddSel.selectByVisibleText("Engagement Rings");


       //Renewal
        JavascriptExecutor je = (JavascriptExecutor)getDriver();
        je.executeScript("arguments[0].scrollIntoView(true);",getDriver().findElement(By.xpath("//input[@name='should_auto_renew'][@value='automatic']")));
       // je.executeScript("arguments[0].scrollIntoView(true);",rb_Automatic);

        getDriver().findElement(By.xpath("//input[@name='should_auto_renew'][@value='automatic']")).click();
        //rb_Automatic.click();

        //Primary colour
        //ddSel = new Select(ddPrimaryColour);;
        //ddSel.selectByVisibleText("I offer more than one");

        //Celebration *** DO NOTHING RIGHT NOW
//        ddSel = new Select(ddJewellery);;
//        ddSel.selectByVisibleText("Jewellery");
//
        //Band color *** DO NOTHING RIGHT NOW
//        ddSel = new Select(ddJewellery);;
//        ddSel.selectByVisibleText("Jewellery");

        //Gem color *** DO NOTHING RIGHT NOW
//        ddSel = new Select(ddJewellery);;
//        ddSel.selectByVisibleText("Jewellery");


        //Country
        ddSel = new Select(ddCountry);;
        ddSel.selectByVisibleText("US");

        //Ring size
        ddSel = new Select(ddRingSize);;
        ddSel.selectByVisibleText("I offer more than one");



        //Type

        /***
         * Start from here
         */
        //Desc
        txt_Description.sendKeys("My Description");


        //Tags

        txt_Tags.sendKeys("My Tags1, My Tags 2");

        //Tags Add

        btn_Tags_Add.click();

        //Materials

        txt_Materials.sendKeys("My Materials 1, My Materials 2");

        //Materials Tags Add
        btn_Materials_Add.click();

        //Price
        txt_Price.sendKeys("12.56");

        //Quantity
        txt_Qty.sendKeys("1.00");

        //SKU
        txt_SKU.sendKeys("My SKU");


        //Add Variations
        je.executeScript("arguments[0].scrollIntoView(true);",btn_Variation);
        btn_Variation.click();

//        WebDriver popup = null;
//
//        //Here we get an alert / window. This code handles the new window.
//        String parentWindowHandler = getDriver().getWindowHandle();
//        String subWindowHandler = null;
//
//        Set<String> handles = getDriver().getWindowHandles();
//        Iterator<String> iterator = handles.iterator();
//        while(iterator.hasNext()){
//            subWindowHandler = iterator.next();
//        }
//
//
//        getDriver().switchTo().frame(getDriver().findElement(By.id("theseus-overlay-100103-title")));
//


        //Add Ring Size Options
        //dd_RingSizeOptions

        ddSel = new Select(dd_RingSizeOptions);;
        ddSel.selectByVisibleText("4 1/2 US");
        Thread.sleep(2000);
        ddSel.selectByVisibleText("5 1/2 US");
        ddSel.selectByVisibleText("6 1/2 US");
        btn_Update.click();
        Thread.sleep(2000);

       // getDriver().switchTo().defaultContent();

       // getDriver().switchTo().window(parentWindowHandler);

        //Origin zip code *
        txt_OriginZipCode.sendKeys("12345");

        //Processing time
        ddSel = new Select(dd_ProcessingTime);;
        ddSel.selectByVisibleText("2-3 weeks");

        //Item weight
            //Item weight lBS
            txt_Pounds.sendKeys("2");
            //Item weight oz
            txt_Ounces.sendKeys("0");
        //Item size
            //Item size Length
            txt_Length.sendKeys("2");

            //Item size Width
            txt_Width.sendKeys("2");

            //Item size Height
            txt_Height.sendKeys("2");


        //Publish button
        //btn_Publish.click();



        System.out.println("Done");




    }
}
