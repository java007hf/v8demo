package com.xsoft.v8;

import android.util.Log;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

public class V8Core {
    private V8 mRuntime;

    private V8 getRuntime() {
        mRuntime = V8.createV8Runtime();
        return mRuntime;
    }

    public void run(String js) {
        mRuntime.executeScript(js);
    }

    public void clean(BaseV8Object v8Object) {
        v8Object.clean();
        mRuntime.release();
    }

    public static class Builder {
        public Builder() {

        }
    }
}
