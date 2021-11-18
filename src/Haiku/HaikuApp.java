package Haiku;

import Haiku.Controller.Controller;
import Haiku.Data.WriterAndReader;
import Haiku.logic.Logic;

public class HaikuApp {

    Controller ctrl = new Controller();
    Logic logic = new Logic();
    WriterAndReader war = new WriterAndReader();
    HaikuPoem poem = new HaikuPoem();

    public static void main(String[] args) {
        HaikuApp app = new HaikuApp();
        app.poem.welcomeMessage();
        HaikuPoem poem = new HaikuPoem();
        app.logic.syllabusCounter(app.logic.buildLineArr(app.poem.getFirstLine()));



    }
}
