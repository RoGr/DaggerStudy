package com.example.pk.daggertest;

import android.content.Context;

import javax.inject.Inject;

//тут можно поместить @Scope зависимости
public class ManagerA {

    Context context;

    //Внедрение в конструктор класса.
    @Inject
    public ManagerA(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

//    //Внедрение через метод. Метод будет выполнен после вызова конструктора.
//    @Inject
//    public void register(SomeDepends depends) {
//        depends.register(this);
//    }
//
//    //Внедрение в поля класса. Поля должны быть не приватными и не финальными.
//    @Inject
//    ManagerB managerB;
}