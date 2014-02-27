package hw1;
import java.util.HashSet;
import java.io.*;
import java.util.*;
import org.biojava3.core.sequence.io.*;
import org.biojava3.core.sequence.ProteinSequence;

public class UniqueSequences{

    public static void main(String[] args) throws IOException, Exception{  

            if(args.length != 1){  
                    System.out.println("Usage: UniqueSequences <filename>");  
                    System.exit(1);  
            }  
    
            System.out.println("Opening file " + args[0] + " ...");
    
            LinkedHashMap<String, ProteinSequence> a = FastaReaderHelper.readFastaProteinSequence(new File(args[0]));
    
            HashSet<String> hs = new HashSet<>();
            
            for (ProteinSequence sequence : a.values()) {
                hs.add(sequence.toString());
            }   
    
            System.out.println(hs.size()+" unique sequences found!");
    }
}
