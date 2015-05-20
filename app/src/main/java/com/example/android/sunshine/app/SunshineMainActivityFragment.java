package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class SunshineMainActivityFragment extends Fragment {

    public SunshineMainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sunshine_main, container, false);
        ArrayList<String> listForecast = new ArrayList<>();
        listForecast.add("Today-Sunny-88/63");
        listForecast.add("Tomorrow-Foggy-70/46");
        listForecast.add("Weds-Cloudy-72/63");
        listForecast.add("Fri-Foggy-70/46");
        listForecast.add("Weds-Sunny-76/68");

        ArrayAdapter<String> adapterForecast = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                listForecast
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        listView.setAdapter(adapterForecast);


        return rootView;
    }
}
