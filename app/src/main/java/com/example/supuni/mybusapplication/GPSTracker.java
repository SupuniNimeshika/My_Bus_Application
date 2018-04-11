package com.example.supuni.mybusapplication;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by supuni on 4/11/18.
 */

public class GPSTracker extends Service implements LocationListener{

    private final Context mContext;

    boolean isGPSEnabled =false;

    boolean isNetworkEnabled =false;

    boolean canGetLocation =false;

    Location location;
    double latitude;
    double longitude;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
