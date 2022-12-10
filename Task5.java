public class Task5 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (s == null || s.length() == 0)
            System.out.println("Палиндром!");
        int low = 0, high = s.length() - 1;
        s = s.toLowerCase();
        while (low <= high) {
            while (low <= high && !Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }
            while (low <= high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
            if (low > high)
                break;
            if (s.charAt(low) != s.charAt(high))
            System.out.println("Не Палиндром!");
            else {
                high--;
                low++;
            }
        }
        System.out.println("Палиндром!");
    }
}