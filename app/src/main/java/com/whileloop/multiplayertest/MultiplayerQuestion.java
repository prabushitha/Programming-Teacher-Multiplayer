package com.whileloop.multiplayertest;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

/**
 * Created by prabushitha on 5/7/17.
 */

public class MultiplayerQuestion {
    String title;
    String question;
    List<String> options;
    int answer; //1,2,3,4
    MultiplayerQuestion(String t, String q, int answer, String...a){
        this.title =  t;
        this.question = q;
        this.answer = answer;
        for(String x:a){
            options.add(x);
        }
    }
    MultiplayerQuestion(){

    }
    //[{"title":"adsadsad", "question":"dhasbhd dhasd asdsad", "options":["x","y","z","r"]}]
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }



}
