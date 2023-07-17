package com.example.noteapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Xử lý khi báo thức được kích hoạt, ví dụ: hiển thị thông báo
        Utility.showToast(context, "Alarm triggered!");
    }
}

