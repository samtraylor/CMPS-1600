import java.util.ArrayList;
/**
 * JUnit test for Ballot Class and its methods
 *
 * @author Sam Traylor & Vaugn Bangash
 * @version 1.0
 */
public class BallotTester
{
    /**
     * First, construct 2 base case ballots and 2 border case ballots 
     * Then, test the methods in Ballot on these cases 
     * 
     */
    public static void main(String[] args)
    {
        Ballot b1 = new Ballot("Supreme leader");
        Ballot b2 = new Ballot("Local constable");
        Ballot b3 = new Ballot("FFF///$");
        Ballot b4 = new Ballot("//___   ");
        
        System.out.println("Testing Started:");
        
        //Beginning assertion tests for getOfficeName() method:
        
        assert (b1.getOfficeName().equals("Supreme leader")) : "Assertion (b1.getOfficeName().equals('Supreme leader')) failed";
        assert (b2.getOfficeName().equals("Local constable")) : "Assertion (b2.getOfficeName().equals('Local constable')) failed";
        assert (b3.getOfficeName().equals("FFF///$")) : "Assertion (b3.getOfficeName().equals('FFF///$')) failed";
        assert (b4.getOfficeName().equals("//___   ")) : "Assertion (b4.getOfficeName().equals('//___   ')) failed";
        
        //Adding test candidates via addCandidate Method:
        
        Candidate c1 = new Candidate("Hilly Clintbone","DNC");
        Candidate c4 = new Candidate("....&^%","00302032");
        Candidate c5 = new Candidate("_", "Republican party");
        
        b1.addCandidate(c1);
        b1.addCandidate(c4);
        b1.addCandidate(c5);
        
        b2.addCandidate(c1);
        b2.addCandidate(c5);
        
        //Creating ArrayLists with same candidate objects to compare with output of getCandidates()
        
        ArrayList<Candidate> Cans = new ArrayList<Candidate>();
        
        Cans.add(c1);
        Cans.add(c4);
        Cans.add(c5);
        
        ArrayList<Candidate> Cans2 = new ArrayList<Candidate>();
        
        Cans2.add(c1);
        Cans2.add(c5); 
        
        //Beginning assertion tests for getCandidates() method:
        
        assert (b1.getCandidates().get(0) == Cans.get(0)) : "Assertion (b1.getCandidates().get(0) == Cans.get(0))  failed";
        assert (b1.getCandidates().get(1) == Cans.get(1)) : "Assertion (b1.getCandidates().get(1) == Cans.get(1))  failed";
        assert (b1.getCandidates().get(2) == Cans.get(2)) : "Assertion (b1.getCandidates().get(2) == Cans.get(2))  failed";
        
        assert (b2.getCandidates().get(0) == Cans2.get(0)) : "Assertion (b2.getCandidates().get(0) == Cans2.get(0)) failed";
        assert (b2.getCandidates().get(1) == Cans2.get(1)) : "Assertion (b2.getCandidates().get(1) == Cans2.get(1)) failed";
        
        System.out.println("Testing Complete.");
        
        
       
    }

}
