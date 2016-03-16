package co.edu.udea.compumovil.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    Fragment fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
        {
            fragmentA = new FragmentA(); //creamos una instancia de ese fragment

            FragmentManager fragmentManager = getSupportFragmentManager();  //necesario9 para crear el transaction
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();   //necesario para manipular freagments

            fragmentTransaction.add(R.id.fragmentContainerAct, fragmentA);  //anhadimos el fragment al contenedor (id del xml-layout de la actividad)
            fragmentTransaction.commit();   //indicamos los cambios
        }
    }

    public void replaceFragment(View v)
    {
        Fragment fragmentB = new FragmentB(); //creamos una instancia de ese fragment

        FragmentManager fragmentManager = getSupportFragmentManager();  //necesario9 para crear el transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();   //necesario para manipular freagments
        fragmentTransaction.replace(R.id.fragmentContainerAct, fragmentB);
        fragmentTransaction.addToBackStack("Este es un key inutil");    //necesario para que los fragments tengan retroceso
        fragmentTransaction.commit();
    }
}
