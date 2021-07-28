package main.folderfile;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
  
        Folder mainFolder = new Folder();
        Folder folder_2 = new Folder("folder_2", LocalDate.now());
        Folder folder_3 = new Folder("folder_3", LocalDate.now());
        File file_1 = new File("file1", LocalDate.now(), Extension.PDF, 3);
        File file_2 = new File("file2", LocalDate.now(), Extension.PDF, 3);
        mainFolder.addIdem(folder_2);
        mainFolder.addIdem(folder_3);
        folder_3.addIdem(file_1);
        folder_3.addIdem(file_2);
        
        mainFolder.createFolder("newFolder", LocalDate.now());
        
        mainFolder.createFile("newFile", LocalDate.now(), Extension.TXT, 5);
        
        // System.out.println(mainFolder.items.size());
        
        System.out.println("Main-Folder je kreiran: " + LocalDate.now() + ", a sadrzi sledece foldere i fajlove: ");
        for (int i = 0; i < mainFolder.items.size(); i++) {
            Item item = mainFolder.items.get(i);
            System.out.println(item);
        }
        
        mainFolder.getSize();
        
        System.out.println(mainFolder.getSize());
        System.out.println(folder_3.getSize());
        
        mainFolder.search("file1");
        
        System.out.println(mainFolder.search("folder_3"));
        System.out.println(mainFolder.search("file2"));
        
        
    }
    
}
