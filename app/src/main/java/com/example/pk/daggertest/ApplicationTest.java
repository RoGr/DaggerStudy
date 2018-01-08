package com.example.pk.daggertest;

import android.content.Context;

import javax.inject.Inject;

//Переопределяю ApplicationClass для билдинга зависимостей
public class ApplicationTest extends android.app.Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        //Билдинг зависимостей, т.е создание графа зависимостей
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        super.onCreate();
    }

    public static AppComponent getAppComponent(){
        return  component;
    }
}
