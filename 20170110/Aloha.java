public class Aloha{
	public static void main(String[] args) {
/*
		for (int i=0;i<20 ;i++ ) {
			if(i%3 == 0){
				System.out.println(i+1+"回目：アロハ!");	
			}else{
				System.out.println(i+1+"回目：ALOHA!");			
			}
		}
*/
		Alohaman am = new Alohaman();
//		Alohaman bm = new Alohaman();
		am.sayAloha(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
class Alohaman{

	private String msg;
	private String msg2;

	public Alohaman(){
		this.msg ="ALOHA!";
		this.msg2 ="アロハ!";
	}

	public void sayAloha(){
		System.out.println( this.msg);
	}
	public void sayAloha(int n,int x){
		for (int i=0;i<n ;i++ ) {
			if(i%x == 0){
				System.out.println( this.msg2);
			}else{
				System.out.println( this.msg);
			}
			
			
		}
	}
}