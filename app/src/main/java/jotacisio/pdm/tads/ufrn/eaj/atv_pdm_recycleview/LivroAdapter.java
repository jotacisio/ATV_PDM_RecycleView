package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Taniro on 18/09/2016.
 */
public class LivroAdapter extends RecyclerView.Adapter {

    List<Livro> listaLivro;
    Context context;

    public LivroAdapter (List<Livro> listaLivro, Context context){
        this.listaLivro = listaLivro;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.livro_item_card, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewholder, int position) {

        ViewHolder holder = (ViewHolder) viewholder;

        Livro livroescolhido = listaLivro.get(position);
        holder.textViewTitulo.setText(livroescolhido.getTitulo());
        holder.textViewAutor.setText(livroescolhido.getAutor());
        holder.textViewQuantidade.setText(""+livroescolhido.getQuantidade());
        if(livroescolhido.getLido() == true){
            holder.img.setImageResource(R.drawable.open);
        }else{
            holder.img.setImageResource(R.drawable.flat);
        }

    }

    @Override
    public int getItemCount() {
        return listaLivro.size();
    }
}
