package com.awesome.crawler.datafetcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class DataFetcher {
    protected String url;
    protected WebDriver driver;
    DataFetcher(String url){
        this.url = url;
        driver = new ChromeDriver();
    }
    public abstract void run();
}
