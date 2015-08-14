package emanuel.calificaciones;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cmdabrir = (Button)findViewById(R.id.cmdabrir2);
        Button cmdDivisit=(Button)findViewById(R.id.cmdDivisit);

        cmdabrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(MainActivity.this,principal.class);
                startActivity(i);
            }
        });

        cmdDivisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://divisist.ufps.edu.co";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        //Cierra la aplicación
        if (id == R.id.action_salir)
            System.exit(0);

        //Resultado de tocar un "Acerca de"
<<<<<<< HEAD
        else if(id==R.id.action_acerca){
            Intent i = new Intent(MainActivity.this, Acerca_de.class);
            startActivity(i);
        }
=======
        else if(id==R.id.action_acerca)
            Toast.makeText(getBaseContext(),"Creado por Jairo y Emanuel",Toast.LENGTH_SHORT).show();
>>>>>>> cdd850958cd004b2ee1dff1bfddd8cf9b7167355

        return super.onOptionsItemSelected(item);
    }
}
