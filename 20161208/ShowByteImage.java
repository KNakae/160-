import java.io.*;

public class ShowByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;
		try{
			inFile = new FileInputStream("mikan.png");
			int data;
			int n=0;
			while(( data= inFile.read())!= -1){
				n++;
				System.out.println( n+"バイト目："+data);
			}
			inFile.close();
		}catch(IOException e){
			System.err.println("エラーです。");
			System.exit(1);
		}
		
	}
}