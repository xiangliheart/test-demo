package com.xiangliheart.utils.test;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class ApacheCommonsBeanutilsTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //ObjectSource objectSource = new ObjectSource("objectSource-param1","objectSource-param2","objectSource-param3","objectSource-param4");
        ObjectSource objectSource = new ObjectSource(new ObjectParamA("objectParam"),"objectSource-param1","objectSource-param2","objectSource-param3","objectSource-param4");
        ObjectTarget objectTarget = new ObjectTarget("objectTarget-param1","objectTarget-param2","objectTarget-param3","objectTarget-param5");
        System.out.println("before copyProperties objectSource: "+objectSource.toString());
        System.out.println("before copyProperties objectSource: "+objectTarget.toString());

        BeanUtils.copyProperties(objectSource,objectTarget);

        System.out.println("after copyProperties objectSource: "+objectSource.toString());
        System.out.println("after copyProperties objectSource: "+objectTarget.toString());
    }
}
