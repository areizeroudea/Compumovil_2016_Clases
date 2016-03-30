package co.edu.udea.compumovil.services;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends IntentService
{
    public MyService()
    {
        super("IntentService");
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    protected void onHandleIntent(Intent intent)    //ejecuta en un nuevo hilo por lo que no bloqueara la app
    {
        Log.d("MyService", "OnHandleintent");
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
        for (int i=1; i<=15; i++)
        {
            Log.d("MyService", "i = "+i);
        }
        stopSelf();   //en caso de que queramos que se detenga despues de lo que hay que hacer
        return START_STICKY;    //volver a lanzarse si se cierra
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("MyService", "OnDestroy");
    }
}
