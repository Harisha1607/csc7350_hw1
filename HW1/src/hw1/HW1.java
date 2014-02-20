package hw1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
 import java.io.*;
import java.util.*;
import org.biojava3.core.sequence.io.*;
public class HW1 {

   public static void main(String[] args) throws IOException  
    {  
    if(args.length != 2)  
    {  
    System.out.println("Usage: FindString <string> <filename>");  
    System.exit(1);  
    }  
RandomAccessFile in = new RandomAccessFile(args[1],"r");  
String s = null;  
int i, loc = 0;  
for(i=1;(s = in.readLine()) != null;i++)  
{  
loc = s.indexOf(args[0]);  
if (loc == -1)  
continue;  
else  
{  
System.out.println(args[0]+" found in line - "+i);  
System.out.println(s);  
}  
}  
System.out.println(args[0]+" found "+--i+"no of times in the file "+args[1]);  
}  

}
