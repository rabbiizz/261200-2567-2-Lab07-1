import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + args[2] + " " + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);

        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("ZZZ");
        hSet.add("123");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        System.out.println(sSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColors = new HashMap<String , Color>();
        favoriteColors.put("Robert",Color.BLACK);
        favoriteColors.put("Mark",Color.WHITE);
        favoriteColors.put("Pedro",Color.YELLOW);
        favoriteColors.put("Cole",Color.BLUE);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

        Map<String, Color> favoriteColorso = new TreeMap<String , Color>();
        favoriteColorso.put("Robert",Color.BLACK);
        favoriteColorso.put("Mark",Color.WHITE);
        favoriteColorso.put("Pedro",Color.YELLOW);
        favoriteColorso.put("Cole",Color.BLUE);

        Set<String> keySeto = favoriteColorso.keySet();
        for (String key : keySeto) {
            Color value = favoriteColorso.get(key);
            System.out.println(key + " : " + value);
        }
    }
}