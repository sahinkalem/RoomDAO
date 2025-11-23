package sahinkalem.roomdao.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import sahinkalem.roomdao.Adapters.BookVolumeAdapter;
import sahinkalem.roomdao.JsonModels.JsonItem;
import sahinkalem.roomdao.JsonModels.JsonVolumeInfo;
import sahinkalem.roomdao.R;
import sahinkalem.roomdao.ViewModels.JsonItemViewModel;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;
    JsonItemViewModel viewModel;
    BookVolumeAdapter adapter;


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

        viewModel = new ViewModelProvider(this).get(JsonItemViewModel.class);

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

    private void getResults(String bookName) {
        viewModel.getItems(bookName).observe(this, items -> {
            List<JsonVolumeInfo> volumeInfos = new ArrayList<>();
            if (items != null) {
                for (JsonItem item : items) {
                    volumeInfos.add(item.getVolumeInfo());
                }
                 adapter = new BookVolumeAdapter(this);
                recyclerView.setAdapter(adapter);
            }
        });
    }
}