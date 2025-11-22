package sahinkalem.roomdao.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import sahinkalem.roomdao.JsonModels.JsonVolumeInfo;
import sahinkalem.roomdao.R;


public class BookVolumeAdapter extends RecyclerView.Adapter<BookVolumeAdapter.BookViewHolder> {
    private List<JsonVolumeInfo> mBookList;
    Context mContext;

    public BookVolumeAdapter(Context context) {
        mContext = context;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setBookList(List<JsonVolumeInfo> bookList) {
        mBookList = bookList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public BookVolumeAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new BookViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BookVolumeAdapter.BookViewHolder holder, int position) {
        JsonVolumeInfo book = mBookList.get(position);

        // Set Book Name
        holder.txtBookName.setText(book.getTitle());

        // Set Book Author(s)
        List<String> authors = book.getAuthors();
        if (authors != null && !authors.isEmpty()) {
            StringBuilder authorStringBuilder = new StringBuilder();
            for (String author : authors) {
                authorStringBuilder.append(author).append(", ");
            }
            String authorsString = authorStringBuilder.toString();
            if (authorsString.endsWith(", ")) {
                authorsString = authorsString.substring(0, authorsString.length() - 2);
            }
            holder.txtBookAuthor.setText(authorsString);
        } else {
            holder.txtBookAuthor.setText("Unknown Author");
        }

        // Set publisher
        if (book.getPublisher() == null) {
            holder.txtBookPublisher.setText("Unknown Publisher");
        } else {
            holder.txtBookPublisher.setText(book.getPublisher());
        }

        // Set Published Date
        if (book.getPublishedDate() == null) {
            holder.txtPublishedDate.setText("Unknown Published Date");
        } else {
            holder.txtPublishedDate.setText("Published Date: " +book.getPublishedDate());
        }

        // Set Page Count
        if (book.getPageCount() == 0) {
            holder.txtPageCount.setText("Unknown Page Count");
        } else {
            holder.txtPageCount.setText("Page Count: " + book.getPageCount());
        }

        // Set Image
        if (book.getImageLinks() != null && book.getImageLinks().getSmallThumbnail() != null) {
            String imageUrl = book.getImageLinks().getSmallThumbnail();
            Glide.with(mContext)
                    .load(imageUrl)
                    .into(holder.imageView);
        } else {
            holder.imageView.setImageResource(R.drawable.image_error);
        }
    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        private final ShapeableImageView imageView;
        private final TextView txtBookName;
        private final TextView txtBookAuthor;
        private final TextView txtBookPublisher;
        private final TextView txtPublishedDate;
        private final TextView txtPageCount;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            txtBookName = itemView.findViewById(R.id.textBookName);
            txtBookAuthor = itemView.findViewById(R.id.textBookAuthor);
            txtBookPublisher = itemView.findViewById(R.id.txtBookPublisher);
            txtPublishedDate = itemView.findViewById(R.id.txtPublishedDate);
            txtPageCount = itemView.findViewById(R.id.txtPageCount);
        }
    }
}
