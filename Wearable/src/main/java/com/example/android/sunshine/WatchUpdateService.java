package com.example.android.sunshine;

import android.util.Log;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Owner on 1/19/2017.
 */
public class WatchUpdateService extends WearableListenerService {

    @Override
    public void onDataChanged(DataEventBuffer dataEvents) {
        Log.v("akrkeco","watchupdate service in place");
        for (DataEvent dataEvent : dataEvents) {
            if (dataEvent.getType() == DataEvent.TYPE_CHANGED) {
                DataMap dataMap = DataMapItem.fromDataItem(dataEvent.getDataItem()).getDataMap();
              //  if(Constants.RUN_UPDATE_NOTIFICATION.equalsIgnoreCase(dataEvent.getDataItem().getUri().getPath())){

                Log.v("akrkeco","received data"+dataMap.get("weatherstate"));
              //  buildRunUpdateNotification(dataMap);
              //  }
            }
        }
    }
}