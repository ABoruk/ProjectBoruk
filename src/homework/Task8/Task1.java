package homework.Task8;

public class Task1 {

    public static String twoValues(String firstValue, String secondValue) {
        int index = firstValue.indexOf(secondValue);
        if (firstValue.endsWith(secondValue)) {

            return firstValue.substring(0, index);

        } else {
            int endIndex = firstValue.length() - secondValue.length();
            return firstValue.substring(0, endIndex).toUpperCase();
        }
    }

}



