package main.folderfile;

import java.time.LocalDate;

public abstract class Item {
    
   
    private String name;
    private LocalDate date; 
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public abstract double getSize();
    
    public abstract boolean search(String txt);
    
    
    
    
}
