class Solution{

	public boolean gus(String str){
		String s = str+str;

		return s.substring(1, s.length()-1).contains(str);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("Prueba 1: "+(s.gus("hola")==false));
		System.out.println("Prueba 2: "+(s.gus("abab")==true));
		System.out.println("Prueba 3: "+(s.gus("sdf")==false));
		System.out.println("Prueba 4: "+(s.gus("aaaaaaaaa")==true));
		System.out.println("Prueba 5: "+(s.gus("sdfdfsdf4")==false));
		System.out.println("Prueba 6: "+(s.gus("abababa2")==false));
		System.out.println("Prueba 7: "+(s.gus("holaholahola")==true));
		System.out.println("Prueba 8: "+(s.gus("hola1")==false));
		System.out.println("Prueba 9: "+(s.gus("hola2")==false));
		System.out.println("Prueba 10: "+(s.gus("holaasdfasdf")==false));
		System.out.println("Prueba 11: "+(s.gus("holahol")==false));
		System.out.println("Prueba 12: "+(s.gus("minombre")==false));
		System.out.println("Prueba 13: "+(s.gus("jabonjabonjabon")==true));
		System.out.println("Prueba 14: "+(s.gus("holaholas")==false));
		System.out.println("Prueba 15: "+(s.gus("adiosadios")==true));
		System.out.println("Prueba 16: "+(s.gus("holasdfgg")==false));
		System.out.println("Prueba 17: "+(s.gus("holasdfsdf")==false));
		System.out.println("Prueba 18: "+(s.gus("holasdffds")==false));
		System.out.println("Prueba 19: "+(s.gus("holaaasdfasdf")==false));
		System.out.println("Prueba 20: "+(s.gus("holaasdasdfas")==false));

	}
}