public class Main {
		public static void main(String[] args) {
				Seed128 seed128 = new Seed128("password12345678");
				String plain = "달부는 바보야";
				String enc = seed128.encrypt(plain);
				String dec = seed128.decrypt(enc);

				System.out.println(enc);
				System.out.println(dec);
		}
}
