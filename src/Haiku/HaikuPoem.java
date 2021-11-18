package Haiku;

import Haiku.Controller.Controller;
import Haiku.Data.WriterAndReader;
import Haiku.logic.Logic;

import java.util.ArrayList;

public class HaikuPoem {
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    Controller ctrl = new Controller();
    Logic logic = new Logic();
    WriterAndReader war = new WriterAndReader();

    public HaikuPoem() {
        System.out.println("Type in first line");
        this.firstLine = war.askForInput();
        System.out.println("Type in second line");
        this.secondLine = war.askForInput();
        System.out.println("Type in third line");
        this.thirdLine = war.askForInput();
    }
    public void welcomeMessage(){
        System.out.println("Welcome to the Haiku checker application");
    }

    public String poemString(String[] poem){
        String poemString = poem.toString();
        return poemString;
    }


    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    @Override
    public String toString() {
        return "HaikuPoem{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", thirdLine='" + thirdLine + '\'' +
                '}';
    }
}
