package com.google.android.gms.samples.vision.barcodereader.quiz;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    // Database Name
    private static final String DATABASE_NAME = "table";
    // tasks table name
    private static final String TABLE_QUEST = "quiz";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private static final String KEY_OPTD = "optd"; // option d

    private SQLiteDatabase dbase;

    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT)";
        db.execSQL(sql);
        addQuestion();
        // db.close();
    }

    private void addQuestion() {
        Question q1 = new Question("When Wat-Umong was build?", "Over 700 years ago", "Over 600 years ago", "Over 5000 years ago", "Over 10000 years ago", "Over 700 years ago");
        this.addQuestion(q1);
        Question q2 = new Question("Which tunnel does not have evidence of painting on the wall", "Tunnel number 1", "Tunnel number 2", "Tunnel number 3", "Tunnel number 4", "Tunnel number 4");
        this.addQuestion(q2);
        Question q3 = new Question("What is the purpose for building Wat-Umong tunnel ?", "For sleeping", "For relaxing", "For meditation", "For walking", "For meditation");
        this.addQuestion(q3);
        Question q4 = new Question("Where does Wat-Umong located ?", "Bangkok", "Chon Buri", "Sisaket", "Chiangmai", "Chiangmai");
        this.addQuestion(q4);
        Question q5 = new Question("The painting on the wall is influenced by which country?", "China", "England", "USA", "French", "China");
        this.addQuestion(q5);
        Question q6 = new Question("Which type of  painting are not related to Wat Umong-Tunnel ?", "Lotus", " Cloud", "Peacocks", "Lion", "Lion");
        this.addQuestion(q6);
        Question q7 = new Question("Which bird painting are not related to Wat Umong-Tunnel ?", "Male Peacock", " parrot", "Eagle", "Chinese Phoenix ", "Eagle");
        this.addQuestion(q7);
        Question q8 = new Question("Which type of radiation help us to analyze Painting ?", "Infrared", " X-ray", "Microwave", "All are correct ", "Infrared");
        this.addQuestion(q8);
        Question q9 = new Question("What is the disadvatages of using Infrared ray to analyze painting", "No Colour", " No Picture", "doesn't work", "All are correct ", "No Colour");
        this.addQuestion(q9);
        Question q10 = new Question("Which machine is not related to chemical analysis process?", "XRD", " SEM/EDS", "Optical Microscope", "MRI", "MRI");
        this.addQuestion(q10);
        Question q11 = new Question("Which color does related to Wat Umong painting ", "Red", " Green", "Brown", "Yellow", "Yellow");
        this.addQuestion(q11);
        Question q12 = new Question("CaCO3 can be represented by? ", "lime", " water", "soil", "air", "lime");
        this.addQuestion(q12);
        Question q13 = new Question("According to periodic table of elements, Cinnabar can be represented by? ", "HgS", " Cu", "Mg", "Cl", "HgS");
        this.addQuestion(q13);
        Question q14 = new Question("From the evidence, Red color is made from?", "Cinnabar", " Malachite", "Sweet basil", "None of above", "Cinnabar");
        this.addQuestion(q14);
        Question q15 = new Question("From the evidence, Green color is made from?", "Cinnabar", " Malachite", "Sweet basil", "None of above", "Malachite");
        this.addQuestion(q15);
        Question q16 = new Question("From the evidence, Brown color is made from?", "Cinnabar", " Malachite", "Sweet basil", "None of above", "Cinnabar");
        this.addQuestion(q16);
        Question q17 = new Question(" What is not true about Measurement and Orientation of Tunnels?", "For the construction, tunnel builders did not take into account the accuracy of the direction and angle", " Each corner from the interaction between 2 tunnels is different. There are no right angle", "Perfect account the accuracy of the direction and angle", "None of above is false", "Perfect account the accuracy of the direction and angle");;
        this.addQuestion(q17);
        Question q18 = new Question("The ceiling of the tunnels is symmetrical between? ", "1,2", " 2,3", "1,3", "2,5", "2,3");
        this.addQuestion(q18);
        Question q19 = new Question("Which is true about The benefits of mathematical research onthe study of Thai art and architecture.", "Better understanding on the construction of tunnels", " Restoration the tunnels.", "Making 3D modelling.", "All are correct", "All are correct");
        this.addQuestion(q19);
        Question q20 = new Question("Which elements can produced red colour? ", "Minium", " Hematite", "Red ocherous Clay", "All are correct", "All are correct");
        this.addQuestion(q20);
        Question q21 = new Question("CuCO3Cu(OH)2 is represented? ", "Minium", " Hematite", "Red ocherous Clay", "Malachite", "Malachite");
        this.addQuestion(q21);
        Question q22 = new Question("What is CGI stands for ", "Computer-generated imaginary", "Computer-generated informaton", "Computer-generated industry", "Computer-generated illusion", "Computer-generated imaginary");
        this.addQuestion(q22);
        Question q23 = new Question("Which software can use to simulated Wat-Umong tunnel ", "3ds max", "Microsoft Word", "Microsoft Excel", "Mozilla firefox", "3ds max");
        this.addQuestion(q23);
        // END
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest) {
//         SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());

        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));

                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    public int getProfilesCount() {
        String countQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(countQuery, null);
        int cnt = cursor.getCount();
        cursor.close();
        return cnt;
    }

}
