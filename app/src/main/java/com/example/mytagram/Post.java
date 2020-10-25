package com.example.mytagram;

import android.graphics.Bitmap;
import android.location.Location;

public class Post {

    private Bitmap image;
    private Location location;
    private String massage;

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
