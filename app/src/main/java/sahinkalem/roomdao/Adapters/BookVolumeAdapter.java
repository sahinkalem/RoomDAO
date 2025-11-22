package sahinkalem.roomdao.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sahinkalem.roomdao.JsonModels.JsonVolumeInfo;
import sahinkalem.roomdao.R;


public class BookVolumeAdapter extends RecyclerView.Adapter<BookVolumeAdapter.BookViewHolder> {
    private List<JsonVolumeInfo> mBookList;

    public BookVolumeAdapter(List<JsonVolumeInfo> bookList) {
        mBookList = bookList;
    }

    @NonNull
    @Override
    public BookVolumeAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookVolumeAdapter.BookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
