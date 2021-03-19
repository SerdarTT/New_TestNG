package ZDiscussion;

public class Wait_Concept {

    /**
     * Implicit wait: 250ms
     *
     * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     */

    /**
     * ExplicitWait: Polling period is 500ms
     *
     * WebDriverWait eWait = new WebDriverWait(driver, timeOutSecond: 20);
     * eWait.until(ExpectedConditions.titlesIs("Hotels.com");
     *
     * exp: eWait.until((ExpectedConditions.and(
     *                  ExpectedConditions.alertIsPresent(),
     *                  ExpectedConditions.elementToBeClickable(By.Xpath(""))));
     */

    /**
     * FluentWait:
     *
     * Wait fWait = new FluentWait(driver)
     * .withTimeout(Duration.ofSeconds(30))
     * .pollingEvery(Duration.ofSeconds(1))
     * .ignoring(NoAlertPresentException.class)
     * .ignoring(NoSuchElementException.class)
     * .withMessage("Element is not found after 30 seconds of fluent wait");
     *
     *
     * WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>())
     *      public WebElement apply(WebDriver driver) {
     *          return driver.findElement(By.Xpath(""));
     *      }
     *
     * //how to use fluent-wait object with the Explicit-Wait conditions;
     *
     * fWait(ExpectedConditions.urlContains(fraction: "facebook");
     *
     */

}
