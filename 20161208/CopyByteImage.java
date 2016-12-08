import java.io.*;

public class CopyByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try{
			inFile = new FileInputStream("mikan.png");
			outFile = new FileOutputStream("m.png");
			int data;
			int n=0;
			while(( data= inFile.read())!= -1){
				n++;
				System.out.println( n+"バイト目："+data);
				outFile.write(data);
			}
			inFile.close();
		}catch(IOException e){
			System.err.println("エラーです。");
			System.exit(1);
		}
		
	}
}