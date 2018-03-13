package com.firebase.interviewsmallcodestuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

           String string = "6,1,2,4,3,2,5";
           String[] numbers = string.split("\\D+");

           // First convert StringArray To List
           // Convert to Set
           // Convert Set to String Array (Here You will get Distinct Value Now)

           Set<String> temp = new LinkedHashSet<String>(Arrays.asList(numbers));
           String[] result = temp.toArray( new String[temp.size()] );

           Arrays.sort(result, new Comparator<String>()
            {
                public int compare(String s1, String s2)
                {
                    return Integer.valueOf(s2).compareTo(Integer.valueOf(s1));
                }
            });

            System.out.println("String:::" + TextUtils.join(", ", result));


            List<Integer> list = Arrays.asList( 1, 2, 5, 9, 3, 6, 4, 7, 8);
            Collections.sort(list , Collections.reverseOrder()); //sorting collection
            System.out.println("List in Java sorted in ascending order: " + list);

              /*  String s = Arrays.toString(result);
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();*/;

    }
}
