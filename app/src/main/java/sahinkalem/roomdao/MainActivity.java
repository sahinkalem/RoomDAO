package sahinkalem.roomdao;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        searchView = findViewById(R.id.search_view);
        RelativeLayout.LayoutParams layoutParamsSearchView = (RelativeLayout.LayoutParams) searchView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParamsRecyclerview = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextSubmit(String s) {
                layoutParamsSearchView.addRule(RelativeLayout.BELOW, R.id.toolbar);
                searchView.setLayoutParams(layoutParamsSearchView);
                recyclerView.setVisibility(View.VISIBLE);
                layoutParamsRecyclerview.addRule(RelativeLayout.BELOW, R.id.search_view);

                return true;
            }
        });
    }
}