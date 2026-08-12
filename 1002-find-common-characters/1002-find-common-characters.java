class Solution {
    public List<String> commonChars(String[] words) {

        int[] arr = new int[26];

        for (char ch : words[0].toCharArray()) {
            arr[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {

            int[] current = new int[26];

            for (char ch : words[i].toCharArray()) {
                current[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                arr[j] = Math.min(arr[j], current[j]);
            }
        }

        List<String> li = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (arr[i] > 0) {
                li.add(String.valueOf((char) (i + 'a')));
                arr[i]--;
            }
        }

        return li;
    }
}