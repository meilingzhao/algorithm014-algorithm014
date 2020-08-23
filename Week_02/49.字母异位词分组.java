/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            List<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                list.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end

