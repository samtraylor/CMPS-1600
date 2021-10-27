import java.util.ArrayList;

/**
 * Class for creating a ballot for a certain office and adding cantidates to the ballot. Also
 * has functionality of returning list of cantidatees
 * 
 * @author Sam Traylor & Vaughn Bangash
 * @version 1.0
 */
public class Ballot
{
    private String office;
    private ArrayList<Candidate> Candidates = new ArrayList<Candidate>();
    /**
    * Constructor used to create a new ballot for a certain office
    * 
    * @param officeName is the name of the office as a string
    */
    public Ballot(String officeName)
    {
        this.office = officeName;
    }
    
    /**
    * Method for returning the name of the office that the ballot's for
    * 
    * @return the name of the office in string form
    */
    public String getOfficeName()
    {
        return office;
    }

    /**
    * Method for adding a cantidate object to the ArrayList of cantidates stored
    * 
    * @param the Cantidate object to be added to the arraylist
    */
    public void addCandidate(Candidate c)
    {
        Candidates.add(c);
    }
    /**
     * Method for returning the ArrayList of Candidate Objects 
     * 
     * @return ArrayList of Candidate objects 
     */
 
    public ArrayList<Candidate> getCandidates()
    {
       return Candidates;
    }
}
