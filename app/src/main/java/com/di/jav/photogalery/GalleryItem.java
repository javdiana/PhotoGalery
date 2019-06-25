package com.di.jav.photogalery;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUri;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
