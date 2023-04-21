
public class Venda_Buida_Exception extends Exception{
	
	 private static String msj_error;

	public Venda_Buida_Exception() {}
	
	public Venda_Buida_Exception(String msj_error) {
		Venda_Buida_Exception.msj_error = "Per fer una venda primer has d’afegir productes";
		
	}
	
	public static String get_Message() {
	    return Venda_Buida_Exception.msj_error;
	}
	
	
}
