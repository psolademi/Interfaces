import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @Philip Solademi
 */
public class ShortLister {

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f)
    {
        ArrayList<Object> result = new ArrayList<Object>();

        for (Object obj: objects)
        {
            if(f.accept(obj))
            {
                result.add(obj);
            }
        }
        return result;
    }
    public static void main(String[] args) {
// Prompts user to select an existing file
// Display the file with the correct format

        PrintWriter out;
        Scanner in; // in is the file we are reading
        Scanner console = new Scanner(System.in);
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        String line;
        String outFileName = "";
        String defaultFileName = "default.txt";
        int lineCount = 0;

        try
        {
// Display FileChooser Wizard for user to select a file to open
// check to make sure user actually picked a file to open
// if they did, go ahead and read it and dump it to the screen

// Set the JFileChooser to use the Netbeans projcet folder
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile(); // this is a File object not a String filename
                in = new Scanner(selectedFile); // Open the file for reading

                in.close();
//out.close();
            }
            else // they didn't select a file so exit...
            {
                JOptionPane.showMessageDialog(null, "Cancelled by User. Exiting...");
                System.exit(0);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found error!");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }


    }

}