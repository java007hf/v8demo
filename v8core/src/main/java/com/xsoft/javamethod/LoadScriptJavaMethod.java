package com.xsoft.javamethod;

import com.eclipsesource.v8.JavaCallback;
import com.xsoft.v8.BaseJavaMethod;

public class LoadScriptJavaMethod extends BaseJavaMethod {

    @Override
    public JavaCallback getJavaCallback() {
        return null;
    }

    @Override
    public String getJsFuncName() {
        return "loadscript";
    }


}
