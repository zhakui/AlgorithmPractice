package com.zhkui.kmp;

public class General {

    public static void main(String[] args){
        String txt = "ABCDABCABCDEABCEABDE";
        String pat = "ABCDE";
        int a = search(pat, txt);
        if (a == txt.length()){
            System.out.println("Not Found!");
        }else{
            System.out.println("Found: " + a);
        }
    }

    public static int search(String pat, String txt){
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M; i++){
            int j;
            for (j = 0; j < M; j++){
                if (txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if (j == M) return i;//Found
        }
        return N;//Not Found
    }

}
