package com.guishop.application.cucumber.stepdefs;

import com.guishop.application.GuishopApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GuishopApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
