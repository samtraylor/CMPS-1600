import static org.junit.Assert.*;
import org.junit.Test;
/**
 * JUnit Tests for functionality of Candidate Class
 *
 * @author Sam Traylor & Vaughn Bangash
 * @version 1.0
 */
public class CandidateTester
{
    /**
     * First, constructs 2 base case objects of Candidate and 3 border cases.
     * Then, testing begins 
     */
    public static void main(String[] args) 
    {
        Candidate c1 = new Candidate("Hilly Clintbone","DNC");
        Candidate c2 = new Candidate("C3P0","Rebellion");
        Candidate c3 = new Candidate("0100101","001010");
        Candidate c4 = new Candidate("....&^%","00302032");
        Candidate c5 = new Candidate("_", "Republican party");
        
        System.out.println("Testing Started:");
        

        //Beginning assertion tests for getName() method:
        assert (c1.getName().equals("Hilly Clintbone")) : "Assertion c1.getName().equals('Hilly Clintbone') failed";
        assert (c2.getName().equals("C3P0")) : "Assertion c2.getName().equals('C3P0') failed";
        assert (c3.getName().equals("0100101")) : "Assertion c3.getName().equals('0100101') failed";
        assert (c4.getName().equals("....&^%")) : "Assertion c4.getName().equals('....&^%') failed";
        assert (c5.getName().equals("_")) : "Assertion c5.getName().equals('_') failed";
        
        //Beginning assertion tests for getAffiliation() method:
        
        assert (c1.getAffiliation().equals("DNC")) : "Assertion c1.getAffiliation().equals('DNC') failed";
        assert (c2.getAffiliation().equals("Rebellion")) : "Assertion c2.getAffiliation().equals('Rebellion') failed";
        assert (c3.getAffiliation().equals("001010")) : "Assertion c3.getAffiliation().equals('001010') failed";
        assert (c4.getAffiliation().equals("00302032")) : "Assertion c4.getAffiliation().equals('00302032') failed";
        assert (c5.getAffiliation().equals("Republican party")) : "Assertion c5.getAffiliation().equals('Republican party') failed";
        
        //Beginning assertion testing for getVoteCount() and tallyVote() methods:
        
        assert (c1.getVoteCount() == 0) : "Assertion (c1.getVoteCount() == 0) failed";
        assert (c2.getVoteCount() == 0) : "Assertion (c2.getVoteCount() == 0) failed";
        c1.tallyVote(); 
        c2.tallyVote();
        assert (c1.getVoteCount() == 1):  "Assertion (c1.getVoteCount() == 1) failed";
        assert (c2.getVoteCount() == 1):  "Assertion (c2.getVoteCount() == 1) failed";
        
        //Beginning assertion testing for toString method:
        
        assert (c1.toString().equals("Hilly Clintbone - DNC")) : "Assertion (c1.toString().equals('Hilly Clintbone - DNC')) failed";
        assert (c2.toString().equals("C3P0 - Rebellion")) : "Assertion (c2.toString().equals('C3P0 - Rebellion')) failed";
        assert (c3.toString().equals("0100101 - 001010")) : "Assertion (c3.toString().equals('0100101 - 001010')) failed";
        assert (c4.toString().equals("....&^% - 00302032")) : "Assertion (c4.toString().equals('....&^% - 00302032')) failed";
        assert (c5.toString().equals("_ - Republican party")) : "Assertion (c5.toString().equals('_ - Republican party')) failed";
        
        System.out.println("Testing Complete");
    }
}
