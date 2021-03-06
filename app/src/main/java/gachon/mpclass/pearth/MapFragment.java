package gachon.mpclass.pearth;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;



//public class MapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
public class MapFragment extends Fragment implements OnMapReadyCallback {
    View rootView;
    MapView mapView;

    public MapFragment() {
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_map, container, false);
        mapView = (MapView) rootView.findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(this);

        return rootView;
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(this.getActivity());

        // Updates the location and zoom of the MapView
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(37.502431, 127.111466), 14);

        googleMap.animateCamera(cameraUpdate);




        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.45816, 127.126547))
                .title("??????????????????").snippet("?????? ?????? ?????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.464159, 127.140789))
                .title("?????????").snippet("?????? ?????? ?????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.49344, 127.12277))
                .title("???????????????").snippet("?????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.50872, 127.08157))
                .title("?????????").snippet("?????? ?????? ????????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.50129, 127.10353))
                .title("????????????").snippet("??????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.50817, 127.1069))
                .title("???????????????").snippet("?????? ????????? ????????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.51308, 127.09642))
                .title("????????????").snippet("?????? ????????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.49582, 127.12215))
                .title("????????????").snippet("????????? ??????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.52199, 127.04464))
                .title("????????????").snippet("?????? ?????? ????????????"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.51508, 127.04876))
                .title("????????????").snippet("?????? ????????????"));



    }

}


