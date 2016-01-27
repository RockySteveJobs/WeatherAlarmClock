/*
 * Copyright (c) 2016. Kaku咖枯 Inc. All rights reserved.
 */
package com.kaku.weac.bean.Event;

/**
 * @author 咖枯
 * @version 1.0 2016/1/24
 */
public class ScanCodeEvent {
    /**
     * 图片地址
     */
    private String mImageUrl;

    public String getImageUrl() {
        return mImageUrl;
    }


    public ScanCodeEvent(String imageUrl) {
        mImageUrl = imageUrl;
    }
}