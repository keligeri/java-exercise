package com.kelemengergo.javaexercise.Josephus_permutation;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by keli on 2017.08.09..
 */
public class JosephusSurvivor {

    private int n;
    private int k;

    public JosephusSurvivor(int n, int k){
        this.n = n;
        this.k = k;
    }

    private int execute(){
        List<Integer> list = generateList();
        CircularIterator<Integer> circularIterator = new CircularIterator(list);

        int counter = 0;
        while (circularIterator.hasNext()){
            if (counter % k == 0 && counter != 0) circularIterator.remove();
            counter++;
            circularIterator.next();
        }

        return list.get(0);
    }

    private List<Integer> generateList(){
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        JosephusSurvivor demo = new JosephusSurvivor(100, 3);
        System.out.println(demo.execute());
    }

}
