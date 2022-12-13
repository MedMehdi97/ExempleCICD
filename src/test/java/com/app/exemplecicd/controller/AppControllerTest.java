package com.app.exemplecicd.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AppControllerTest {

    AppController appController=new AppController();
    @Test
    void should_return_helloWorld(){
        assertThat(appController.helloWorld()).isEqualTo("Hello World From Montpellier !");
    }
}
