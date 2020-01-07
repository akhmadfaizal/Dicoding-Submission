package com.example.movie_oredoo;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable  {

    private String moviesName;
    private String description;
    private int imgResource;
    private int bgImgResources;
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getBgImgResources() {
        return bgImgResources;
    }

    public void setBgImgResources(int bgImgResources) {
        this.bgImgResources = bgImgResources;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    //----------------------------------------------------------------------------------//

    public Movies(){

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel in) {
            return new Movies(in);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };

    protected Movies(Parcel in) {
        this.moviesName = in.readString();
        this.description = in.readString();
        this.imgResource = in.readInt();
        this.bgImgResources = in.readInt();
        this.duration = in.readString();

    }


    @Override
    public void writeToParcel(Parcel i, int flags) {
        i.writeString(this.moviesName);
        i.writeString(this.description);
        i.writeInt(this.imgResource);
        i.writeInt(this.bgImgResources);
        i.writeString(this.duration);
    }

}
