package com.example.pk.daggertest;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

public class App extends AppCompatActivity {
    @Inject
    ManagerA managerA;

    @Inject
    Context context;

    AppComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);

        //Получаем component и делаем inject всех зависимостей
        ApplicationTest.getAppComponent().injectInto(this);

        Toast.makeText(managerA.getContext(), "123", Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
    }
}


