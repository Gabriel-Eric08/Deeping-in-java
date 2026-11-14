
import java.util.LinkedList;
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

}   
