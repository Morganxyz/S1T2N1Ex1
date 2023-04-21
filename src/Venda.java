import java.util.ArrayList;


public class Venda {

	ArrayList<Producte>llistaProductes = new ArrayList<>();
	private float preuTotalVenda;
	
	public Venda(float preuTotalVenda) {
		this.preuTotalVenda = preuTotalVenda;

	}
	
	public void setPreuTotalVenda(float preuTotalVenda) {
		this.preuTotalVenda = preuTotalVenda;
	}

	public void calcularTotal() throws Venda_Buida_Exception {
		
		float sumatori = 0f;
		
		if(llistaProductes.size() == 0) {
			
			throw new Venda_Buida_Exception(Venda_Buida_Exception.get_Message());
			
		}else if(llistaProductes.size() != 0) {
			for(Producte p : llistaProductes) {
				sumatori = p.getPreu();
				this.preuTotalVenda += sumatori;
			}
		}
	}
	
	public void subir_Precio() {
		
		for(int i = 0; i > llistaProductes.size();i++) {
			llistaProductes.get(i).setPreu(i);
		}
	}
	
	public void veureArray() throws Exception{
		
		int [] llista = {5,4,3,2,1};
		
		try {
		System.out.println(llista[7]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El nombre buscat está fora de rang!");
		}
	}

}
