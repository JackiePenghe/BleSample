package com.sscl.blelibrary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sscl.blelibrary.interfaces.OnLargeDataWriteWithNotificationSendStateChangedListener;

import java.util.Arrays;

/**
 * default callback that write large data and require remote devices to notify collaboration
 *
 * @author jackie
 */
final class DefaultLargeDataWriteWithNotificationSendStateChangedListener implements OnLargeDataWriteWithNotificationSendStateChangedListener {

    /*-----------------------------------static constant-----------------------------------*/

    private static final String TAG = DefaultLargeDataWriteWithNotificationSendStateChangedListener.class.getSimpleName();

    /*-----------------------------------implementation method-----------------------------------*/

    @Override
    public void onDataSendStart() {
        DebugUtil.warnOut(TAG, "onDataSendStart");
    }

    @Override
    public boolean onReceiveNotification(byte[] currentPackageData, int currentPackageIndex, int packageCount, @Nullable byte[] values) {
        if (values != null) {
            DebugUtil.warnOut(TAG, "onReceiveNotification values = " + Arrays.toString(values));
        } else {
            DebugUtil.warnOut(TAG, "onReceiveNotification values = null");
        }
        return true;
    }

    @Override
    public void onDataSendFinished() {
        DebugUtil.warnOut(TAG, "onDataSendFinished");
    }

    @Override
    public void onStartFailed() {
        DebugUtil.warnOut(TAG, "onStartFailed");
    }

    @Override
    public void onDataSendFailed(int currentPackageIndex, int pageCount, @NonNull byte[] data) {
        DebugUtil.warnOut(TAG, "onDataSendFailed currentPackageIndex = " + currentPackageIndex + ",pageCount = " + pageCount + "\ndata = " + Arrays.toString(data));
    }

    @Override
    public void onDataSendFailedAndRetry(int currentPackageIndex, int pageCount, @NonNull byte[] data, int tryCount) {
        DebugUtil.warnOut(TAG, "onDataSendFailedAndRetry currentPackageIndex = " + currentPackageIndex + ",pageCount = " + pageCount + ",tryCount = " + tryCount + "\ndata = " + Arrays.toString(data));
    }

    @Override
    public void onDataSendProgressChanged(int currentPackageIndex, int pageCount, @NonNull byte[] data) {
        DebugUtil.warnOut(TAG, "onDataSendProgressChanged currentPackageIndex = " + currentPackageIndex + ",pageCount = " + pageCount + "\ndata = " + Arrays.toString(data));
    }

    @Override
    public void onSendFailedWithWrongNotifyData() {
        DebugUtil.warnOut(TAG, "onSendFailedWithWrongNotifyData");
    }

    @Override
    public void onSendFailedWithWrongNotifyDataAndRetry(int tryCount, int currentPackageIndex, int packageCount, @Nullable byte[] data) {
        DebugUtil.warnOut(TAG, "onSendFailedWithWrongNotifyDataAndRetry：tryCount = " + tryCount + ",currentPackageIndex = " + currentPackageIndex + ",packageCount = " + packageCount + "\ndata = " + (data != null ? Arrays.toString(data) : null));
    }

    @Override
    public void onDataSendTimeOut(int currentPackageIndex, int packageCount, @NonNull byte[] data) {
        DebugUtil.warnOut(TAG, "onSendFailedWithWrongNotifyDataAndRetry：currentPackageIndex = " + currentPackageIndex + ",packageCount = " + packageCount + "\ndata = " + Arrays.toString(data));
    }

    @Override
    public void onDataSendTimeOutAndRetry(@NonNull byte[] data, int tryCount, int currentPackageIndex, int packageCount) {
        DebugUtil.warnOut(TAG, "onDataSendTimeOutAndRetry：tryCount = " + tryCount + ",currentPackageIndex = " + currentPackageIndex + ",packageCount = " + packageCount + "\ndata = " + Arrays.toString(data));
    }
}
