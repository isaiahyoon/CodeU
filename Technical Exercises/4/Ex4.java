class Ex5 {

    public static String didYouMean(String str) {
        for (int i = 0; i < str.length(); i++) {
            first = dictionary.get(str.substring(0, i));
            if (first) {
                return first + " " + str.substring(i+1);
            }
        }
        return str;
    }
}