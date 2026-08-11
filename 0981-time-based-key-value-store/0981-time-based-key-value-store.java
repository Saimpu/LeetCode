class TimeMap {

    class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        List<Pair> li = map.get(key);

        int left = 0;
        int right = li.size() - 1;

        String ans = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (li.get(mid).timestamp <= timestamp) {
                ans = li.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}