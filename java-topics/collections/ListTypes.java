import java.util.List;

public class ListTypes {

    List<String> arrayListTest;
    List<String> linkedListTest;


    public ListTypes(List<String> arrayListTest, List<String> linkedListTest) {
        this.arrayListTest = arrayListTest;
        this.linkedListTest = linkedListTest;
    }

    public void setArrayListTest(List<String> arrayListTest) {
        this.arrayListTest = arrayListTest;
    }

    public List<String> getArrayListTest() {
        return arrayListTest;
    }

    public void setLinkedListTest(List<String> linkedListTest) {
        this.linkedListTest = linkedListTest;
    }

    public List<String> getLinkedListTest() {
        return linkedListTest;
    }

    public void performanceTestAddingElements(List<String> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("Test " + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to add elements: " + duration + " milliseconds");
    }

    public void performanceTestRemovingElements(List<String> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove("Test " + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to remove elements: " + duration + " milliseconds");
    }

    public void performanceTestAccessingElements(List<String> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to access elements: " + duration + " milliseconds");
    }
}