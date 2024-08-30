public class RemoveDublet {
    public static void removeDublicate(String str, int idx, StringBuilder newstr, boolean map[]) {
        char currchar = str.charAt(idx);
        if (idx == str.length() - 1) {
            System.out.println(newstr);
            return;
        } else {
            if (map[currchar - 'a'] == true) {
                removeDublicate(str, idx + 1, newstr, map);
            } else {
                map[currchar - 'a'] = true;
                removeDublicate(str, idx + 1, newstr.append(currchar), map);
            }
        }

    }

    public static void main(String arg[]) {
        String str = "induraniclassbtech";
        removeDublicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}