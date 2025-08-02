import java.util.*;

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        
        for (int x : basket1) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (int x : basket2) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int key : freq.keySet()) {
            if (freq.get(key) % 2 != 0) return -1;
        }

        List<Integer> extra1 = new ArrayList<>();
        List<Integer> extra2 = new ArrayList<>();

        for (int key : freq.keySet()) {
            int total = freq.get(key);
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            if (count1 > total / 2) {
                for (int i = 0; i < count1 - total / 2; i++)
                    extra1.add(key);
            } else if (count2 > total / 2) {
                for (int i = 0; i < count2 - total / 2; i++)
                    extra2.add(key);
            }
        }

        Collections.sort(extra1); // ascending
        Collections.sort(extra2, Collections.reverseOrder()); // descending

        int minFruit = freq.firstKey(); // smallest fruit
        long cost = 0;
        for (int i = 0; i < extra1.size(); i++) {
            int a = extra1.get(i);
            int b = extra2.get(i);
            cost += Math.min(Math.min(a, b), 2 * minFruit);
        }

        return cost;
    }
}
