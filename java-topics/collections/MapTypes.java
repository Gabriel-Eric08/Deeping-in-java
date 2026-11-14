
import java.util.Map;

public class MapTypes {
    Map<String, String> hashMapTest;
    Map<String, String> treeMapTest;

    public MapTypes(Map<String, String> hashMapTest, Map<String, String> treeMapTest) {
        this.hashMapTest = hashMapTest;
        this.treeMapTest = treeMapTest;
    }

    public void setHashMapTest(Map<String, String> hashMapTest) {
        this.hashMapTest = hashMapTest;
    }

    public Map<String, String> getHashMapTest() {
        return hashMapTest;
    }

    public void setTreeMapTest(Map<String, String> treeMapTest) {
        this.treeMapTest = treeMapTest;
    }

    public Map<String, String> getTreeMapTest() {
        return treeMapTest;
    }

    public void performanceTestAddingElements(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            map.put("Key " + i, "Value " + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to add elements: " + duration + " milliseconds");
    }

    public void performanceTestAccessingElements(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            map.get("Key " + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to access elements: " + duration + " milliseconds");
    }

    public void performanceTestRemovingElements(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            map.remove("Key " + i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time taken to remove elements: " + duration + " milliseconds");
    }
}
