package com.sush.inheritance.multiple;

interface Camera {
    public void clickPhoto();

    public void shootVideo();
}

@FunctionalInterface
interface MediaPlayer{
    public void playMusic(String musicName);
}
abstract class Phone {
    abstract public void makeCall(String name);
}

class Smartphone extends Phone implements Camera, MediaPlayer{

    @Override
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void shootVideo() {
        System.out.println("Video shot");
    }

    @Override
    public void playMusic(String musicName) {
        System.out.println("playing " + musicName);
    }

    @Override
    public void makeCall(String name) {
        System.out.println("Calling " + name);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone();
        samsung.makeCall("Arjun");
    }
}
