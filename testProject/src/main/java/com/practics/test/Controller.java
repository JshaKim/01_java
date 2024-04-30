package com.practics.test;

public class Controller {

    private DTO model;
    private View view;

    Controller(DTO model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printDetails(model.getName(), model.getPhone(), model.getAddress(), "123-456");
    }
}
