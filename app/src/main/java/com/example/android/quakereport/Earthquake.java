package com.example.android.quakereport;

/**
 * Created by Asim on 16/10/2018.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @pram magnitude is the magnitude (size) of the earthquake
     * @pram location is the city location of the earthquake
     * @pram date is the date the earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake
     */
    public double getMagnitude () { return mMagnitude; }

    /**
     * Returns the location of the earthquake
     */
    public String getLocation () { return mLocation; }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() { return mUrl; }

}
