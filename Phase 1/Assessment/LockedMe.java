package lockedMe;

import java.io.*;
import java.util.*;

public class LockedMe {
    
	static String DIRECTORY;
    File FOLDER;

    public LockedMe() {
        
    	DIRECTORY = System.getProperty("user.dir");
        FOLDER = new File(DIRECTORY + "/files");
        
        if (!FOLDER.exists())
            FOLDER.mkdirs();
        
        System.out.println("DIRECTORY : " + FOLDER.getAbsolutePath());
    }

    private static final String WELCOMESCREEN = "\n***************************************************************\n" + 
    											"\t LockedMe.com \n" + 
    											"\n " + "\t Developed by Bhabna Nayak \n" + 
    											"***************************************************************";	

    private static final String FIRSTMENU = " 	\n MAIN MENU - \n" + "\n" +
                    						"	1. Directory \n" + "\n" +
                    						"	2. Add / Delete / Search \n" + "\n" +
                    						"	3. Exit";

    private static final String SECONDMENU = "   \n Choose your preferance: \n"+ "\n" +
                    						 "   a. Add a file \n"+ "\n" +
                    						 "   b. Delete a file \n"+ "\n" +
                    						 "   c. Search a file \n"+ "\n" +
                    						 "   d. Back";		
    
    void showMenu1() {
        
    	System.out.println(FIRSTMENU);
        
    	try {
    		
    		Scanner scan = new Scanner(System.in);
            int preferance = scan.nextInt();
            
            switch (preferance) {
                
            case 1 : 
                    show();
                    showMenu1();
                break;
                
            case 2 : 
                    showMenu2();
                break;
                
            case 3 : 
                    System.out.println("Closing your application... \n Thank you!");
                    System.exit(0);
                break;
                
            default: showMenu1();
            }
            
            scan.close();
        }
        
        catch (Exception e) {
            
        	System.out.println("Enter 1, 2 or 3");
            showMenu1();
        }
    }

    void showMenu2() {
        
    	System.out.println(SECONDMENU);
        
        try {
            
        	Scanner scan = new Scanner(System.in);
            char[] input = scan.nextLine().toLowerCase().trim().toCharArray();
            char preferance = input[0];

            switch (preferance) {
                
            case 'a' : 
                    System.out.print("Enter the file name you need to add : ");
                    String file = scan.next().trim().toLowerCase();
                    add(file);
                    break;
               
            case 'b' : 
                    System.out.print("Enter the file name you need to delete : ");
                    String file1 = scan.next().trim().toLowerCase();
                    delete(file1);
                    break;
                
            case 'c' : 
                    System.out.print("Enter the file name you need to search : ");
                    String file2 = scan.next().trim().toLowerCase();
                    search(file2);
                    break;
                
            case 'd' : 
                    System.out.println("Back to main menu");
                    showMenu1();
                    break;
                
            default : System.out.println("Enter a, b, c or d");
            }
            
            showMenu2();
            scan.close();
        }
        
        catch (Exception e) {
            
        	System.out.println("Enter a, b, c or d");
            showMenu2();
        }
    }

    void show() {
        
    	if (FOLDER.list().length == 0)
            System.out.println("The folder is empty");
        
    	else {
            String[] list = FOLDER.list();
            System.out.println("The files in "+ FOLDER +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }

    void add(String file) throws IOException {
        
    	File path = new File(FOLDER +"/"+file);
        String[] list = FOLDER.list();
        
        for (String file1: list) {
            if (file.equalsIgnoreCase(file1)) {
                System.out.println("File " + file + " already exists at " + FOLDER);
                return;
            }
        }
        
        path.createNewFile();
        System.out.println("File " + file + " added to "+ FOLDER);
    }

    void delete(String file) {
        
    	File path = new File(FOLDER + "/" + file);
        String[] list = FOLDER.list();
        
        for (String file2: list) {
            if (file.equals(file2) && path.delete()) {
                System.out.println("File " + file + " deleted from " + FOLDER);
                return;
            }
        }
        System.out.println("File Not Found");
    }

    void search(String file) {
        
    	String[] list = FOLDER.list();
        
    	for (String file3: list) {
            if (file.equals(file3)) {
                System.out.println("File Found : File " + file + " is at " + FOLDER);
                return;
            }
        }
        System.out.println("File Not Found");
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        
    	System.out.println(WELCOMESCREEN);
        LockedMe menu = new LockedMe();
        menu.showMenu1();
    }
}