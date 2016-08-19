/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.util.ArrayList;

/**
 *
 * @author chintan
 */
public class FileList {
    private ArrayList<FileItem> fileList;
    private FileItem fileItem;
    
    public FileList(){
        fileList = new ArrayList<>();
    }

    public ArrayList<FileItem> getFileList() {
        return fileList;
    }

    public FileItem getFileItem() {
        return fileItem;
    }
    
    
}
