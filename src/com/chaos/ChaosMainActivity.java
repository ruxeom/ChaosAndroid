package com.chaos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.helpers.*;

public class ChaosMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaos_main);
        String ids = "";
        ids = ids + new GameObject().getID();
        ids = ids + new PositionedObject(1,1).getID();
        //ids = ids + new VisibleObject(1,1).getID();
        TextView t = (TextView)this.findViewById(R.id.label);
        t.setText(ids);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_chaos_main, menu);
        return true;
    }
}
