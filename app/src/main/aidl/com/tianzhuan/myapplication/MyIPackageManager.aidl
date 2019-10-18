// MyIPackageManager.aidl
package com.tianzhuan.myapplication;
import android.content.pm.PackageInfo;

interface MyIPackageManager {
  PackageInfo getPackageInfo(String packageName, int flags, int userId);
}
