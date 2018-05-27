package e.daniel.mimascota;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>{
    public MascotaAdapter(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity=activity;
    }

    ArrayList<Mascota> mascotas;
    Activity activity;
    int valor=0; //Para ir contando huesos
    String nuevo=""; //
    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvValor.setText(mascota.getValor());


        mascotaViewHolder.imgHueso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                MascotaViewHolder mascotaViewHolder1 = new MascotaViewHolder();
                Toast.makeText(activity,"Diste Like a "+mascota.getNombre(),Toast.LENGTH_SHORT).show();
                valor++;
                nuevo = String.valueOf(valor);
                mascotaViewHolder.tvValor.setText(nuevo);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvValor;
        private ImageButton imgHueso;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvValor = (TextView) itemView.findViewById(R.id.tvValorCV);
            imgHueso = (ImageButton) itemView.findViewById(R.id.btnHueso);


        }
    }
}
