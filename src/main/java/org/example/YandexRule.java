package org.example;

public class YandexRule extends BrowserRule {

    @Override
    protected String getDriverPath() {
        return "src/test/resources/yandexdriver.exe";
    }
}
