class Solution{

	public boolean gus(String str){
		String s = str+str;

		return s.substring(1, s.length()-1).contains(str);
	}

	public static void main(String[] args) {
		System.out.println("Prueba 1: "+(gus("hola")==false))
		System.out.println("Prueba 1: "+(gus("hola")==false))
		System.out.println("Prueba 1: "+(gus("hola")==false))
		System.out.println("Prueba 1: "+(gus("hola")==false))
		System.out.println("Prueba 1: "+(gus("hola")==false))
		
	}
}