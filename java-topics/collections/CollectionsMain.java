
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsMain {

    static void main(String[] args) {

        System.out.println("Collections in Java");

        /*
         * LIST:
         *
         * ArrayList:
         * - Backed by a dynamic array.
         * - O(1) random access.
         * - O(1) amortized insertion at the end.
         * - O(n) insertion/removal at arbitrary positions.
         *
         * LinkedList:
         * - Backed by a doubly linked list.
         * - O(n) random access.
         * - O(1) insertion/removal at the beginning and end.
         * - O(n) insertion/removal at arbitrary positions
         *   when locating the position is necessary.
         */

        /*
         * LIST:
         *
         * ArrayList:
         * - Implementado utilizando um array dinâmico.
         * - Acesso por índice em O(1), ou seja, muito rápido.
         * - Inserção no final em O(1) amortizado.
         * - Inserção e remoção em posições intermediárias em O(n),
         *   pois pode ser necessário deslocar outros elementos.
         *
         * LinkedList:
         * - Implementado utilizando uma lista duplamente ligada.
         * - Acesso por índice em O(n), pois precisa percorrer os nós.
         * - Inserção e remoção no início e no final em O(1).
         * - Inserção e remoção em posições intermediárias em O(n),
         *   considerando o tempo necessário para localizar a posição.
         *
         * Quando utilizar:
         * - ArrayList: quando precisar acessar elementos por índice
         *   frequentemente. É a escolha padrão para a maioria das listas.
         * - LinkedList: quando precisar realizar operações frequentes
         *   nas extremidades da lista, como em filas e deques.
         */

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        ListTypes listTypes = new ListTypes(arrayList, linkedList);

        System.out.println("Testing ArrayList performance:");
        listTypes.performanceTestAddingElements(arrayList);
        listTypes.performanceTestAccessingElements(arrayList);
        listTypes.performanceTestRemovingElements(arrayList);

        System.out.println("Testing LinkedList performance:");
        listTypes.performanceTestAddingElements(linkedList);
        listTypes.performanceTestAccessingElements(linkedList);
        listTypes.performanceTestRemovingElements(linkedList);


        /*
         * SET:
         *
         * HashSet:
         * - Uses hashing.
         * - O(1) average insertion, removal and lookup.
         * - Does not guarantee iteration order.
         *
         * LinkedHashSet:
         * - Maintains insertion order.
         * - O(1) average insertion, removal and lookup.
         *
         * TreeSet:
         * - Uses a Red-Black Tree.
         * - Maintains sorted elements.
         * - O(log n) insertion, removal and lookup.
         */

        /*
         * SET:
         *
         * HashSet:
         * - Utiliza hashing para armazenar e localizar elementos.
         * - Inserção, remoção e busca em O(1) médio.
         * - Não garante uma ordem específica durante a iteração.
         *
         * LinkedHashSet:
         * - Também utiliza hashing.
         * - Preserva a ordem em que os elementos foram inseridos.
         * - Inserção, remoção e busca em O(1) médio.
         *
         * TreeSet:
         * - Utiliza uma árvore Red-Black.
         * - Mantém os elementos automaticamente ordenados.
         * - Inserção, remoção e busca em O(log n).
         *
         * Quando utilizar:
         * - HashSet: quando precisar eliminar duplicatas e não precisar
         *   preservar a ordem dos elementos.
         * - LinkedHashSet: quando precisar eliminar duplicatas,
         *   mas preservar a ordem de inserção.
         * - TreeSet: quando precisar de elementos únicos e ordenados.
         */

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        /*
         * MAP:
         *
         * HashMap:
         * - Uses hashing.
         * - O(1) average insertion, removal and lookup.
         * - Does not guarantee iteration order.
         *
         * LinkedHashMap:
         * - Maintains insertion order.
         * - O(1) average insertion, removal and lookup.
         *
         * TreeMap:
         * - Uses a Red-Black Tree.
         * - Maintains sorted keys.
         * - O(log n) insertion, removal and lookup.
         */

        /*
         * MAP:
         *
         * HashMap:
         * - Utiliza hashing para armazenar e localizar pares de chave e valor.
         * - Inserção, remoção e busca em O(1) médio.
         * - Não garante uma ordem específica durante a iteração.
         *
         * LinkedHashMap:
         * - Utiliza hashing e mantém ligações entre as entradas.
         * - Preserva a ordem de inserção por padrão.
         * - Inserção, remoção e busca em O(1) médio.
         *
         * TreeMap:
         * - Utiliza uma árvore Red-Black.
         * - Mantém as chaves automaticamente ordenadas.
         * - Inserção, remoção e busca em O(log n).
         *
         * Quando utilizar:
         * - HashMap: quando precisar relacionar uma chave a um valor
         *   e buscar esse valor rapidamente.
         * - LinkedHashMap: quando precisar buscar valores por chave
         *   preservando a ordem de inserção.
         * - TreeMap: quando precisar buscar valores por chave
         *   mantendo as chaves ordenadas.
         */

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        MapTypes mapTypes = new MapTypes(hashMap, linkedHashMap);

        System.out.println("Testing HashMap performance:");
        mapTypes.performanceTestAddingElements(hashMap);
        mapTypes.performanceTestAccessingElements(hashMap);
        mapTypes.performanceTestRemovingElements(hashMap);

        System.out.println("Testing LinkedHashMap performance:");
        mapTypes.performanceTestAddingElements(linkedHashMap);
        mapTypes.performanceTestAccessingElements(linkedHashMap);
        mapTypes.performanceTestRemovingElements(linkedHashMap);

        System.out.println("Testing TreeMap performance:");
        mapTypes.performanceTestAddingElements(treeMap);
        mapTypes.performanceTestAccessingElements(treeMap);
        mapTypes.performanceTestRemovingElements(treeMap);
    }
}
