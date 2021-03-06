
package com.cool.predictions.retrofit;

import com.cool.predictions.Game;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GameResponse {

    @SerializedName("data")
    @Expose
    private List<Game> data;

    public ArrayList<Game> getData(){
        return (ArrayList<Game>)this.data;
    }
}
