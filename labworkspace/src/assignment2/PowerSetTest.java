package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSetTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(4);
        System.out.println(powerSet(list).toString());
    }

    public static <T> List<Set<T>> powerSet(List<T> X) {
        List<Set<T>> P = new ArrayList<Set<T>>();
        Set<T> S = new HashSet<T>();
        P.add(S);
        if(X.isEmpty()) {
            return P;
        }
        else {
            while(!X.isEmpty()) {
                T f = X.remove(0);
                List<Set<T>> temp = new ArrayList<Set<T>>();
                for(Set<T> x : P) {
                    temp.add(x);
                }
                for(Set<T> x : temp) {
                    S = new HashSet<T>();
                    S.add(f);
                    S.addAll(x);
                    P.add(S);
                }
            }
        }
        return P;
    }

}
