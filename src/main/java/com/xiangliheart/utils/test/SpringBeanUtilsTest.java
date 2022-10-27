package com.xiangliheart.utils.test;

import org.springframework.beans.BeanUtils;

public class SpringBeanUtilsTest {
    public static void main(String[] args){
        ObjectSource objectSource = new ObjectSource(new ObjectParamA("objectParam"),"objectSource-param1","objectSource-param2","objectSource-param3","objectSource-param4");
        ObjectTarget objectTarget = new ObjectTarget("objectTarget-param1","objectTarget-param2","objectTarget-param3","objectTarget-param5");
        System.out.println("before copyProperties objectSource: "+objectSource.toString());
        System.out.println("before copyProperties objectSource: "+objectTarget.toString());

        BeanUtils.copyProperties(objectTarget,objectSource);

        System.out.println("after copyProperties objectSource: "+objectSource.toString());
        System.out.println("after copyProperties objectSource: "+objectTarget.toString());
    }
}
