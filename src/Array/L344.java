package Array;

import java.util.Stack;

class L344 {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        char tmp;
        while (l < r) {
            tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }

    public void reverseString2(char[] s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length; i++)
            st.push(s[i]);
        for (int i = 0; i < s.length; i++)
            s[i] = st.pop();
    }
}
