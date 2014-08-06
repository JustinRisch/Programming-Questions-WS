import java.lang.StringBuffer;
public class triforce {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("");
		for (byte i = 0; i<4; i++){
			System.out.println(a.append(i%2));
		}

	}

}
