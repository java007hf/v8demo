package com.xsoft.v8;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;

public abstract class BaseV8Object {
    protected V8 mRuntime;
    protected V8Object mObject;

    public V8Object getObject() {
        return mObject;
    }

    public abstract void clean();

    public BaseV8Object(V8 v8Runtime) {
        mRuntime = v8Runtime;
        initV8Object();
    }

    protected abstract void initV8Object();
}
