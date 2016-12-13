import java.io.*;

public class ShowText{
	public static void main(String args[]){
		String FileName = args[0];
		FileReader inF = null;
		BufferedReader inFile = null;
	
	int n=0;
	try{
		inF = new FileReader(Filename);
		inFile = new BufferedReader(inF);

		String data;
		while((data = inFile.readLine()) !=null){
			System.out.println(data);
			n++;
		}
		System.out.println(n + "行あります");
		inFile.close();
	}catch(IOException e){
		System.err.println("エラーです");
		System.exit(1);

	}
	}
}