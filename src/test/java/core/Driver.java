package core;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    private static AppiumDriver appiumDriver;

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void inicializaDriver() throws MalformedURLException {
        String url = "http://127.0.0.1:4723";
        BaseOptions options = new BaseOptions();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setCapability("deviceName","ChronosMobile");
        options.setCapability("appPackage","br.com.chronosacademy");
        options.setCapability("appActivity", "br.com.chronosacademy.MainActivity");
        options.setNewCommandTimeout(Duration.ofSeconds(10));
        appiumDriver = new AppiumDriver(new URL(url), options);
    }
    public static void inicializaDriverPerfecto() throws MalformedURLException {
        String cloudName = "demo";
        String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI4YmI4YmZmZS1kMzBjLTQ2MjctYmMxMS0zNTYyMmY1ZDkyMGYifQ.eyJpYXQiOjE3MTM4OTc4NjUsImp0aSI6IjM2NjFhYzdhLWJhNWUtNDVjMS04MzRkLWI0Nzk1ZGRiYTU5NyIsImlzcyI6Imh0dHBzOi8vYXV0aC5wZXJmZWN0b21vYmlsZS5jb20vYXV0aC9yZWFsbXMvZGVtby1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL2RlbW8tcGVyZmVjdG9tb2JpbGUtY29tIiwic3ViIjoiMTJmYTNmNDYtNTNiMi00ZjI2LWExZDQtNmU0YTQ5YjU4YTk1IiwidHlwIjoiT2ZmbGluZSIsImF6cCI6Im9mZmxpbmUtdG9rZW4tZ2VuZXJhdG9yIiwibm9uY2UiOiJkYzIwNWMwMC1iNTM2LTQ2OTEtYTUzMy04NzVlY2JkZTFhZDYiLCJzZXNzaW9uX3N0YXRlIjoiNmE0OWYyNmQtYjg5MC00YzdlLTgxOGYtZWFjNGQ5OTk1YmQ3Iiwic2NvcGUiOiJvcGVuaWQgb2ZmbGluZV9hY2Nlc3MifQ.-tZ41N5ligFnW8mUoK5DybYG6SUArcVnl2OTTuY2DjU";
        String url = "https://"+cloudName+".perfectomobile.com/nexperience/perfectomobile/wd/hub";
        BaseOptions options = new BaseOptions();
        options.setPlatformName("Android");
        options.setAutomationName("uiautomator2");
        options.setCapability("app", "PRIVATE:ChronosAcademy.apk");
        options.setCapability("model","Pixel 6 Pro");
        options.setCapability("perfecto:securityToken", securityToken);

        appiumDriver = new AppiumDriver(new URL(url), options);
    }

    public static void swipe(int left, int right, String direction, double percent) {
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
        ((JavascriptExecutor) Driver.getAppiumDriver()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", left, "top", right, "width", dimension.getWidth()/2, "height", dimension.getHeight()/2,
                "direction", direction, "percent", percent
        ));
    }

}
