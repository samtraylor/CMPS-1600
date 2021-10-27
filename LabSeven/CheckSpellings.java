import java.io.IOException;
public class CheckSpellings {
    public static void main(String[] args) throws IOException {
        SpellChecker checkDict = new SpellChecker("/Users/samtraylor/Desktop/CompSci2/LabSeven/dictionary.txt"); 
        
        long beforeHashChk = System.currentTimeMillis();
        int numMisspelledHash = checkDict.hashCheckSpellings("/Users/samtraylor/Desktop/CompSci2/LabSeven/shortGrimms.txt").size();
        long afterHashChk = System.currentTimeMillis();
        
        long beforeListChk = System.currentTimeMillis();
        int numMisspelledList = checkDict.listCheckSpellings("/Users/samtraylor/Desktop/CompSci2/LabSeven/shortGrimms.txt").size();
        long afterListChk = System.currentTimeMillis();
        
        long hashCheckTime = afterHashChk - beforeHashChk;
        long listCheckTime = afterListChk - beforeListChk;
        
        System.out.println("It took " + hashCheckTime + " milliseconds to check for spelling errors using a HashSet dictionary.");
        System.out.println("The hash check found " + numMisspelledHash + " misspelled words.\n");
        
        System.out.println("It took " + listCheckTime + " milliseconds to check for spelling errors using a List dictionary.");
        System.out.println("The list check found " + numMisspelledList + " misspelled words.");
    }
}
