package kata.pkg4v4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class Kata4v4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Desktop\\kata 4.txt";
        String to = "C:\\Users\\usuario\\Desktop\\kata 4 (1).txt";
        
        Date time = new Date();
        InputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        byte[] buffer = new byte [1024];
        
        while(true){
            int read = input.read(buffer);
            if(read < 0) break;
            output.write(buffer);
        }
        System.out.println(new Date().getTime() - time.getTime());
        input.close();
        output.flush();
        output.close();
    }
}
