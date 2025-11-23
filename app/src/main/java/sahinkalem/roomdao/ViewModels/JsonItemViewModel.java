package sahinkalem.roomdao.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import sahinkalem.roomdao.JsonModels.JsonItem;
import sahinkalem.roomdao.Retrofit.JsonItemRepository;

public class JsonItemViewModel extends AndroidViewModel {
    private final JsonItemRepository repository;
    private final LiveData<List<JsonItem>> itemsLiveData;

    public JsonItemViewModel(@NonNull Application application) {
        super(application);
        repository = new JsonItemRepository();
        itemsLiveData = repository.getItems("bookName");
    }
    public LiveData<List<JsonItem>> getItems(String bookname) {
        return repository.getItems(bookname);
    }

}
