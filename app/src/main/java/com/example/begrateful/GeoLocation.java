package com.example.begrateful;

import android.content.Context;
import android.icu.util.ULocale;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Handler;

public class GeoLocation {
    public static void getAdress(String locationAddress, Context context, Handler handler)
    {
        Thread thread=new Thread(){
            @Override
            public void run() {
                Geocoder geocoder=new Geocoder(context, Locale.getDefault());
                String result=null;
                try {
                    List addresslist=geocoder.getFromLocationName(locationAddress,1);
                    if(addresslist!=null && addresslist.size()>0)
                    {
                        Address address=(Address)addresslist.get(0);
                        StringBuilder stringBuilder=new StringBuilder();
                        address.getLongitude();
                        address.getLatitude();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
