package mainApplication;


import java.io.File;
import java.util.Scanner;

import datamodel.buildingblocks.Document;
import datamodel.buildingblocks.Document.DocumentRawType;
import engine.Engine;
import exporters.MarkdownExporter;
import exporters.PdfExporter;

public class textEditorApplication {
	private Scanner reader;
	
	public textEditorApplication(){
		reader = new Scanner(System.in); 
	}
	
	public Scanner getReader(){
		return reader;
	}
	
	public int printMenu(){
		int choice = 0;
		while( choice > 5 || choice <= 0){
			System.out.println("Select an Option\n 1. Add Rule\n 2. Upload File\n 3. Produce Report\n 4. Export\n 5. Exit");
			choice = reader.nextInt();
			if(choice > 5 || choice <= 0)
				System.out.println("Wrong answer! Try again...");
		}
		
		return choice;
	}

	public void closeReader(){
		reader.close();
	}
	
	public static void main(String args[]) {
		textEditorApplication t = new textEditorApplication();
		int choice = t.printMenu();
		Scanner fileScanner;
		
		if (choice == 1) {
			if(Engine.Document.docType == DocumentRawType.RAW) {
				System.out.println("Define rule for raw file:");
				registerInputRuleSetForPlainFiles();
			}
			else if(Engine.Document.docType == DocumentRawType.ANNOTATED) {
				System.out.println("Define rule for annotated file:");
				registerInputRuleSetForAnnotatedFiles();
			}
			
		}
		else if (choice == 2) {
			loadFileAndCharacterizeBlocks();
		}
		else if (choice == 3) {
		    reportWithStats();
		}
		else if (choice == 4) {
			int exportChoice;
			if (f.exists()) { //an uparxei anevasmeno file
				System.out.println("Select format to export:\n 1. PDF\n 2. Markdown");
				exportChoice=exportScanner.nextInt();
				if (exportChoice == 1) {
					exportPdf();
				}
				
				else if(exportChoice == 2) {
					exportMarkdown();
				}	
			}
			else System.out.println("Please load a file first");
		}
		else {
			break;
		}
	}		  
}
		
	
		


