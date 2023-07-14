package ClasesArbolBinario;

import javax.swing.JOptionPane;
public class ArbolBinario {
	protected Nodo raiz;
	public ArbolBinario(){
		raiz = null;
	}
	public ArbolBinario(Nodo raiz){
		this.raiz = raiz;
	}
	public Nodo raizArbol(){
		return raiz;
	}
	//Comprueba el estatus del árbol
	boolean esVacio(){
		return raiz == null;
	}
	// METODOS
	public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
		return new Nodo(ramaIzqda, dato, ramaDrcha);
	}
	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	//Recorrido en orden
	public void imprimirInOrdenRecursivo(Nodo nodo) {
		if (nodo != null) {
			imprimirInOrdenRecursivo(nodo.getIzdo());
			JOptionPane.showMessageDialog(null,nodo.getDato());
			imprimirInOrdenRecursivo(nodo.getDcho());
		}
	}	
	//Recorrido pre orden
	public void preOrden(Nodo nodo) {
		if (nodo != null) {
			JOptionPane.showMessageDialog(null,nodo.dato);
			preOrden(nodo.izdo);
			preOrden(nodo.dcho);
		}
	}
	//Recorrido post orden
	public void postOrden(Nodo nodo) {
		if (nodo != null) {
			postOrden(nodo.izdo);
			postOrden(nodo.dcho);
			JOptionPane.showMessageDialog(null,nodo.dato);
		}
	}
	//IMPRESION
	public void imprimirInOrden() {
		JOptionPane.showMessageDialog(null,"Recorrido en orden");
		imprimirInOrdenRecursivo(raiz);
	}

	public void imprimirPostOrden() {
		JOptionPane.showMessageDialog(null,"Recorrido post orden");
		postOrden(raiz);
	}

	public void imprimirPreOrden() {
		JOptionPane.showMessageDialog(null,"Recorrido pre orden");
		preOrden(raiz);
	}
}
