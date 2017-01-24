package edu.oregonstate.cs361.battleship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class End {

@SerializedName("Across")
@Expose
private Integer across;
@SerializedName("Down")
@Expose
private Integer down;

public Integer getAcross() {
return across;
}

public void setAcross(Integer across) {
this.across = across;
}

public Integer getDown() {
return down;
}

public void setDown(Integer down) {
this.down = down;
}

}
