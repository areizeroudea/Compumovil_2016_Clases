package co.edu.udea.compumovil.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service
{
    public MyService()
    {
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.d("MyService", "OnCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Log.d("MyService", "OnStartCommand");
        //stopSelf();   //en caso de que queramos que se detenga despues de lo que hay que hacer
        return START_STICKY;    //volver a lanzarse si se cierra
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("MyService", "OnDestroy");
    }
}
