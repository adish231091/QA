package com.oudp.platform;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.LinkedHashMap;

public class test {

    public static void main(String args[])
    {
        // In jsobobject or jsonarray - keys always as string Or value can be other string - int/float/boolean/string/decimal
        //maptype etc...
        String jsonString = "{ \"apple\": 1, \"banana\": 2, \"cherry\": 3 }";
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject.toString());
//        System.out.println(jsonObject.getInt("apple"));
//
//
//        JSONArray jsonArray = new JSONArray();
//        for(String key: jsonObject.keySet())
//        {
//            JSONObject jsonObject1 = new JSONObject();
//            jsonObject1.put(key,jsonObject.getInt(key));
//            jsonArray.put(jsonObject1);
//        }
//
//        System.out.println(jsonArray.toString());

        // 2nd approach


        JSONArray j2 = new JSONArray();
        for(String key: jsonObject.keySet())
        {
            LinkedHashMap<String,Integer> l1 = new LinkedHashMap<String,Integer>();
            l1.put(key,jsonObject.getInt(key));
            System.out.println("map content - "+l1);
            j2.put(l1.toString());

        }
        System.out.println(j2.toString());

    }
}
