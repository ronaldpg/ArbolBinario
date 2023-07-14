package ClasesArbolBinario;

public class Main {

	public static void main(String[] args) throws Exception {
		ArbolBinario arbol;
		Nodo a1, a2, a;
		Pila pila = new Pila();
		a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
		a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
		a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
		pila.insertar(a);
		a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
		a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
		a = ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
		pila.insertar(a);
		a2 = (Nodo) pila.quitar();
		a1 = (Nodo) pila.quitar();
		a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
		arbol = new ArbolBinario(a);
		arbol.imprimirInOrden();
		arbol.imprimirPostOrden();
		arbol.imprimirPreOrden();
	}

}
