import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class used to read information from an input file and create a ballot based on that info
 * 
 * @author Sam Traylor
 * @version 1.0
 */
public class BallotReader
{
    /**
     * Method to read ballot information from a file and process it. Reads in the office name from
     * the first line, and the amount of candidates from the second line. Then, on candidate lines, using 
     * the ';' as a delimiter, the code establishes everything before that symbol as the name, and everything
     * from the after the ';' until the end of the line as the affiliation. After iterating through all the
     * candidates, a ballot is created. The candidates are added by a loop, which instantiates a new object
     * of candidate each time with the affiliation and name that correspond. By the end of that, there's a 
     * ballot with all the candidates from the file.
     *
     * @param filename is the name of the input file as a string
     * @return a ballot object constructed from the data in the input file
     */
    public static Ballot readBallot(String filename)
    throws IOException
    {
        File file = new File(filename);
        Scanner inFS = new Scanner(file); 
        
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> affiliations = new ArrayList<String>();
        
        String office = inFS.nextLine(); //name of office is first line
        int numCans = Integer.parseInt(inFS.nextLine()); //get number of candidates for loop
        
        int x = 0;
        
        String buildCanName;
        String buildCanAffil;
        for(x = 0; x < numCans; x++) //loop through all candidates
        {
            buildCanName = "";
            buildCanAffil = "";
            /* 
             * ^These two are erased at beginning of iteration in order to get rid of the 
             * data from the last candidate.
             */
            
            if(inFS.hasNext() == true)
            {
                inFS.useDelimiter(";"); //set delimeter to where next() gets either side of ';'
                buildCanName = inFS.next(); //candidate name is from beginning of line to the ;
                inFS.useDelimiter("\\n");//set delimeter to stop reading at end of line
                buildCanAffil = inFS.next().substring(1); //affiliation is rest of line except ';' 
            }
            
            inFS.reset(); //since we use this scanner again, reset to default delimiter
            
            names.add(buildCanName); //add name to the ArrayList

            affiliations.add(buildCanAffil); //add Affil to ArrayList
        }
      
        Ballot ballot = new Ballot(office); //create ballot with office name from earlier variable
        
        for (x = 0; x < numCans; x++) //iterate through names and affiliations, adding candidates 
        {
            ballot.addCandidate(new Candidate(names.get(x),affiliations.get(x)));
        }
        
        return ballot;
    }
}
