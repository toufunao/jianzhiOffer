package daily;

import java.util.*;

public class TopKFrequent_692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for (String str:words) {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> ans=new ArrayList<>();
        for (Map.Entry<String,Integer> entry:map.entrySet()) {
            ans.add(entry.getKey());
        }
        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o1)==map.get(o2))
                    return o1.compareTo(o2);
                else
                    return map.get(o2)-map.get(o1);
            }
        });

        return ans.subList(0,k);
    }
}
