package com.wts.controller;

import com.jfinal.core.Controller;


public class MainController extends Controller {

  public void index() {
    System.out.println(getPara("msg"));
    renderText(getPara("msg"));
  }
}
