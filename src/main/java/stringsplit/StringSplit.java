package stringsplit;

public class StringSplit {
    public static String[] solution(final String s) {
        if (s.isEmpty()) {
            return new String[0];
        }
        String evenLengthString = s;
        if (hasOddLength(s)) {
            evenLengthString = evenLengthString + "_";
        }
        int numberOfArrayElements = evenLengthString.length() / 2;
        String[] resultingCharacterPairs = new String[numberOfArrayElements];
        for (int i = 0; i < numberOfArrayElements; i++) {
            resultingCharacterPairs[i] = evenLengthString.substring(i * 2, i * 2 + 2);
        }
        return resultingCharacterPairs;
    }

    private static boolean hasOddLength(String s) {
        return s.length() % 2 == 1;
    }
}