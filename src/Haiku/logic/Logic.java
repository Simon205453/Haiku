package Haiku.logic;

import java.util.ArrayList;

import Haiku.Controller.Controller;
import Haiku.HaikuPoem;
import Haiku.Data.WriterAndReader;

public class Logic {

    private char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};
    private char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z', ' '};

    ArrayList<Character> word = new ArrayList<>();
    WriterAndReader wr = new WriterAndReader();

    public void buildWordArray(String givenWord) {
        for (int i = 0; i < givenWord.length(); i++) {
            word.add((char) givenWord.indexOf(i));
        }
    }

    public char[] buildCharArrFromString(String word) {
        char[] charArr = word.toCharArray();
        return charArr;
    }

    public boolean isVowel(Character letter) {
        for (int i = 0; i < vowels.length; i++) {
            if (letter == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    public int syllabusCounter(ArrayList<String> givenLine) {
        int syllabuscount = 0;
        for (int i = 0; i < givenLine.size(); i++) {
            String currentWord = givenLine.get(i);
            for (int j = 0; j < currentWord.length(); j++) {
                for (int k = 0; k < vowels.length; k++) {
                    if (currentWord.charAt(j) == (vowels[k])) {
                        if (isNextLetterConsonant(currentWord.charAt(i))) {
                            syllabuscount++;
                        }
                    }
                }
            }
        }
        return syllabuscount;
    }

    private boolean isNextLetterConsonant(char ch) {
        for (int i = 0; i < consonants.length; i++) {
            if (ch == consonants[i]){
                return true;

            }
        }
        return false;
    }
    //makes full line into string array of the containing words
    public ArrayList<String> buildLineArr(String line){
        ArrayList<String> output = new ArrayList<>();
        String[] splittetLine = line.split(" ");
        for (int i = 0; i < splittetLine.length; i++) {
            output.add(splittetLine[i]);
        }
        return output;
    }

    public int countSyllabusInLine(){
        return syllabusCounter(buildLineArr(wr.askForInput()));
    }

    public boolean checkIfSyllabusIsValidAsFirstOrThirdLine(){
            if (countSyllabusInLine() == 5){
                return true;
            } else {
                return false;
            }
    }
    public boolean checkIfSyllabusIsValidAsSecondLine(){
        if (countSyllabusInLine() == 7){
            return true;
        } else {
            return false;
        }
    }



}
