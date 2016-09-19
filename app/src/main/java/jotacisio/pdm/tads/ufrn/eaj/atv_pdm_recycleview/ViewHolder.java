package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Taniro on 18/09/2016.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;

    public ViewHolder(View v) {
        super(v);

        textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        textViewAutor= (TextView) v.findViewById(R.id.autor);
        textViewQuantidade= (TextView) v.findViewById(R.id.quantidade);
        img = (ImageView) v.findViewById(R.id.img);
    }
}
