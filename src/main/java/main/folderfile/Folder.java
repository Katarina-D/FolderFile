package main.folderfile;

import java.time.LocalDate;
import java.util.ArrayList;


public class Folder extends Item  {
    
    ArrayList<Item> items = new ArrayList<>();
    
    Folder() {
        
    }
    
    Folder(String name, LocalDate date) {
        this.setName(name);
        this.setDate(date);
    }
    
    public void createFolder(String name, LocalDate date) {
        Folder folder = new Folder(name, date);
        
        items.add(folder);
    }
    
    public void createFile(String name, LocalDate date, Extension extension, int fileSize) {
        File file = new File(name, date, extension, fileSize);
        items.add(file);
    }
    
    public void addIdem(Item item) {
        items.add(item);
    }
    
    @Override
    public String toString() {
        return "FOLDER: "+ getName() + "-" + getDate();
    }

    @Override
    public double getSize() {
       double size = 0;
        for(Item item:items){
           size = size + item.getSize();
       }
       return size;
    }
    
    @Override
    public boolean search(String txt) {
        boolean isFalse = false;
        for(Item item:items) {
            boolean fileName = item.search(txt);
            boolean folderName = item.getName().toLowerCase().contains(txt.toLowerCase());
            
            if (fileName == true || folderName == true) {
               isFalse = true; 
            }
           
        }
        return isFalse;
    }
    
    
    

    
}   
