package com.walking.lesson20_exeption.task1_catchExeption.model;

public class File {
    private String name;
    private long size;
    public MediaType mediaType;

    public File() {

    }

    public File(String name, long size, MediaType mediaType) {
        this.name = name;
        this.size = size;
        this.mediaType = mediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", mediaType=" + mediaType +
                '}';
    }
}
