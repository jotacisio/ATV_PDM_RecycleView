package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview);

        List<Livro> listaLivros = Livro.getLivros();

        recyclerView.setAdapter(new LivroAdapter(listaLivros, this));

        //RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true);
        RecyclerView.LayoutManager layout = new GridLayoutManager (this, 2);
        //RecyclerView.LayoutManager layout = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layout);
    }
}
