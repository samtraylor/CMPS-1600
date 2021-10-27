import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * Class for writing results to an output file. Configures special formatting and uses it
 * to print out the results in the necessary layout
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class ResultWriter
{
  /**
  * Method to  write results to output file. Opens file, determines # of dashes to be placed under
  * office name, then writes them, then prints newline. Next, it's determined which candidate
  * has a 'tag' of the longest length (tag is their name and affiliation seperated by a dash
  * with a space on both sides). From there, we know that the length of every line should be
  * the longest tag plus 12. Using that, we iterate through each candidate, placing the correct
  * amount of spaces after their tag to where the vote count (regardless of length), combined 
  * with the spaces, equals 12 chacters (thus ensuring uniformity in the lines). Next, the 
  * winner is calculated and displayed.
  * 
  * @param filename is the desired name of your output file
  * @param ballot is the ballot object whose info is  being written to the output file
  */
    public static void writeResults(String filename, Ballot ballot)
    throws IOException
    {
      FileOutputStream fileByteStream = null; // File output stream
      PrintWriter outFS = null;               // Output stream

      fileByteStream = new FileOutputStream(filename);
      outFS = new PrintWriter(fileByteStream);
      
      String office = ballot.getOfficeName();
      int numDashes = 10 + office.length();
      String dashes = "";
      int x;
      for(x = 0; x < numDashes; x++) 
      {
          dashes += "-";
      }
          
      
      outFS.println("RESULTS - " + office);
      outFS.println(dashes);
      
      //Now we need to see what the longest tag is, because the end of each line should be
      //12 spaces from the end of the tag with the longest length
      
      String assembledTag = "";
      int longTagLen = 0;
      
      for(Candidate c: ballot.getCandidates()) 
      {
          assembledTag = c.toString();
          
          if(assembledTag.length() >  longTagLen) //if this tag's the longest seen so far
          {
              longTagLen = assembledTag.length(); //it becomes new longest  length
          }
      } 
      
      int lineLen = longTagLen + 12;
      int voteCountLen = 0;
      int linesDone = 0;
      
      for(Candidate c: ballot.getCandidates()) 
      {
          assembledTag = c.toString(); //tag
          
          voteCountLen = String.valueOf(c.getVoteCount()).length(); //length of vote count
          
          if(linesDone == 0) { //prevent extra space on first line via (lineLen - 1) case
              while(assembledTag.length() < (lineLen -1) - voteCountLen)  
             {
              assembledTag += " "; 
             } 
             linesDone++; //after linesDone is no longer 0, the 'else' case is used for every other
          }
          else { 
              while(assembledTag.length() < lineLen - voteCountLen)  
              {
                  assembledTag += " ";
              } 
          }
          
          assembledTag += c.getVoteCount(); //add votecount after proper # of spaces
          outFS.print(assembledTag); //write the line
      }
      
      outFS.println("\n");
      
      //calculate winner
      int mostVotes = 0;
      Candidate winner = null;
      for(Candidate c: ballot.getCandidates())
      {
          if( c.getVoteCount() > mostVotes) //go through candidates to find one with most votes
          {
              mostVotes = c.getVoteCount();
              winner = c;
          }
      }
      
      if(winner == null) {
          outFS.println("WINNER: ");
        }
      else{
          outFS.println("WINNER: " + winner.toString());
        }
        
      outFS.flush();
      fileByteStream.close();
    }
}
