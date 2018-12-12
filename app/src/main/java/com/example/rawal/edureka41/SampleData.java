package com.example.rawal.edureka41;

import java.io.Serializable;

public class SampleData implements Serializable {

    public String imageID;
    public String creditedArtist;
    public String imageInfo;
    public String imageLocation;

    public SampleData(){

    }

    public SampleData(String imageID, String creditedArtist, String imageInfo, String imageLocation){
        this.creditedArtist = creditedArtist;
        this.imageID = imageID;
        this.imageInfo = imageInfo;
        this.imageLocation = imageLocation;
    }

}
