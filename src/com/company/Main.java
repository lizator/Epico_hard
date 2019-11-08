package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int P = input.nextInt();
        ArrayList<Integer> opg = new ArrayList<Integer>();
        for (int i = 0; i < N; i++){
            opg.add(input.nextInt());
        }
        Collections.sort(opg);
        int res = 0;
        while (D > 0){
            if ((D -= opg.get(0)) >= 0){
                opg.remove(0);
                res += P;
            }
        }
        System.out.println(res);
    }
}
