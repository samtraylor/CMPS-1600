/**
 * Class representing a cantidate
 * 
 * @author Sam Traylor & Vaughn Bangash
 * @version 1.0
 */ 
public class Candidate
{
    private String canName;
    private String canAffil;
    private int voteCount = 0;
    /**
     * Constructor for cantidate object
     * 
     * @param name is the name of the cantidate as a string
     * @param affiliation is the affiliation of the cantidate as a string
     */
    public Candidate(String name, String affiliation)
    {
        this.canName = name;
        this.canAffil = affiliation;
    }
    
    /**
     * Method to return cantidate's name
     * 
     * @return the  name of cantidate as String
     */
    public String getName()
    {
        return canName;
    }

    /**
     * Method to return cantidate's affiliation
     * 
     * @return the affiliation of cantidate as String
     */
    public String getAffiliation()
    {
         return canAffil;
    }

    /**
     * Method to return the number of votes
     * 
     * @return the vote count as int
     */
    public int getVoteCount()
    {
         return voteCount;
    }
    
    /**
     * Method to incriment the voteCount for the cantidate
     * 
     */
    public void tallyVote()
    {
        if(voteCount > 0) 
        {
           voteCount++;
        }
         else 
        {
           voteCount = 1;
        }
    }

    /**
     * Method to return the information on the cantidate 
     * 
     * @return the cantidate information in the format of cantidate name, space, dash, space
     * then candidate affiliation
     */
    public String toString()
    {
	 return canName + " - " + canAffil;
    }
}
