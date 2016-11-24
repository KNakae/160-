public class Aloha{
	public static void main(String[] args) {
		for (int i=0;i<20 ;i++ ) {
			if(i%4 ==0){
				System.out.println(i+1 +"回目：Aloha!");
			}else{
				System.out.println(i+1 +"回目：アロハ!");
			}
		}
		
	}
}