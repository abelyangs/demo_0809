package com.fhp.testpoi;  
  
import static org.junit.Assert.*;  
  
import java.io.File;  
import java.io.IOException;  
import java.util.List;  
  
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;  
import org.junit.Test;  
  
import com.fhp.testpoi.entity.User;  
  
public class TestUserXlsxReader {  
  
    @Test  
    public void testRead() throws InvalidFormatException, IOException {  
        File file = new File("H:/testxlsx.xlsx");  
        UserXlsxReader reader = new UserXlsxReader();  
        List<User> users = reader.read(file);  
        assertEquals(3, users.size());  
    }  
}  
