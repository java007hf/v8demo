package com.xsoft.v8;

import com.eclipsesource.v8.JavaCallback;

public abstract class BaseJavaMethod {
    public abstract JavaCallback getJavaCallback();
    public abstract String getJsFuncName();
}
