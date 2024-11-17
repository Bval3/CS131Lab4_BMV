import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String>  stringList ;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		if (stringLength < 5){ setStringLength(5);}
		else {setStringLength(stringLength);}
		setFileName(fileName);
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile() {
		input = new Scanner(getFileName());
		try {
		while (input.hasNextLine()){
			if(input.next().length() > getStringLength()) {
				throw new StringTooLongException("String is too long!");
			}
			stringList.add(input.next());
			}
		}
		catch (StringTooLongException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}//end processFile

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) {
		this.stringLength = stringLength;
	}
	
	
}//end class