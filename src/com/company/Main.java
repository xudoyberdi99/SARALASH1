package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //1-misol
        misol1();
        //2-misol
        System.out.println(misol2(5));
        //3-misol
        System.out.println(misol3("kelejak"));
    }
    //1-misol
    public static void misol1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] mat = new char[7][];

        for (int i = 0; i < 7; i++)
            mat[i] = bufferedReader.readLine().trim().toCharArray();

        int row = 0, col = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (mat[i][j] == '1'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        bufferedWriter.write(String.valueOf(Math.abs(3 - row) + Math.abs(3 - col)));
        bufferedReader.close();
        bufferedWriter.close();
    }
    //2-misol
    public static int misol2(int n){
        if (n>4){
            return 1;
        }else {
            return 0;
        }
    }
    //3-misol
    public static String misol3(String str){
        StringBuilder str1= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            str1.append((char) (int) (Math.random() * 26+97));
        }
        return str1.toString();
    }
}
