package br.com.alessanderleite.spaceinvaders;

import android.graphics.Bitmap;

public class PlayerShip {

    // The player ship will be represented by a Bitmap
    private Bitmap bitmap;

    // How long and high our ship will be
    private float length;
    private float height;

    // X is the far left of the rectanble which formas our ship
    private float x;

    // Y is the top coordinate
    private float y;

    // This will hold the pixels per second speed that the ship will move
    private float shipSpeed;

    // Which ways can the ship move
    public final int STOPPED = 0;
    public final int LEFT = 1;
    public final int RIGHT = 2;

    // Is the ship moving and in which direction
    private int shipMoving = STOPPED;
}
