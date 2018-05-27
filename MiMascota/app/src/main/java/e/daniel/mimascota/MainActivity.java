package e.daniel.mimascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        listaMascota= (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this,2);

        listaMascota.setLayoutManager(llm);
        InicializarListaMascotas();
        inicializarAdaptador();
    }


    public void InicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.cat,"Suco","0"));
        mascotas.add(new Mascota(R.drawable.perrotriste,"Pepito","0"));
        mascotas.add(new Mascota(R.drawable.perrotacla,"Doky","0"));
        mascotas.add(new Mascota(R.drawable.perro,"Rocky","0"));
        mascotas.add(new Mascota(R.drawable.gatonegro,"Gordo","0"));
        mascotas.add(new Mascota(R.drawable.gatofoto,"Negro","0"));
    }

    public MascotaAdapter adaptador;
    public void inicializarAdaptador(){
        adaptador= new MascotaAdapter(mascotas,this);
        listaMascota.setAdapter(adaptador);
    }
}
