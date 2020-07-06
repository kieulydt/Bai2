package com.example.sharedpreferences.data;

public class ItemClickListenr {
    public interface ItemCliclListenr<T>{
        void onClickItem(int position, T item);
    }
}
