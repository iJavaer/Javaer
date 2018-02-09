package main;


import java.io.File; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class PathChecker {

	public static void main(String[] args) {
		CheckPath Check = new CheckPath();
		
		if (Check.CheckValid("D:\\PathChecker")){ //check folder
			System.out.println("Valid Path..");
		} else {
			System.out.println("Invalid Path");
		}
		
		if (Check.CreatePath("D:\\PathChecker.create.....!@#$")){ //create folder
			System.out.println("Create Path Success");
		} else {
			System.out.println("Create Path Fail");
		}
		
		if (Check.CreatePath("D:\\PathChecker",true)){ //create folder with timestamp
			System.out.println("Create Path Success");
		} else {
			System.out.println("Create Path Fail");
		}
		
		if (Check.CreateFile("D:\\hehe\\PathChecker.xml")){ //create file. if folders missing will also create folder
			System.out.println("Create File Success");
		} else {
			System.out.println("Create File Fail");
		}
		
		if (Check.CreateFile("D:\\hehe\\PathChecker.xml",true)){ //create file with timestamp. if folders missing will also create folder
			System.out.println("Create File Success");
		} else {
			System.out.println("Create File Fail");
		}
			
	}

}

class CheckPath{
	
	public boolean CheckValid(String path){
		boolean result = false;
		
		try {
			File fileLoc = new File(path);

			if (fileLoc.exists()) {
				result = true;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public boolean CreatePath(String path){
		boolean result = false;
		
		try {
			
			File fileLoc = new File(path);
			
			if (CheckValid(path)){
				System.out.println("Path already exist");
			}else if (!CheckValid(path)) {
				fileLoc.mkdirs();
				result=true;
			}
	    
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean CreatePath(String path, boolean isTimeStamp){
		boolean result = false;
		
		try {
			
			if (isTimeStamp) {
				path += new SimpleDateFormat("yyyyMMddHHmmss").format(new Timestamp(System.currentTimeMillis()).getTime());
			}
			
			File fileLoc = new File(path);
			
			if (CheckValid(path)){
				System.out.println("Path already exist");
			}else if (!CheckValid(path)) {
				fileLoc.mkdirs();
				result=true;
			}
	    
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean CreateFile(String fileName){
		boolean result = false;
		
		try {
					
			File fileLoc = new File(fileName);
			
			if (!CheckValid(fileLoc.getParentFile().toString())){
				CreatePath(fileLoc.getParentFile().toString());
			}
			
			if (CheckValid(fileName)) {
				System.out.println("File already exists");
			} else {
				fileLoc.createNewFile();
				result = true;
			}
	         
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean CreateFile(String fileName, boolean isTimeStamp){
		boolean result = false;
		
		try {
					
			if (isTimeStamp) {
				fileName += new SimpleDateFormat("yyyyMMddHHmmss").format(new Timestamp(System.currentTimeMillis()).getTime());
			}
			
			File fileLoc = new File(fileName);	
			
			if (!CheckValid(fileLoc.getParentFile().toString())){
				CreatePath(fileLoc.getParentFile().toString());
			}
			
			if (CheckValid(fileName)) {
				System.out.println("File already exists");
			} else {
				fileLoc.createNewFile();
				result = true;
			}
	         
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
