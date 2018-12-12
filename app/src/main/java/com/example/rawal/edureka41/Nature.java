package com.example.rawal.edureka41;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Nature extends Fragment{

    RecyclerView recyclerView;
    ArrayList<SampleData> dataNature;
    RecyclerAdapter recyclerAdapter;

    public Nature() {
        // Required empty public constructor
        dataNature = new ArrayList<>(  );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1544297787-43ce4f544585?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80" , "Damian Markutt" , "For the first time I hiked the Chrachenhorn, 2891 a.s.l. so I thought why not try to hike up for sunrise? Said and done I hiked through the night and reached the top just in time for a beauftiful sunrise. The view was quite impressive!","Chrachenhorn, Davos Monstein, Switzerland" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1544435519-7b24c9f14f2a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80" , "Michael Olsen", "This is a place special to my heart. The sun was setting and I had minutes to capture this with the light on the mountain." , "waterton") );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1544294299-699898e428c7?ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80" , "Alexander Slash" ,"When I saw this amazing light over Sinaia, I knew I got to fly my drone. So I did, and captured it just before it went away. Enjoy.", "Sinaia, Romania" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1543954496-f56252e0c408?ixlib=rb-1.2.1&auto=format&fit=crop&w=988&q=80" , "Alexander Slash" ,"Took this photo on a workshop a few days ago, just wanted to share it with the community. Just moments before the sun rises over the mountains.","Sirnea, Brasov" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1544427182-ecaee9a40564?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80" , "Tom Gainor" ,"This is a series of about 90 images stacked together to bring out colors from early in blue hour into night. I never know if the series of images will turn out. I am glad this set did.","Vulture Mine Road, Wikenburg, AZ, USA") );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1531204823259-03b92a613013?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=776&q=80" , "Stefano Zocca", "Returning to my hotel in Dubrovnik after a trip to the beach, I was surprised by a summer storm. As soon as I saw the first lightning illuminate the sea and the bay I stuck the car, put down my tripod, and, Wow! Immediately, a seemingly endless series of flashes began to drain into the water in front of the magnificent city…","Dubrovnik, Croatia" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1504278812104-f9cd3002aac9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Rucksack Magazine","A landscape photo of the breath-taking scenery on show in Glen Coe. We took this image as we walked through the valley from Glencoe town to the Lost Valley.","Glen Coe, Ballachulish, United Kingdom" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1478071735433-5d8f19ad0fca?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Alexandre Chambon","We left in the early morning to climb this mountain known to be one of the nicest in South Korea during fall. Quickly, rain started pouring down, we couldn’t see a thing. But suddenly the fog dispersed and we felt we entered a mysterious world above the clouds.","Seoraksan, Inje-gun, South Korea" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1491466424936-e304919aada7?ixlib=rb-1.2.1&auto=format&fit=crop&w=1049&q=80","Jonatan Pie","Strolling down the canyon. It was midnight and auroras were bursting, but i was stuck in the canyon, so i tried to make as much use as i can from the position where i was. The idea fell on my mind to light the sides with the torches and another selfie came out :)","Stakkholtsgja canyon, Iceland" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1488388373205-a134c1cc7e4e?ixlib=rb-1.2.1&auto=format&fit=crop&w=1083&q=80","Jason Strull","During this winter trip to Yosemite we were driving around like hyper highschool girls freaking out at all the amazing photos that presented themselves in the Yosemite national park at night. When we took the turn to see this sight I said “Stop the car!!!” Its way better in person, you have to visit some time.","Yosemite National Park Road, Yosemite Valley, United States" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1522784345825-1df5bb6867ca?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Mishal Ibrahim","Shot taken on December 25th 2015 with Nikon D5200 with the 50mm f/1.8","Huvadhu Atoll, Maldives" ) );
        dataNature.add( new SampleData( "https://images.unsplash.com/photo-1505027593521-2436e2dbe299?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjM3Njd9&auto=format&fit=crop&w=701&q=80","Stephen Leonardi","Yosemite","Yosemite Valley, United States" ) );
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_nature, container, false );

        recyclerView = view.findViewById( R.id.list_for_nature_pics );
        recyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        recyclerAdapter = new RecyclerAdapter( getContext(),R.layout.sample_list_item,dataNature );
        recyclerView.setAdapter( recyclerAdapter );

        return view;
    }
}
