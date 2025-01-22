package Array;

public class L414 {
    public int thirdMax(int[] nums) {
        Integer third = null;
        Integer second = null;
        Integer first = null;

        for (Integer num : nums) {
            if (num.equals(third) || num.equals(second) || num.equals(first)) continue;
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third)
                third = num;
        }
        return third == null ? first : third;
    }
}
