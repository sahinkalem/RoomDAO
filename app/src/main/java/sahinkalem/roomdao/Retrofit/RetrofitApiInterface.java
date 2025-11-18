package sahinkalem.roomdao.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sahinkalem.roomdao.JsonModels.JsonItem;
import sahinkalem.roomdao.JsonModels.JsonVolumeResponse;

public interface RetrofitApiInterface {
    /**
     * Google Books API'de "volumes" endpoint'ine bir GET isteği yapar.
     * Sorgu parametresi 'q' (query) ile arama yapar.
     * <p>
     * Örnek Kullanım: searchVolumes("author:adam smith")
     *
     * @param query Google Books API sorgusu (örn: "inauthor:Stephen King", "isbn:9780307474278")
     * @return Dönen JSON yanıtını BookResponse modeline dönüştüren bir Retrofit Call nesnesi.
     */
    @GET("volumes")
    Call<List<JsonItem>> searchVolumes(@Query("q") String query);

    // İhtiyaç halinde diğer API endpoint'leri buraya eklenebilir.
    // Örnek: Belirli bir kitabı ID ile getirme
    // @GET("volumes/{volumeId}")
    // Call<Volume> getVolumeById(@Path("volumeId") String volumeId);
}
