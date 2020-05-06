/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */



package edu.quinnipiac.ser210.basiconlineandroid;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetNearbyPlaces extends AsyncTask<Object, String, String> {

    private String googlePlaceData, url;
    private GoogleMap mMap;

    //Sets up data API returns for map
    @Override
    protected String doInBackground(Object... objects) {
        mMap = (GoogleMap)objects[0];
        url = (String)objects[1];

        DownloadUrl downloadUrl = new DownloadUrl();
        try {
            googlePlaceData = downloadUrl.readUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.i("doInBackground", googlePlaceData);
        return googlePlaceData;
    }

    //Collects info on any results returned from searching for nearby libraries
    @Override
    protected void onPostExecute(String string) {
        List<HashMap<String, String>> nearbyPlacesList = null;
        DataParser dataParser = new DataParser();
        nearbyPlacesList = dataParser.parse(string);
        DisplayNearbyPlaces(nearbyPlacesList);
    }

    //Creates the markers for any nearby libraries
    private void DisplayNearbyPlaces(List<HashMap<String,String>> nearbyPlacesList){
        Log.i("GetNearbyPlaces", "Starting DisplayNearbyPlaces");
        Log.i("GetNearbyPlaces", "nearbyPlacesList length: "+nearbyPlacesList.size());
        for(int i = 0; i<nearbyPlacesList.size();i++){
            Log.i("GetNearbyPlaces", "Inside for loop of DisplayNearbyPlaces");
            HashMap<String, String> googleNearbyPlace = nearbyPlacesList.get(i);
            String placeName = googleNearbyPlace.get("place_name");
           String vicinity = googleNearbyPlace.get("vicinity");
            double lat = Double.parseDouble(googleNearbyPlace.get("lat"));
            double lng = Double.parseDouble(googleNearbyPlace.get("lng"));

            LatLng latLng = new LatLng(lat, lng);
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            markerOptions.title(placeName+" : "+vicinity); //Doesn't like this line
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
            mMap.addMarker(markerOptions);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(10));

        }
    }
}
