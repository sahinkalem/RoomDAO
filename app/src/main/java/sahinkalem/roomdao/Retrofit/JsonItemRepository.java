package sahinkalem.roomdao.Retrofit;


import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sahinkalem.roomdao.JsonModels.JsonItem;

public class JsonItemRepository {
    RetrofitApiInterface retrofitApiInterface;

    public LiveData<List<JsonItem>> getItems(String bookname) {
        MutableLiveData<List<JsonItem>> itemsLiveData = new MutableLiveData<>();
        retrofitApiInterface.searchVolumes(bookname).enqueue(new Callback<List<JsonItem>>() {
            @Override
            public void onResponse(@NonNull Call<List<JsonItem>> call, @NonNull Response<List<JsonItem>> response) {
                if (response.isSuccessful()) {
                    itemsLiveData.setValue(response.body());
                } else {
                    System.err.println("API Yanıtı Başarısız: " + response.code());
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<JsonItem>> call, @NonNull Throwable t) {
                System.err.println("API İsteği Başarısız: " + t.getMessage());
            }
        });
        return itemsLiveData;
    }
}
