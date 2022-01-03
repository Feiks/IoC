package org.springframework;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public void getSong() {
        System.out.println("Classical Music , suki");;
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
