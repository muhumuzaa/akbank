package com.example.akbank.Models;

import com.example.akbank.Views.ViewFactory;

public class Model {
    private static Model instance;
    private final ViewFactory viewFactory;

    private Model() {
        viewFactory = new ViewFactory();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
