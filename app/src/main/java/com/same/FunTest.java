package com.same;

/**
 * Created by shake on 17-3-16.
 * 接口的实现
 */
public class FunTest implements IFun {
    @Override
    public String func() {
        return "通过接口调用到的";
    }
}
