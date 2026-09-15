class Solution {

    public String encode(List<String> strs) {
        String res = ""; // final encoded string
        for (String str : strs) {
            for (char c : str.toCharArray()) {
                int ascii_value = c;
                res += 's';
                res += ascii_value;
                res += 'e';
            }
            res += 'n';
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String finalString = "";
            while (str.charAt(i) != 'n') {
                if (str.charAt(i) == 's') {
                    String s = "";
                    while (str.charAt(i) != 'e') {
                        if(str.charAt(i)!='s'){
                             s += str.charAt(i);
                        }
                        i++;
                    }
                    char ch = (char) Integer.parseInt(s);
                    finalString += ch;
                    i++;
                }
            }
            list.add(finalString);
        }
        return list;
    }
}