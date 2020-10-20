package com.company;

public class H1_65 {
    private int mX;
    private int mY = 0;
    private final int A = 100;
    public final int B = 200;

    public H1_65(int pX){
        setX(pX);
    }

    public H1_65(){
        this(-1);
    }

    public int getX(){
        return mX;
    }

    public void setX(int pX){
        mX = pX;
    }

    public int getY(){
        return mY;
    }

    public void setY(int pY){
        mY = pY;
    }





}
