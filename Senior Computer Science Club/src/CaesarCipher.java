
public class CaesarCipher {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		String decrypt = "ymjwjnxstbfdnhfsljyymnxbwtsl";
		int k = 5;
		
		for (int i = 0; i<decrypt.length(); ++i){
			int newKey = ((s.indexOf(decrypt.charAt(i)) - k + 26) ) % 26;
			System.out.print(s.charAt(newKey));
		}
		
	}

}
