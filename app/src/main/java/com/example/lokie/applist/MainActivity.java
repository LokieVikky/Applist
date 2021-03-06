
package com.example.lokie.applist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // Passing the column number 1 to show online one column in each row.
        recyclerViewLayoutManager = new GridLayoutManager(MainActivity.this, 3);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        adapter = new AppsAdapter(MainActivity.this, new ApkInfoExtractor(MainActivity.this).GetAllInstalledApkInfo());

        recyclerView.setAdapter(adapter);
    }
}

