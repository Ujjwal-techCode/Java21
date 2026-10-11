import java.util.*;

public class SequencedCollectionDemo {

    public static void main(String[] args){
        SequencedCollection<String> strList = new ArrayList<>();
        strList.add("Ram");
        strList.add("Shyam");
        strList.addFirst("Dhanshyam");
        strList.addLast("Dhanshree");
        System.out.println(strList);
        System.out.println(strList.reversed());
        System.out.println(strList.reversed().removeFirst());

        SequencedSet<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.addFirst(50);
        integerSet.addLast(60);
        System.out.println(integerSet);
        System.out.println(integerSet.reversed());

        SequencedMap<String, String> sequencedMap = new LinkedHashMap<>();
        sequencedMap.put("Radha","Mohan");
        sequencedMap.put("Radhe","Shyam");
        sequencedMap.putFirst("Serjil","bhai");
        sequencedMap.putLast("dandu","bhai");
        System.out.println("1."+sequencedMap);
        System.out.println("2."+sequencedMap.reversed());
        System.out.println("3."+sequencedMap.pollFirstEntry());
        System.out.println("4."+sequencedMap.pollLastEntry());
        System.out.println("5."+sequencedMap);
        System.out.println("6."+sequencedMap.firstEntry());
        System.out.println("7."+sequencedMap.lastEntry());

        System.out.println("8."+sequencedMap.sequencedKeySet());
        System.out.println("9."+sequencedMap.sequencedValues());
        System.out.println("10."+sequencedMap.sequencedEntrySet());
    }
}
