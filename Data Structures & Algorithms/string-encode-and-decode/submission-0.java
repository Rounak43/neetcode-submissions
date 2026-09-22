class Solution {
public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the delimiter
            int j = str.indexOf('#', i);

            // Get the length of the original string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String word = str.substring(j + 1, j + 1 + len);

            list.add(word);

            // Move to the beginning of the next encoded string
            i = j + 1 + len;
        }

        return list;
    }
}
