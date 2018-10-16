package com.example.android.quakereport;

/**
 * Created by Asim on 16/10/2018.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private String mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @pram magnitude is the magnitude (size) of the earthquake
     * @pram location is the city location of the earthquake
     * @pram date is the date the earthquake happened
     */
    public Earthquake(String magnitude, String locaiton, String date) {
        mMagnitude = magnitude;
        mLocation = locaiton;
        mDate = date;
    }

    /**
     * Returns the magnitude of the earthquake
     */
    public String getMagnitude () { return mMagnitude; }

    /**
     * Returns the location of the earthquake
     */
    public String getLocation () { return mLocation; }

    /**
     * Returns the date of the earthquake
     */
    public String getDate () { return mDate; }

}
