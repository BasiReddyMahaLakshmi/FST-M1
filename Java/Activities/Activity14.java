package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/file1.txt");
        boolean fStatus = file.createNewFile();
        File fileUtil = FileUtils.getFile("src/file1.txt");
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);
        File newFile = FileUtils.getFile(destDir, "file1.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Data in new file is: " +newFileData);
    }
}
