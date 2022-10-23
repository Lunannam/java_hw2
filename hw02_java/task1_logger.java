package hw02_java;



import java.util.logging.*;
import java.io.IOException;


public class task1_logger {                     
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(task1_sort.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "Тестовое логирование 1", "array[i]");
        
        // logger.info("Input array" );
    }          
}
