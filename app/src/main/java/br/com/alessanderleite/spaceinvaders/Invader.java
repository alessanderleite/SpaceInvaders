package br.com.alessanderleite.spaceinvaders;

import android.graphics.Bitmap;
import android.graphics.RectF;

import java.util.Random;

public class Invader {

    RectF rect;

    Random generator = new Random();

    // The player ship will be represented by a Bitmap
    private Bitmap bitmap1;
    private Bitmap bitmap2;

    // How long and high our invader will be
    private float length;
    private float height;

    // X is the far left of the rectangle which forms our invader
    private float x;

    // Y is the top coordinate
    private float y;

    // This will hold the pixels per second speedthat the invader will move
    private float shipSpeed;

    public final int LEFT = 1;
    public final int RIGHT = 2;

    // Is the ship moving and in which direction
    private int shipMoving = RIGHT;

    boolean isVisible;

}
