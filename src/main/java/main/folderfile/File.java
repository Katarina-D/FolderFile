package main.folderfile;

import java.time.LocalDate;

public class File extends Item {

    private Extension extension;
    private int fileSize;
    
    File() {
        
    }
    
    File(String name, LocalDate date, Extension extension, int fileSize) {
        this.setName(name);
        this.setDate(date);
        this.setExtension(extension);
        this.setFileSize(fileSize);
    }
    
    public Extension getExtension() {
        return this.extension;
    }
    
    public void setExtension(Extension extension) {
        this.extension = extension;
    }
    
    public int getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "FILE: " + getName() + "-" + getDate() + "-" + getExtension() + "-" + getFileSize();
    }
    
    @Override
    public double getSize() {
        return fileSize;
    }
    
    @Override
    public boolean search(String txt) {
        return getName().toLowerCase().contains(txt.toLowerCase());
    }

    
    
    
    
}
