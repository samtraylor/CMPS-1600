import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

/**
 * Class used to instantiate objects of type SpellChecker, and to perform spell checks.
 * The class has 2 non-constructor methods used to assemble a list of words not
 * found in the dictionary. The program reads in from a file when performing spell
 * checks.
 * 
 * @author Sam Traylor 
 * @version 1.0
 */
public class SpellChecker {
    private HashSet<String> hashedDictionary = new HashSet<String>();
    private ArrayList<String> listDictionary = new ArrayList<String>();

    /**
     * Constructor method, instantiates object of type SpellChecker, creating a dictionary in both HashSet and ArrayList form from a txt file. The dictionaries will contain no punctuation and no uppercase letters
     * 
     * @param dictionaryFileName is String representing the file location of desired dictionary
     * @return SpellChecker object with both dictionaries 
     */
    public SpellChecker(String dictionaryFileName) throws IOException {
        Scanner scnr = new Scanner(new FileInputStream(dictionaryFileName));

        while(scnr.hasNext()) {
            listDictionary.add(scnr.next().replaceAll("\\p{Punct}", "")); //remove all punctuation);

        } 

        int x;
        int y;

        for (x = 0; x < listDictionary.size(); x++) { //iterate thru strings
            for(y = 0; y < listDictionary.get(x).length(); y++) { //iterate through chars
                Character temp = listDictionary.get(x).charAt(y);
                if(Character.isUpperCase(temp)) {
                    String strLowercase = listDictionary.get(x).replace(temp, Character.toLowerCase(temp));
                    listDictionary.set(x,strLowercase);
                }
            }
        }

        scnr.close();

        // CONSTRUCTION OF DICTIONARY IN HASHSET FORM:

        Scanner scnr2 = new Scanner(new FileInputStream(dictionaryFileName));
        int z;

        while(scnr2.hasNext()) {
            hashedDictionary.add(scnr2.next().replaceAll("\\p{Punct}", "")); //remove all punctuation);
        }

        HashSet<String> clone = new HashSet<String>();
        clone = (HashSet) hashedDictionary.clone();
        Iterator iter = clone.iterator(); //allows for element-by-element iteration
        String str;

        while(iter.hasNext()) {
            str = (String) iter.next();
            String punctRemvd = str;

            for(z = 0; z < str.length(); z++) {
                Character tempChar = str.charAt(z);
                if(Character.isUpperCase(tempChar)) {
                    punctRemvd = punctRemvd.replace(tempChar, Character.toLowerCase(tempChar));
                }
            }

            hashedDictionary.remove(str);
            hashedDictionary.add(punctRemvd);
        } 

        scnr2.close();
    }
    
    /**
     * Method to read in a text file and check for spelling errors using a HashSet dictionary. It will return a list of all the words that are in the text but not the dictionary.
     * 
     * @param textFileName is a String containing the file path for the text being checked
     * @return List of Strings containing all words from the text which don't exist in the dictionary
     */
    public List<String> hashCheckSpellings(String textFileName) throws IOException {
        Scanner scnr3 = new Scanner(new FileInputStream(textFileName));
        List<String> misspelled = new ArrayList<String>();
        List<String> fileContents = new ArrayList<String>();
        
        while(scnr3.hasNext()) {
            fileContents.add(scnr3.next().replaceAll("\\p{Punct}", "")); //remove all punctuation);
        } 

        int x;
        int y;

        for (x = 0; x < fileContents.size(); x++) { //iterate thru strings
            for(y = 0; y < fileContents.get(x).length(); y++) { //iterate through chars
                Character temp = fileContents.get(x).charAt(y);
                if(Character.isUpperCase(temp)) {
                    String strLowercase = fileContents.get(x).replace(temp, Character.toLowerCase(temp));
                    fileContents.set(x,strLowercase);
                }
            }
        }

        scnr3.close();
        
        for(String q: fileContents) { //remove words found in dict, so that lefovers are all misspelled
            if(!hashedDictionary.contains(q)) {
                misspelled.add(q);
            }
        }
        
        return misspelled;
    } 

    /**
     * Method to read in a text file and check for spelling errors using a list dictionary. It will return a list of all the words that are in the text but not the dictionary.
     * 
     * @param textFileName is a String containing the file path for the text being checked
     * @return List of Strings containing all words from the text which don't exist in the dictionary
     */
    public List<String> listCheckSpellings(String textFileName) throws IOException {
        Scanner scnr4 = new Scanner(new FileInputStream(textFileName));
        List<String> misspelled = new ArrayList<String>();
        List<String> fileContents = new ArrayList<String>();
        
        while(scnr4.hasNext()) {
            fileContents.add(scnr4.next().replaceAll("\\p{Punct}", "")); //remove all punctuation);
        } 

        int x;
        int y;

        for (x = 0; x < fileContents.size(); x++) { //iterate thru strings
            for(y = 0; y < fileContents.get(x).length(); y++) { //iterate through chars
                Character temp = fileContents.get(x).charAt(y);
                if(Character.isUpperCase(temp)) {
                    String strLowercase = fileContents.get(x).replace(temp, Character.toLowerCase(temp));
                    fileContents.set(x,strLowercase);
                }
            }
        }

        scnr4.close();
        
        for(String q: fileContents) { //remove words found in dict, so that lefovers are all misspelled
            if(!listDictionary.contains(q)) {
                misspelled.add(q);
            }
        }
        
        return misspelled;
    } 

}
