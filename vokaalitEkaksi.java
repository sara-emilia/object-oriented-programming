public static String vokaalitEkaksi(String s) {
    String str = "";
    String str2 = "";
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y') {
            str = str + s.charAt(i);
            continue;
        }
        else {
            str2 = str2 + s.charAt(i);
        }
    }
    str = str + str2;
    return str;
}