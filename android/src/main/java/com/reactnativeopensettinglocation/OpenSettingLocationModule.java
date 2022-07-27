package com.reactnativeopensettinglocation;

import android.content.Intent;
import android.provider.Settings;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = OpenSettingLocationModule.NAME)
public class OpenSettingLocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "OpenSettingLocation";

    public OpenSettingLocationModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void multiply(int a, int b, Promise promise) {
        promise.resolve(a * b);
    }

    @ReactMethod
    public void openSetting() {
      final String locationService = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
      final Intent intent = new Intent(locationService);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      getReactApplicationContext().startActivity(intent);
    }

    public static native int nativeMultiply(int a, int b);
}
