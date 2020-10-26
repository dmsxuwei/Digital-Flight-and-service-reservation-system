package com.uow.util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

//此Map缓存针对处理排行榜数据接口
public class timeMapUtil {
protected Logger log=Logger.getLogger(getClass().getName());
private static Map<Integer,String> cacheMap=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> daymap=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> weekmap=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> monthmap=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> floorday=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> floorweek=new ConcurrentHashMap<Integer,String>();
private static Map<Integer,String> floormonth=new ConcurrentHashMap<Integer,String>();
public static void destoryCacheMap(){
    cacheMap=null;
}
public static Map<Integer,String> getCacheMap() {
      return cacheMap;
     }

     public static void set(int key, String values) {
      cacheMap.put(key, values);
     }

     public static String get(int key) {
      return cacheMap.get(key);
     }

     public static String getString(int key) {
      return  (String) cacheMap.get(key);
     }

     public static Object getToEmpty(int key) {
      Object o = cacheMap.get(key);
      if (o == null)
       return "";
      else
       return o;
     }

     public static void remove(int key) {
      cacheMap.remove(key);
     }

     public static void clear() {
      cacheMap.clear();
     } 
     //今日
     public static String getday(int key) {
          return  (String) daymap.get(key);
         }
     public static void setday(int key, String values) {
         daymap.put(key, values);
         }
     //本周
     public static String getweek(int key) {
          return  (String) weekmap.get(key);
         }
     public static void setweek(int key, String values) {
         weekmap.put(key, values);
         }
     //本月
     public static String getmonth(int key) {
          return  (String) monthmap.get(key);
         }
     public static void setmonth(int key, String values) {
         monthmap.put(key, values);
         }
     //昨日
     public static String getfloorday(int key) {
          return  (String) floorday.get(key);
         }
     public static void setfloorday(int key, String values) {
         floorday.put(key, values);
         }
     //上周
     public static String getfloorweek(int key) {
          return  (String) floorweek.get(key);
         }
     public static void setfloorweek(int key, String values) {
         floorweek.put(key, values);
         }
     //上月
     public static String getfloormonth(int key) {
          return  (String) floormonth.get(key);
         }
     public static void setfloormonth(int key, String values) {
         floormonth.put(key, values);
         }
}