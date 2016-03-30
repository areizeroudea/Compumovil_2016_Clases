package co.edu.udea.compumovil.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        Intent i = new Intent(this, MyService.class);
        switch (v.getId())
        {
            case R.id.btnStartService:
                startService(i);
                break;
            case R.id.btnStopService:
                stopService(i);
                break;
        }
    }
}
