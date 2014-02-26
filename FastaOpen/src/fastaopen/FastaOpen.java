package fastaopen;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
 
import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.io.FastaReaderHelper;
 
public class FastaOpen {
 private static int i;
	public static void main(String[] args) throws Exception{
          
		/*
		 * Method 1: With the FastaReaderHelper
		 */
		//Try with the FastaReaderHelper
		LinkedHashMap<String, ProteinSequence> a = FastaReaderHelper.readFastaProteinSequence(new File(args[0]));
		//FastaReaderHelper.readFastaDNASequence for DNA sequences
 
		for (  Entry<String, ProteinSequence> entry : a.entrySet() ) {
			System.out.println( entry.getValue().getOriginalHeader() + "=" + entry.getValue().getSequenceAsString() );
		}
 
		
                try{        
        InputStream fstream = null;
        BufferedInputStream br = null;
        DataInputStream in = null;
            fstream = new FileInputStream("D:/text.txt");
            br = new BufferedInputStream(fstream);
            in = new DataInputStream(br);
            String temp = null;
            HashSet<String> hs=new HashSet<>();
            HashSet<String> hs1=new HashSet<>();
            System.out.println("Print the sequence to be searhed");
            String searchString;
            Scanner user_input = new Scanner( System.in );
            searchString= user_input.next( );
        
            System.out.println("The File Contains");
            while((temp = in.readLine()) != null){
                hs.add(temp);
                System.out.println(temp);
            }
            
      
            for(int i=0;i<searchString.length();i++)
                    {
                          char str1= searchString.charAt(i);
                        String ss = new String ( new char[] {str1});
                     
                        hs1.add(ss);
                        
                    }
       
           
          int count =0;     
                       for(int i=0;i<searchString.length();i++)
                    {
                           Iterator iter = hs.iterator();//GY
                          int j=i;
                         while (iter.hasNext()) {
                                char str1= searchString.charAt(j);
                                String ss = new String ( new char[] {str1});
                                 if(iter.toString().equals(ss))
                                 {
                                      count++;
                                      j++;
                                  }
                                iter.next();      
                               count++;
                         }
                    }    
             System.out.println("The Count of Sequence is "+count);
          
        
    }catch(Exception e){
        System.out.println(e);
    }
  }
}
 

