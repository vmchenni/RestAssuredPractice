package resources;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.testng.reporters.Files;
import sun.misc.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Paths.*;

public class Resource {
    public static String fngetResource(){
        String sResource="/maps/api/place/findplacefromtext/json";
        return sResource;
    }


    public static void fnGetDataInXMLFormat(String sFilePath) throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(sFilePath);
//        fileInputStrea
    }
}
