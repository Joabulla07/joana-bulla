import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TDDTest {
	
	List<String> lista = new ArrayList<String>() ;

	@Test
	public void CreateList() throws Exception {		
		assertTrue(lista.isEmpty());
		
	}
	
	public void AddFile() throws Exception{
		String file = "joanna.txt";
		lista.add(file);
		String DatoEsperado = lista.get(0);
		assertTrue(DatoEsperado.equals(file));
	}

	public void BumpedDuplicated() throws Exception{
		String file = "joanna.txt";
		if(lista.contains(file)){
			 lista.remove(file);
			 lista.add(file);
			 String DatoEsperado = lista.get(0);
			 assertTrue(DatoEsperado.equals(file));
		}
	}
	
	public void RemoveLast() throws Exception{
		String file = "joanna.txt";
		if(lista.size()>= 15){
			lista.remove(15);
		}
		lista.add(file);
		assertEquals(lista.size(), 15);
	}
}