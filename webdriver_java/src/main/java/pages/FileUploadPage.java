package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedfile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param abosolutePathOfFile the complete path of the file upload
     */
    public void uploadFile(String abosolutePathOfFile){
        driver.findElement(inputField).sendKeys(abosolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedfile).getText();
    }
}
