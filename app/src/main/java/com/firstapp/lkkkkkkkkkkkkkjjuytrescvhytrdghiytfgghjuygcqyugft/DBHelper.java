import android.content ContentValues;
import android.content Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBHelper extends SQLiteOpenHelper {
public static final String DATABASE_NAME = "Student.db";
public static final String TABLE_NAME = "students_table"
