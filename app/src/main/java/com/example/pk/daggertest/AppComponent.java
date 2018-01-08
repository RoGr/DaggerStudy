package com.example.pk.daggertest;

import dagger.Component;


/**
 * Компонент является связующим звеном между модулями и просителями зависимостей.
 * Отдать зависимость можно через метод компонента
 *
 * из modules = AppModule.class - будут браться(генерироваться) зависимости
 */
@Component(modules = {AppModule.class})
interface AppComponent {

    //Куда мы будем делать inject наших зависимостей
    void injectInto(App holder);

    //Getter компонента
    ManagerA getManagerA();
}