package sahinkalem.roomdao.DAO;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import sahinkalem.roomdao.FavoriteModels.ModelVolumeInfo;


@Dao
public interface BookDAO {

    ///
    /// Volume Info ----------------------------------------------------------------------------------------------------
    ///
    @Insert
    void insertVolumeInfo(ModelVolumeInfo modelVolumeInfo);

    @Update
    void updateVolumeInfo(ModelVolumeInfo modelVolumeInfo);

    @Delete
    void deleteVolumeInfo(ModelVolumeInfo modelVolumeInfo);

    @Query("SELECT * FROM tbl_volume_info")
    LiveData<List<ModelVolumeInfo>> getAllVolumeInfo();
}
