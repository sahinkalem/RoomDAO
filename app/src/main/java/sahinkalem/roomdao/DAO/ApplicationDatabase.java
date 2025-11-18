package sahinkalem.roomdao.DAO;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import sahinkalem.roomdao.FavoriteModels.ModelVolumeInfo;

@Database(entities = { ModelVolumeInfo.class}, version = 1, exportSchema = false)
public abstract class ApplicationDatabase extends RoomDatabase {
    public abstract BookDAO bookDAO();

    private static volatile ApplicationDatabase INSTANCE;

    public static ApplicationDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ApplicationDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    ApplicationDatabase.class, "application_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
