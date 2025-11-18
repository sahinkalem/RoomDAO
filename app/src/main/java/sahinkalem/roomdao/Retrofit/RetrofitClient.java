package sahinkalem.roomdao.Retrofit;

import androidx.annotation.NonNull;

import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitApiInterface retrofitApiInterface;
    final static String BASE_URL = "https://www.googleapis.com/books/v1/";


    @NonNull
    public static RetrofitApiInterface getApiInterface() {
        if (retrofitApiInterface == null) {
            retrofit2.Retrofit retrofit = new retrofit2
                    .Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            retrofitApiInterface = retrofit.create(RetrofitApiInterface.class);
        }
        return retrofitApiInterface;
    }

}
