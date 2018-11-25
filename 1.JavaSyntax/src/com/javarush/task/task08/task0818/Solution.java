package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("First", 500);
        map.put("Second", 100);
        map.put("Fhird", 200);
        map.put("Fourth", 600);
        map.put("Fifth", 300);
        map.put("Sixth", 400);
        map.put("Seven", 500);
        map.put("Eighth", 700);
        map.put("Nineth", 800);
        map.put("Tenth", 900);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Integer> entry = iter.next();
            if(entry.getValue()<500){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}