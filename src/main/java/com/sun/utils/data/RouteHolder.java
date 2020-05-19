package com.sun.utils.data;

/**
 * @ClassName RouteHolder
 * @Description TODO
 * Author sunhong
 * Date 2020-4-5 18:06
 **/
public class RouteHolder {


    private static ThreadLocal<String> routeKey = new ThreadLocal<String>();

    public static String getRouteKey(){
        return routeKey.get();
    }

    public static void setRouteKey(String key){
        routeKey.set(key);
    }

    public static void removeRouteKey(){
        routeKey.remove();
    }
}
