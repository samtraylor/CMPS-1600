
// YOU ARE NOT REQUIRED TO FULLY UNDERSTAND THIS CODE; READ IT BUT YOU MAY NOT
// MODIFY IT.

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * This assignment tasks the programmer with writing code for methods implemented by a voting
 * machine. The functionality of a GUI, and the stubs for methods needed for the code to work
 * already exist, but need to be completed. The goal is for the cantidates listed on the input
 * file to populate a ballot that the user can interact with, selecting a candidate (or 
 * several) and casting votes for them. Then, the user should be able to select where that 
 * information (the candidates vote counts and the winner) is written to, as an output file.
 */
 
public class PerfectCandidate
{
	public static void main(String[] args)
	{
		Ballot ballot = null;

		do
		{
			FileSelector inputSelector = new FileSelector(
				null, "Select Input File", "Path to input file", true);
			
			inputSelector.setVisible(true);
	
			String inputFilename = inputSelector.getSelectedFile();
	
			if (inputFilename == null)
			{
				return;
			}
	
			try
			{
				ballot = BallotReader.readBallot(inputFilename);
			}
			catch (IOException e)
			{
				JOptionPane.showMessageDialog(null,
					"Could not open and read input file",
					"Input Error",
					JOptionPane.ERROR_MESSAGE);
			}
		}
		while (ballot == null);

		BallotDialog bf = new BallotDialog(null, ballot);
		bf.setVisible(true);

		FileSelector outputSelector = new FileSelector(
			null, "Select Output File", "Path to output file", false);
			
		outputSelector.setVisible(true);
	
		String outputFilename = outputSelector.getSelectedFile();

		if (outputFilename == null)
		{
			return;
		}

		try
		{
			ResultWriter.writeResults(outputFilename, ballot);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null,
				"Could not write results to output file",
				"Output Error",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
