package com.sscl.blesample;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.sscl.baselibrary.files.FileUtil;
import com.sscl.baselibrary.utils.DebugUtil;
import com.sscl.baselibrary.utils.ToastUtil;
import com.sscl.blelibrary.BleManager;


/**
 * @author jacke
 * @date 2017/12/11 0011
 * <p>
 * 应用程序
 */

public class MyApplication extends Application {

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
        //打开debug信息开关
        DebugUtil.setDebugFlag(true);
        com.sscl.blelibrary.DebugUtil.setDebugFlag(true);
        ToastUtil.setToastReuse(true);
        //初始化文件工具类
        FileUtil.init(this.getApplicationContext());
        BleManager.init(MyApplication.this);
    }

    /**
     * Set the base context for this ContextWrapper.  All calls will then be
     * delegated to the base context.  Throws
     * IllegalStateException if a base context has already been set.
     *
     * @param base The new base context for this wrapper.
     */
    @Override
    protected void attachBaseContext(Context base) {
        MultiDex.install(this);
        super.attachBaseContext(base);
    }
}
