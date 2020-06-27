package com.sun.service.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProDao
 * @Description TODO
 * Author sunhong
 * Date 2020-6-27 18:44
 **/

@Service
@Scope("prototype")
public class ProService {

    public void method(){
        System.out.println(this.hashCode());
    }

}
