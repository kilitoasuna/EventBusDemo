package com.example.songxh.myapplication;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindFragment();

    }

    /**
     * fragment和activity动态绑定
     */
    private void bindFragment(){
        ItemFragment fragment = new ItemFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.list_item, fragment,"list_item").commit();
        DetailFragment fragmentDetail = new DetailFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.detail, fragmentDetail,"fragmentDetail").commit();

    }
}
