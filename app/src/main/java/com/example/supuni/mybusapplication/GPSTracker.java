package com.example.supuni.mybusapplication;

import android.app.LoaderManager;
import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
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

    private static final long MIN_DISTANCE_FOR_UPDATES =10;
    private static final long MIN_TIME_BW_UPDATES =1000 * 60 * 1;
    protected LocationManager locationManager;

    public GPSTracker (Context context){
        this.mContext =context;
        getLocation();
    }

    public void getLocation(){
        try {
            locationManager =(LocationManager) mContext.getSystemService(LOCATION_SERVICE);

            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if(!isGPSEnabled && !isNetworkEnabled){

            }
            else {
                this.canGetLocation=true;

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

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
