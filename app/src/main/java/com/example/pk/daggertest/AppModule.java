package com.example.pk.daggertest;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;


@Module
/**
 * Модуль – это фабрика объектов, разрешающая наши зависимости.
 * Он должен быть помечен аннотацией @ Module, а методы, генерирующие зависимости, – @ Provides.
 */
class AppModule {
    Application app;

    AppModule(Application app) {
        this.app = app;
    }

    @Provides
    Context provideContext() {
        return app;
    }
}