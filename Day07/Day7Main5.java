class Day7Main5{
	public static void main(String[] args){
		String s1 = "PROGRAMMING";
		String s2 = s1.toLowerCase();
		String s3 = "aeiou";
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i<s2.length(); i++){
			for(int j = 0; j<s3.length(); j++){
				if(s2.charAt(i) == s3.charAt(j)){
					vowels++;
					break;
				}
				else{
					consonants++;
				}
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}
}