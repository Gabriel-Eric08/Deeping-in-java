
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fundamentals {

    public LinkedList<Integer> removingDuplicates(LinkedList<Integer> list) {
        // TODO: Implement the logic to remove duplicates from the linked list
        if (list == null || list.isEmpty()) {
            return list;
        }
        LinkedList<Integer> uniqueList = list.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
        return uniqueList;
    }

    public Map<Integer, Long> getFrequenceList(List<Integer> list) {
        // TODO: Implement the logic to get the frequency of each element in the list
        if (list == null || list.isEmpty()) {
            return new HashMap<>();
        }
        Map<Integer, Long> frequencyList;
        frequencyList = list.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
        return frequencyList;
    }   
}
