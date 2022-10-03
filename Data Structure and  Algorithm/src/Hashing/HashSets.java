package Hashing;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static  void main(String[] args) {
        //In this program we will initialize an integer hashset with hashset method
//        HashSet<Integer> set = new HashSet<>();
//        int t=1000;
//
//        set.add(1);
//        set.add(2);
//        set.add(3);
////        System.out.println("Size of the set is : "+set.size());
//        set.add(4);
//
//        set.add(6);
//        set.add(7);
//        set.add(8);
//        set.add(9);
//        set.add(10);
//        set.add(11);
//        System.out.println(set);
//        System.out.println("Size of the set is : "+set.size());
//
//        set.remove(5);//in this set there is not available 5 of this object will not delete anything
//        set.remove(9);
//        System.out.println(set);
//        System.out.println("Size of the set is : "+set.size());
//
//        //contains method in the hashsets
//        set.add(5);
//        System.out.println();
////        if(set.contains(5)){
////            System.out.println("element is available in the hashset");
////        }else System.out.println("Element is  not available in the set");
//
////        itreator in hashset or loop in hashset
//        //how to apply loops in hashset\
//        HashSet<Integer> set1=new HashSet<>();
//        Iterator it= set.iterator(); //this have two main functions
//        //hasnNext and next methods
//        set1.add(4);
//        set1.add(5);
//        set1.add(6);
//        System.out.println(set1);
//        while (it.hasNext()){
//            System.out.print(it.next()+" "); //this function always return true value
//
//        }
//        System.out.println();
//        HashSet<Integer > copyset =new HashSet<>(set);//this will make a copy of the set named as copyset
//        System.out.println(copyset);
//        if(it.hasNext()){
//            System.out.println(it.next());
//
//        }

    HashSet<String> stringset=new HashSet<>();
        stringset.add("Welcome");
        stringset.add("To");
        stringset.add("Geeks");
        stringset.add("4");
        stringset.add("Geeks");
        System.out.println(stringset);
        System.out.println();
        Iterator it=stringset.iterator();
        System.out.println("Here itreator 'it' will itreate every element of the string set");
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        now we want to remove elements from the  string set
    // we will use set.remove() method
        stringset.remove("Geeks");
        System.out.println(stringset);
        //now we will check contain method
        if(stringset.contains("To")){
            System.out.println("available in the set");
        }
        else{
            System.out.println("Not available");
        }
        //we will calculate size of the set
        System.out.println(stringset.size());
    }
}
