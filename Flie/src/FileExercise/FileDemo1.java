
package FileExercise;

import java.io.File;


public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("C:/Users/User/OneDrive/Desktop/Person");
        dir.mkdir(); //directory will be created   
        String path = dir.getAbsolutePath();
        System.out.println(path);
        
        System.out.println("Directory name:"+dir.getName());
        
        
        if(dir.delete()){
            System.out.println(dir.getName()+ "Folder has been deleted.");
        }
    }
}
