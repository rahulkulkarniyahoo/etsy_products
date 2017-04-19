package Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import static uti.MyWriteToFile.myWriteMethod;

/**
 * Created by rahul.kulkarni on 04/04/2017.
 */
public class MainPage extends PageObject {


    @FindBy(xpath = "//a[@title='Add a listing']")
    WebElement btn_AddNewProduct;

    //@FindBy(xpath = "//input[@id='listing-edit-image-upload']")
    @FindBy(id = "listing-edit-image-upload")
    WebElement btn_AddAPhoto;

    @FindBy(id = "title")
    WebElement txt_title;

    @FindBy(id = "who_made")
    WebElement ddWhoMade;

    @FindBy(id = "is_supply")
    WebElement ddSupply;

    @FindBy(id = "when_made")
    WebElement ddWhenmade;

    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[1]/div/label/select")
    WebElement ddJewellery;

    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[2]/div/label/select")
    WebElement ddRings;

    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[3]/div/label/select")
    WebElement ddWedding_Engagement;

    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[7]/div/div/div[2]/div/div/div[4]/div/label/select")
    WebElement ddEngagement_Rings;

    //Primary colour
    @FindBy(id = "attribute-2")
    WebElement ddPrimaryColour;

    //Celebration
    @FindBy(id = "attribute-4")
    WebElement ddCelebration;

    //Band color
    @FindBy(id = "attribute-341")
    WebElement ddBandColor;

    //Gem color
    @FindBy(id = "attribute-340")
    WebElement ddGemColor;

    // Ring size - Country
    @FindBy(id = "attribute-290-scale")
    WebElement ddCountry;

    // Ring size
    @FindBy(id = "attribute-290")
    WebElement ddRingSize;

    //Renewal
    @FindBy(xpath = "//input[@name='should_auto_renew'][@value='automatic']")
    WebElement rb_Automatic;

    //Desc
    @FindBy(xpath = "//*[@id='description']")
    WebElement txt_Description;

    //Tags
    @FindBy(id = "tags")
    WebElement txt_Tags;

    //Tag Add button
    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[34]/div/div/div[2]/div[1]/div[1]/div/div[2]/button")
    WebElement btn_Tags_Add;

    //Materials
    @FindBy(id = "materials")
    WebElement txt_Materials;

    //Materials Add button
    @FindBy(xpath = " .//*[@id='page-region']/div/div/div/div[2]/div/div[4]/div[35]/div/div/div[2]/div[1]/div[1]/div/div[2]/button")
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

    //Gem Color Options
    @FindBy(xpath = "//option[text()='Add gem colour options']/..")
    WebElement ddGemColorOptions;

    //Prices vary for each primary colour
    @FindBy(xpath = "//*[text()='Prices vary for each primary colour']/..")
    WebElement cbPrimaryColorVary;

    //SKU vary for each primary colour
    @FindBy(xpath = "//*[text()='SKUs vary for each primary colour']/..")
    WebElement cbPrimarySKUVary;


    //Primary Color Options
    @FindBy(xpath = "//option[text()='Add primary colour options']/..")
    WebElement ddPrimaryColorOptions;


    //Primary Color Custom Values
    @FindBy(xpath = "//input[@placeholder='Name the option']")
    WebElement ddPrimaryColorCustomOptions;

    //SKU Ring Size Options
    @FindBy(xpath = "//*[text()='SKUs vary for each ring size']/..")
    WebElement cbRingSizeSKUVary;


    //Ring Size vary for each Size
    @FindBy(xpath = "//*[text()='Prices vary for each ring size']/..")
    WebElement cbRingSizeVary;



    //Primary Color Custom Values - ADD Button
    @FindBy(xpath = "//button[text()='Add']")
    WebElement ddPrimaryColorCustomOptionsAddButton;


    //SubWindow Update Button
    @FindBy(xpath = "//*[text()='Update']")
    WebElement btn_Update;

    //Origin zip code *
    @FindBy(name = "origin_postal_code")
    WebElement txt_OriginZipCode;

    //Processing time
    // @FindBy(className ="select select-custom pr-xs-6")
    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[2]/div/div[12]/div/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/select")
    WebElement dd_ProcessingTime;

    //Item weight lBS
    @FindBy(id = "weight_primary")
    WebElement txt_Pounds;

    //Item weight oz
    @FindBy(id = "weight_secondary")
    WebElement txt_Ounces;

    //Item size Length
    @FindBy(id = "item_length")
    WebElement txt_Length;

    //Item size Width
    @FindBy(id = "item_width")
    WebElement txt_Width;

    //Item size Height
    @FindBy(id = "item_height")
    WebElement txt_Height;

    //publish button
    //@FindBy(xpath = "//button[@class='btn btn-primary']")
    @FindBy(xpath = ".//*[@id='page-region']/div/div/div/div[3]/div/div[1]/div/div/div[2]/button[3]")
    WebElement btn_Publish;

    @FindBy(xpath = "//button[text() = 'Publish']")
    WebElement btn_PublishConfirmation;

    int iCounterForSKU =   397;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    // @Step
    public void clickAddNewProduct() throws InterruptedException, AWTException {

        //Click on Add a Listing
        // int ok_size=getDriver().findElements(By.xpath("//a[@title='Add a listing']")).size();
        // getDriver().findElements(By.xpath("//a[@title='Add a listing']")).get(ok_size-1).click();
        // btn_AddNewProduct.click();

        getDriver().findElement(By.xpath(".//*[@id='page-region']/div/div/div/div[1]/header/div/div/div/div[3]/div/div/a")).click();
        waitFor(3000);
        waitForTitleToAppear("Create Listing - Etsy");
    }

    public void setData() throws InterruptedException, IOException, AWTException {
        DataFormatter formatter = new DataFormatter();


        //Get Values and Assign it to each variable and then set the variable value to the web app?
        File src = new File("src/test/resources/ListOfProducts_Radhika.xlsm");


        //Load the File
        FileInputStream fileInputStream = new FileInputStream(src);

        //Load the Workbook
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);

        //Load the first sheet only.

        XSSFSheet sheet1 = wb.getSheet("10k Rose Gold");


        System.out.println("Total Rows = " + sheet1.getPhysicalNumberOfRows());
        System.out.println("Total Columns = " + sheet1.getRow(0).getLastCellNum());
        System.out.println("_________________________________________________");

        String[] mySheetValues = new String[sheet1.getRow(0).getLastCellNum()];

        //Reading Values
        for (int i = 3; i < 10; i++) {
            for (int j = 0; j < sheet1.getRow(i).getLastCellNum(); j++) {
                //System.out.println("Row =" + i + " Column = " + j + " Contains value = " + sheet1.getRow(i).getCell(j).getStringCellValue());
                // mySheetValues[j] = formatter.formatCellValue(sheet1.getRow(i).getCell(j))
                //  mySheetValues[j] = sheet1.getRow(i).getCell(j).getStringCellValue();
                String newStringValue = changeFormatToText(sheet1.getRow(i).getCell(j));
                mySheetValues[j] = newStringValue;
                // mySheetValues[j] = sheet1.getRow(i).getCell(j).toString();
            }

            System.out.println("$$$$$$$$$$$$$$$$$$$$IN FOR LOOP I = " + i);

            setValuesOnWebApplication(sheet1.getSheetName(), mySheetValues);
            JavascriptExecutor je = (JavascriptExecutor) getDriver();
            je.executeScript("arguments[0].scrollIntoView(true);", btn_Publish);

            //Publish button
            btn_Publish.click();
            waitFor(500);
            btn_PublishConfirmation.click();
        }


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


        //Type

        /***
         * Start from here
         */



        System.out.println("Done");
    }

    private void setValuesOnWebApplication(String sheetName, String[] mySheetValues) throws AWTException, InterruptedException {
        String sURL1;
        String sURL2;
        String sURL3;
        String sURL4;
        String sURL5;
        String sTitle;
        String sWhoMadeIt;
        String sWhatIsIt;
        String sWhenWasItMade;
        String sCat1_Jewellery;
        String sCat2_Rings;
        String sCat3_WeddingsandEngagement;
        String sCat4_EngagmentRings;
        String sPrimarycolour;
        String sColorOptions;
        String sCelebration;
        String sBandcolor;
        String sGemcolor;
        String sGemcolor_More;
        String sRingsizeCountry;
        String sRingSizeMore;
        String sRenewaloptions;
        String sType;
        String sDescription;
        String sTags;
        String sMaterials;
        String sPrice10kRoseGold;
        String sPrice10kWhiteGold;
        String sPrice10kYellowGold;
        String sPrice14kRoseGold;
        String sPrice14kWhiteGold;
        String sPrice14kYellowGold;
        String sPrice18kRoseGold;
        String sPrice18kWhiteGold;
        String sPrice18kYellowGold;
        String sQuantity;
        String sSKU;
        String sVariations_GemsColor;
        String sVariations_RingSize;
        String sOriginzipcode;
        String sProcessingtime;
        String sItemweightLBS;
        String sItemweightOZ;
        String sItemsize_whenpacked_LENGTH;
        String sItemsize_whenpacked_WIDTH;
        String sItemsize_whenpacked_HEIGHT;

        sURL1 = mySheetValues[2];
        sURL2 = mySheetValues[3];
        sURL3 = mySheetValues[4];
        sURL4 = mySheetValues[5];
        sURL5 = mySheetValues[6];
        sTitle = mySheetValues[7];
        sWhoMadeIt = mySheetValues[8];
        sWhatIsIt = mySheetValues[9];
        sWhenWasItMade = mySheetValues[10];
        sCat1_Jewellery = mySheetValues[11];
        sCat2_Rings = mySheetValues[12];
        sCat3_WeddingsandEngagement = mySheetValues[13];
        sCat4_EngagmentRings = mySheetValues[14];
        sPrimarycolour = mySheetValues[15];
        sColorOptions = mySheetValues[16];
        sCelebration = mySheetValues[17];
        sBandcolor = mySheetValues[18];
        sGemcolor = mySheetValues[19];
        sGemcolor_More = mySheetValues[20];
        sRingsizeCountry = mySheetValues[21];
        sRingSizeMore = mySheetValues[22];
        sRenewaloptions = mySheetValues[23];
        sType = mySheetValues[24];
        sDescription = mySheetValues[25];
        sTags = mySheetValues[26];
        sMaterials = mySheetValues[27];
        sPrice10kRoseGold = mySheetValues[28];
        sPrice10kWhiteGold = mySheetValues[29];
        sPrice10kYellowGold = mySheetValues[30];
        sPrice14kRoseGold = mySheetValues[31];
        sPrice14kWhiteGold = mySheetValues[32];
        sPrice14kYellowGold = mySheetValues[33];
        sPrice18kRoseGold = mySheetValues[34];
        sPrice18kWhiteGold = mySheetValues[35];
        sPrice18kYellowGold = mySheetValues[36];
        sQuantity = mySheetValues[37];
        sSKU = mySheetValues[38];
        sVariations_GemsColor = mySheetValues[39];
        sVariations_RingSize = mySheetValues[40];
        sOriginzipcode = mySheetValues[41];
        sProcessingtime = mySheetValues[42];
        sItemweightLBS = mySheetValues[43];
        sItemweightOZ = mySheetValues[44];
        sItemsize_whenpacked_LENGTH = mySheetValues[45];
        sItemsize_whenpacked_WIDTH = mySheetValues[46];
        sItemsize_whenpacked_HEIGHT = mySheetValues[47];


        System.out.println(" *************** In setValuesOnWebApplication ***********************************");


        clickAddNewProduct();

//    @FindBy(xpath = "//input[@id='listing-edit-image-upload']")
        //getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys("C:\\Users\\Rahul\\IdeaProjects\\estyjm\\src\\test\\images\\10_5.jpg")
        //Add Image
//        getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL1);

        if (!sURL1.equals("-")) {
            getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL1);
        }
        if (!sURL2.equals("-")) getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL2);
        if (!sURL3.equals("-")) getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL3);
        if (!sURL4.equals("-")) getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL4);
        if (!sURL5.equals("-")) getDriver().findElement(By.id("listing-edit-image-upload")).sendKeys(sURL5);

        //Title
        txt_title.sendKeys(sTitle);

        //I did
        Select ddSel = new Select(ddWhoMade);
        ddSel.selectByVisibleText(sWhoMadeIt);

        //A Finished Product
        ddSel = new Select(ddSupply);
        ddSel.selectByVisibleText(sWhatIsIt);

        //Made to order
        ddSel = new Select(ddWhenmade);
        ddSel.selectByVisibleText(sWhenWasItMade);

        // *** Categories
        //Jewellery
        ddSel = new Select(ddJewellery);
        ddSel.selectByVisibleText(sCat1_Jewellery);

        //Rings
        ddSel = new Select(ddRings);
        ddSel.selectByVisibleText(sCat2_Rings);

        //Wedding & Engagement
        ddSel = new Select(ddWedding_Engagement);
        ddSel.selectByVisibleText(sCat3_WeddingsandEngagement);

        //Engagement Rings
        ddSel = new Select(ddEngagement_Rings);
        ddSel.selectByVisibleText(sCat4_EngagmentRings);

        //Primary colour
        ddSel = new Select(ddPrimaryColour);
        ddSel.selectByVisibleText(sPrimarycolour);



        //Country
        ddSel = new Select(ddCountry);
        ddSel.selectByVisibleText(sRingsizeCountry);

        //Ring size
        ddSel = new Select(ddRingSize);
        ddSel.selectByVisibleText(sRingSizeMore);

        //Renewal
        JavascriptExecutor je = (JavascriptExecutor) getDriver();
        je.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//input[@name='should_auto_renew'][@value='automatic']")));
        getDriver().findElement(By.xpath("//input[@name='should_auto_renew'][@value='automatic']")).click();

        txt_Tags.clear();
        // Need to Write Code to loop for all the tags and click on Add button
        //Tags
        String[] myTagsSpiltter = sTags.split(",");

        for(String myTags :  myTagsSpiltter) {
            txt_Tags.sendKeys(myTags);
            waitFor(1000);
            //Tags Add
            btn_Tags_Add.click();
            waitFor(500);
        }


        // Need to Write Code to loop for all the tags and click on Add button
        //Materials


         String [] myMatSpiltter = sMaterials.split(",");

        for(String myTag :  myMatSpiltter) {
          //  System.out.println("whatIfs = " + myTag);
            txt_Materials.sendKeys(myTag);
            waitFor(200);
            //Materials Tags Add
            btn_Materials_Add.click();
        }

        //Price *********************** ADD CODE
        /*
        We have to determine which sheet we are in
        and according set the price.
        We also have to worry about the order in which the values are being set
        for different sheets
         */
        //String sheetName, String[] mySheetValues
//        String myNewPriceSetting = setValueAsPerSheetName(sheetName, mySheetValues);
//        txt_Price.sendKeys(myNewPriceSetting);

        //*************** Need to Clear Qty field.

        //Quantity
        txt_Qty.clear();
        txt_Qty.sendKeys(sQuantity);

        //No Need to use this, we are generating code for this
        //SKU *********************** ADD CODE
     //   txt_SKU.sendKeys(sSKU);


        //Add Variations
        je.executeScript("arguments[0].scrollIntoView(true);", btn_Variation);
        btn_Variation.click();

        // Check box for SKU Variation
        cbPrimarySKUVary.click();

        // Checkbox for Primary Color Variation for SKU and Prices
        cbPrimaryColorVary.click();

        // Need to add sColorOptions
        ddSel = new Select(ddPrimaryColorOptions);
       // ddSel.selectByVisibleText("Add primary colour options");
        ddSel.selectByValue("__custom");
       // ddSel.selectByVisibleText("Create a new option");
        String [] myColorStringArray = sColorOptions.split(",");
        for (String myColors: myColorStringArray){
            ddPrimaryColorCustomOptions.sendKeys(myColors);
            waitFor(200);
            ddPrimaryColorCustomOptionsAddButton.click();

        }


        // Checkbox for Ring Size Variation for SKU and Prices
       // cbRingSizeVary.click();

        // Check box for SKU Variation
        cbRingSizeSKUVary.click();

        //Add Ring Size Options *********************** ADD CODE
        ddSel = new Select(dd_RingSizeOptions);
       // ddSel.selectByVisibleText(sVariations_RingSize);


        String [] myRingStringArray = sVariations_RingSize.split(",");
        for (String myRingSizes: myRingStringArray){
            ddSel.selectByVisibleText(myRingSizes);
            waitFor(200);
        }


        //**********************************************//
        btn_Update.click();  //Closes PopUp Window
        //**********************************************//

        // sPrice10kRoseGold;

        // sPrice14kRoseGold;

        // sPrice18kRoseGold;


        if(sheetName.contains("10k")){
       // if(sheetName.equals("10k Rose Gold")){
            int iSKUCounter = 1;
            int iRingSize = 45;
            int i = 1;

            String mySKUValue = setSKUInitializer(i);// getSKUValue(sheetName);
            String sRingSize = Integer.toString(iRingSize);

            List<WebElement> myListWE = getDriver().findElements(By.xpath("//input[@name='sku-input']"));

            for(WebElement we: myListWE){
                System.out.println("Adding to individual products=" + mySKUValue +sRingSize +iCounterForSKU);
              //  writeToTextFile(mySKUValue +sRingSize +iCounterForSKU + ",");
                //MyWriteToFile myWriteToFile = new MyWriteToFile();
                myWriteMethod(mySKUValue);
                //MyWriteToFile.myWriteMethod(mySKUValue +sRingSize +iCounterForSKU);
                //myWriteMethod(mySKUValue +sRingSize +iCounterForSKU++);
               // myWrite(mySKUValue +sRingSize +iCounterForSKU );
                System.out.println("-------------------------------------------------------------------------");
                we.sendKeys(mySKUValue +sRingSize +iCounterForSKU++);
                    iRingSize +=5;
                if (iRingSize == 100){
                    iRingSize = 45;
                }
            }

            int j = 1;
            List<WebElement> myListPriceWE = getDriver().findElements(By.xpath("//input[@name='price-input']"));
            for(WebElement wePrice: myListPriceWE){
                if (i <=33)
                    wePrice.sendKeys(sPrice10kRoseGold);
                else if(i <=66 && i >=34 )
                    wePrice.sendKeys(sPrice14kRoseGold);
                else if(i <=99 && i <=67)
                wePrice.sendKeys(sPrice18kRoseGold);
            }

            System.out.println("-------------------------------------------------------------------------");
        }




        //Origin zip code *
        txt_OriginZipCode.sendKeys(sOriginzipcode);

        //Processing time
        ddSel = new Select(dd_ProcessingTime);
        ddSel.selectByVisibleText(sProcessingtime);

        //********* Item weight  *******************//
        //Item weight lBS
        txt_Pounds.sendKeys(sItemweightLBS);

        //Item weight oz
        txt_Ounces.sendKeys(sItemweightOZ);

        // ****************  Item size *******************//
        //Item size Length
        txt_Length.sendKeys(sItemsize_whenpacked_LENGTH);

        //Item size Width
        txt_Width.sendKeys(sItemsize_whenpacked_WIDTH);

        //Item size Height
        txt_Height.sendKeys(sItemsize_whenpacked_HEIGHT);

        //Scroll into View
        je.executeScript("arguments[0].scrollIntoView(true);", txt_Description);
        waitFor(500);
        //Desc
         txt_Description.sendKeys(sDescription);

        System.out.println(" *************** OUT setValuesOnWebApplication ***********************************");


    }

    private String setSKUInitializer(int iNumber) {
       String mySKUValue = "101";
      // int i=1;

       // mySKUValue = mySKUValue + "10kRGSz";

        if (iNumber >=1 && iNumber <=11 ){
            mySKUValue = mySKUValue +  "10kRGSz";
        }

        if (iNumber >=12 && iNumber <=22){
            mySKUValue = mySKUValue +  "10kWGSz";
        }

        if (iNumber >=23 && iNumber <=33 ){
            mySKUValue = mySKUValue +  "10kRGSz";
        }

        if (iNumber >=34 && iNumber <=44 ){
            mySKUValue = mySKUValue +  "14kRGSz";
        }

        if (iNumber >=45 && iNumber <=55){
            mySKUValue = mySKUValue +  "14kWGSz";
        }

        if (iNumber >=56 && iNumber <=66 ){
            mySKUValue = mySKUValue +  "14kYGSz";
        }
        //---
        if (iNumber >=67 && iNumber <=77 ){
            mySKUValue = mySKUValue +  "18kRGSz";
        }

        if (iNumber >=78 && iNumber <=88){
            mySKUValue = mySKUValue +  "18kWGSz";
        }

        if (iNumber >=89 && iNumber <=99 ){
            mySKUValue = mySKUValue +  "18kYGSz";
        }


       System.out.println("**********************************************");
        System.out.println("mySKUValue Generated: " + mySKUValue);
        System.out.println("**********************************************");
        return mySKUValue;
    }

    private String getSKUValue(String sheetName) {
        String mySKUValue=null;
        if(sheetName.equals("10k Rose Gold")){
                mySKUValue = "10010kRGSZ";
        }
        if(sheetName.equals("10k White Gold")){
            mySKUValue = "10010kWGSZ";
        }
        if(sheetName.equals("10k Yellow Gold")){
            mySKUValue = "10010kYGSZ";
        }




        return mySKUValue;
    }

    private String setValueAsPerSheetName(String sheetName, String[] mySheetValues) {
        String mysPrice10kRoseGold = mySheetValues[28];
        String mysPrice10kWhiteGold = mySheetValues[29];
        String mysPrice10kYellowGold = mySheetValues[30];
        String mysPrice14kRoseGold = mySheetValues[31];
        String mysPrice14kWhiteGold = mySheetValues[32];
        String mysPrice14kYellowGold = mySheetValues[33];
        String mysPrice18kRoseGold = mySheetValues[34];
        String mysPrice18kWhiteGold = mySheetValues[35];
        String mysPrice18kYellowGold = mySheetValues[36];


        switch (sheetName){
            case "10k Rose Gold":
                break;

        }

        return "Dr Dang Kabhi worng nahi hota";
    }

    private static String changeFormatToText(XSSFCell whatCellType) {
      //  System.out.println("______________________________________________________________________");

       // System.out.println(whatCellType.getCellType());
       // System.out.println(whatCellType.toString());
        return whatCellType.toString();

    }
//    public static void myWrite(String SKUValue){
//        BufferedWriter bw = null;
//        FileWriter fw = null;
//
//        try {
//
//            //String data = " This is new content";
//
//            File file = new File("src/test/resources/SKU.txt");
//
//            // if file doesnt exists, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            // true = append file
//            fw = new FileWriter(file.getAbsoluteFile(), true);
//            bw = new BufferedWriter(fw);
//
//            bw.write(SKUValue);
//            bw.newLine();
//            System.out.println("Done");
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        } finally {
//
//            try {
//
//                if (bw != null)
//                    bw.close();
//
//                if (fw != null)
//                    fw.close();
//
//            } catch (IOException ex) {
//
//                ex.printStackTrace();
//
//            }
//        }
//    }

}
