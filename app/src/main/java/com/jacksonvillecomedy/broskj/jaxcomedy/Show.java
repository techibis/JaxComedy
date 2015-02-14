package com.jacksonvillecomedy.broskj.jaxcomedy;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by Kyle on 1/28/2015.
 */
public class Show implements Parcelable{
    private String comedian;
    private String description;
    private String showDate;
    private int showTime;
    private int soldOut;
    final private int CLEAN = 0, UNCUT = 1, SPECIAL = 2;

    public Show() {
        comedian = "";
        description = "";
        showDate = "";
        showTime = -1;
        soldOut = 0;
    }

    public Show(String comedian, String description, String showDate, int showTime, int soldOut) {
        this.comedian = comedian;
        this.description = description;
        this.showDate = showDate;
        this.showTime = showTime;
        this.soldOut = soldOut;
    }

    public void setComedian(String comedian) {
        this.comedian = comedian;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void setShowTime(int showTime) {
        this.showTime = showTime;
    }

    public void setSoldOut(int soldOut) {
        this.soldOut = soldOut;
    }

    public String getComedian() {
        return this.comedian;
    }

    public String getDescription(){
        return this.description;
    }

    public String getShowDate() {
        return this.showDate;
    }

    public int getShowTime() {
        return this.showTime;
    }

    public int getSoldOut() {
        return this.soldOut;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(comedian);
        dest.writeString(description);
        dest.writeString(showDate);
        dest.writeInt(showTime);
        dest.writeInt(soldOut);
    }

    @SuppressWarnings("unchecked")
    public static final Parcelable.Creator<Show> CREATOR = new Parcelable.Creator<Show>(){

        @Override
        public Show createFromParcel(Parcel in) {
            return new Show(in);
        }

        @Override
        public Show[] newArray(int size) {
            return new Show[size];
        }
    };

    private Show(Parcel in){
        comedian = in.readString();
        description = in.readString();
        showDate = in.readString();
        showTime = in.readInt();
        soldOut = in.readInt();
    }
}
