public class IsomorphicStrings {
    public static boolean checkIsomorphic(String s, String t) {
        int[] index1 = new int[200];
        int[] index2 = new int[200];
        
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (index1[s.charAt(i)] != index2[t.charAt(i)])
                return false;
            index1[s.charAt(i)] = i + 1;
            index2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(checkIsomorphic(s, t));
    }
}