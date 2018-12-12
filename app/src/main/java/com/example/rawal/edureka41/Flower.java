package com.example.rawal.edureka41;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Flower extends Fragment {


    RecyclerView recyclerView;
    ArrayList<SampleData> dataFlower;
    RecyclerAdapter recyclerAdapter;

    public Flower() {
        // Required empty public constructor
        dataFlower = new ArrayList<>(  );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1526228446530-49914082ff8a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","Monika Grabkowska","Lilac blossom - the smell of my childhood","Southampton, United Kingdom" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1498814117408-e396f5507073?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=613&q=80","Annie Spratt","Pale pinks and whites arranged in a florists oasis, sat on top of a (very unglamorous) dark grey tshirt." +
                " \n" +
                " Part of a series of dark florals, you can find the rest on my Unsplash profile ❤️","New Forest National Park, UK" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1467196182985-b5de034d6cd4?ixlib=rb-1.2.1&auto=format&fit=crop&w=633&q=80","Annie Spratt","Focal Length : 50.0mm\nShutter Speed : 1/5000s\nAperture : f/1.8\nISO : 100\nCamera : NIKON D4S","RHS Garden Wisley, Wisley, United Kingdom" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80", "Sergey Shmidt","California blooming like crazy after months of non-stop rains. Even deserts are covered with juicy bright flowers. The photo was made on Diamond Valley Lake a few days ago.","Diamond Valley Lake, United States" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1465990138262-b7c355d1ef90?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Monica Galentino","Focal Length : 50.0mm\nShutter Speed : 1/100s\nAperture : f/1.8\nISO : 100\nCamera : NIKON D5200","Poppies, Pienza, Italy" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1467031330410-dac0e3636216?ixlib=rb-1.2.1&auto=format&fit=crop&w=1187&q=80","Javier Cañada","Shutter Speed : 1/4000s\nISO : 640\nCamera : SONY ILCE-6000","Guadalajara, Spain" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1466622792323-ebb4abf0f558?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Aaron Barnaby","Focal Length : 70.0mm\nShutter Speed : 1/100s\nAperture : f/11.0\nISO : 100\nCamera : Canon EOS 70D","Las Vegas, United States" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1497800835967-3b5cdef2aa7d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1189&q=80","Sergei Akulich","Focal Length : 85.0mm\nShutter Speed : 1/8000s\nAperture : f/2.2\nISO : 100\nCamera : SONY ILCE-7M2","Roozengaarde, Mount Vernon, United States" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/uploads/1412748786298aacc1dc7/f2e5b5da?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","indah nur","Focal Length : 4.1mm\nShutter Speed : 1/1282s\nAperture : f/2.2\nISO : 32\nCamera : Apple iPhone 5s","5963 Fountain Ave, Los Angeles, United States" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1496483648148-47c686dc86a8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80","virginia lackinger","Focal Length : 58.0mm\nShutter Speed : 1/125s\nAperture : f/5.6\nISO : 200\nCamera : NIKON D3200","Olbendorf, Austria" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1505129013025-ecf8f0168373?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=633&q=80","Annie Spratt","Focal Length : 105.0mm\nShutter Speed : 1/8000s\nAperture : f/2.8\nISO : 640\nCamera : NIKON D4S","Uppark House and Garden, South Harting, United Kingdom" ) );
        dataFlower.add( new SampleData( "https://images.unsplash.com/photo-1496264093734-ffe59b144f9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Saketh Garuda","Focal Length : 250.0mm\nShutter Speed : 1/180s\nAperture : f/5.6\nISO : 100\nCamera : Canon EOS 550D","Emerald Bay Road, South Lake Tahoe, United States" ) );

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_flower, container, false );

        recyclerView = view.findViewById( R.id.list_for_flower_pics );
        recyclerView.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );
        recyclerAdapter = new RecyclerAdapter( getContext(),R.layout.sample_grid_item,dataFlower );
        recyclerView.setAdapter( recyclerAdapter );

        return view;
    }

}
