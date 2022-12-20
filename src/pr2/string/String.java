package pr2.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String[] strings = { "QWERetrew", "fgregsgr", "jgviuggv"};
        List list = Arrays.asList(strings);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
