package proyectoedd;


import proyectoedd.NodoHash;

public class HashTable<K, V> {
    private NodoHash<K, V>[] tabla;
    private int capacidad;
    private int tamaño;

    public HashTable(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new NodoHash[capacidad];
        this.tamaño = 0;
    }

    public HashTable() {
        this(31);
    }

    private int calcularHash(K clave) {
        if (clave == null) return 0;
        return Math.abs(clave.hashCode()) % capacidad;
    }

    public void put(K clave, V valor) {
        if (clave == null) return;

        int indice = calcularHash(clave);
        NodoHash<K, V> cabeza = tabla[indice];
        NodoHash<K, V> actual = cabeza;

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                actual.valor = valor;
                return;
            }
            actual = actual.siguiente;
        }

        NodoHash<K, V> nuevoNodo = new NodoHash<>(clave, valor);
        nuevoNodo.siguiente = cabeza;
        tabla[indice] = nuevoNodo;
        tamaño++;
    }

    public V get(K clave) {
        if (clave == null) return null;

        int indice = calcularHash(clave);
        NodoHash<K, V> actual = tabla[indice];

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }
        return null; 
    }

    public V remove(K clave) {
        if (clave == null) return null;

        int indice = calcularHash(clave);
        NodoHash<K, V> actual = tabla[indice];
        NodoHash<K, V> anterior = null;

        while (actual != null) {
            if (actual.clave.equals(clave)) {
                if (anterior == null) {
                    tabla[indice] = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                tamaño--;
                return actual.valor;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return null;
    }

    public int size() { return tamaño; }
    public boolean isEmpty() { return tamaño == 0; }
}