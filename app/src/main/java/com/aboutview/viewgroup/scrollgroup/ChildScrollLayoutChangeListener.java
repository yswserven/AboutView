package com.aboutview.viewgroup.scrollgroup;

public interface ChildScrollLayoutChangeListener {
    void doChange(int lastIndex, int currentIndex);
    void onReadyRefresh();
    void onReady();
    void doRefresh();
    void overRefresh();
}
