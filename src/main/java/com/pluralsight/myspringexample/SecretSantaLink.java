package com.pluralsight.myspringexample;

public class SecretSantaLink {
    private String santa = "Santa";
    private String child = "Child";

    public SecretSantaLink() {}

    public SecretSantaLink(String santa, String child) {
        this.santa = santa;
        this.child = child;
    }

    @Override
    public String toString() {
        return "SecretSantaLink{" +
                "santa='" + santa + '\'' +
                ", child='" + child + '\'' +
                '}';
    }
}
