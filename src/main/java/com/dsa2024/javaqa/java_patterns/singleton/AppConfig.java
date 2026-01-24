package com.dsa2024.javaqa.java_patterns.singleton;

public class AppConfig {

    private static AppConfig instance;

    private String appName;
    private String environment;

    private AppConfig() {
        this.appName = "Order-Service";
        this.environment = "PROD";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getEnvironment() {
        return environment;
    }

    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config1.getAppName());
        System.out.println(config1.getEnvironment());
        System.out.println("config1 "+config1);
        System.out.println("config2 "+config2);
    }
}
