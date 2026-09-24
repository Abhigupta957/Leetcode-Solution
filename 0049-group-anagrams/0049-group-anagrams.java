class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a Hashmap
       HashMap<String, List<String>> map = new HashMap<>();

        // length of string
        int n =strs.length;
        for(int i=0; i<n; i++){
            // sortd String
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr);
            // Adding map
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
