import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Project {
 
	//create File ....
	public static void genaretFile(String fileName) throws IOException 
	{
		String filePath="A:\\New folder (4)\\";
		ArrayList<String> aList=new ArrayList<String>();
		
		System.out.println("enter the file name to create");
		String finalname=filePath+fileName;
		
		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) 
		{
			System.out.println("the file not created");
		}
		else 
		{
			aList.add(fileName);
			System.out.println("file created");
		}
		
		System.out.println("Your list is .... "+aList);
	}
	
	//Delete Function
	
	public static void deleteFile(String fileName) {
		String path="A:\\New folder (4)\\";

		String finalfile=path+fileName;
		File file=new File(finalfile);
		file.delete();
		System.out.println("file deleted");
		
	}
	//Searching Function
	
	public static void serchFile(String serchingFileName) {
		String path="A:\\New folder (4)\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		int count=0;
		for(File ff:filename) {
			
			if(ff.getName().equals(serchingFileName))
			{
				count++;
				break;
			}else {
				count=0;
			}
		}
		if (count!=0) {
			System.out.println("You have "+serchingFileName+" File :)");
			
		}else {
			System.out.println("File is not found");
		}
	}
	
	//Display File List...
	
	public  static void displayFile() {
		String path="A:\\New folder (4)\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		System.out.println("Your File List.......");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
	}
	
	
	
	//Main Method Start....
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner =new Scanner(System.in);
		boolean c=true;
		//for stop Main menu;
		
		
		while(c) {
			System.out.println("-----------------Welcome Virtual Key for Your Repositories----------------");
			System.out.println("-----------------Developer= Shubham Bapusaheb Bhavar-----------------------");
			System.out.println();
			System.out.println("1.Retrive File ");
			System.out.println("2.Enter in Menu ");
			System.out.println("3.Exit the System");
			System.out.println();
			boolean b=true;
			int x=scanner.nextInt();
			switch (x) {
			case 1:{
				displayFile();
				System.out.println();
				break;
			}
			case 2: 
			{	while(true) {
				System.out.println("File Options Menu");
				System.out.println();
				System.out.println("1) Create File");
				System.out.println("2) Delete File");
				System.out.println("3) Search File");
				System.out.println("4) Go Main Menu");
				System.out.println("5) Exit");
				System.out.println();
				int i=scanner.nextInt();
				
				if(i<=0 || i>=6) {									
					
					System.out.println("wo ho you not enter valid number....  ");
					System.out.println();
			
				}else{
					
							
							
						
								if(i==1){
									System.out.println("Enter the File Name for Create");
									
									String  FileForCreate=scanner.next();
									genaretFile(FileForCreate);
									System.out.println();
									
								}
								else if(i==2) {
									System.out.println("Enter the File Name for Delete");
									String FileForDelete=scanner.next();
									deleteFile(FileForDelete);
									System.out.println();
								}
								else if(i== 3) {
									System.out.println("Enter the File Name for Serching");
									
								
								String FileForSerching=scanner.next();
								serchFile(FileForSerching);
								System.out.println();
								}
								else if(i==4) {
									System.out.println("Welcom in Main menu,..........");
									System.out.println();
									break;
								}
								else if(i==5) {
									System.out.println(" Exit,..........");
									System.out.println();
									break;
								}
						}
						
						
			}
			break;
				}
			
			case 3:{
				System.out.println("System closse...");
				c=false;
				break;
				
			}
			}
			
			
			
			
		}
		
	}

}


