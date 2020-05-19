package com.sun.utils.data;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

/**
 * @ClassName DbRouteDataSource
 * @Description TODO
 * Author sunhong
 * Date 2020-4-5 17:53
 **/

public class DbRouteDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return RouteHolder.getRouteKey();
    }
}
