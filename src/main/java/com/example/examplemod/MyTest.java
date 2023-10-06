package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    static boolean say (char c) {
        System.out.println(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for (say('A'); say('B') && (i < 2); say('C')) {
            i++;
            say('D');
        }

    }
}


/*




1.B
2.D
3.A
4.D
5.B
6.C
7.B
8.D
9.
10.
11.D
12.AC
13.A
14.C
15.C
16.D
17.B
18.C
19.D
20.A
21.B
22.ABCD
23.
24.A
25.C
26.B
27.A
28.D
29.A
30.A
31.D
32.C
33.D
34.D
35.ABC
36.BC
37.D
38.C
39.D
40.B

在Springboot中加载顺序正确的是：
(1)project/config/application.yml
(2)project/src/main/resources/application.yml
(3)project/src/main/resources/config/application.yml
(4)project/application.yml

A: 4,3,2,1 B: 1,2,3,4 C:2,3,4,1 D: 3,4,1,2

 */
