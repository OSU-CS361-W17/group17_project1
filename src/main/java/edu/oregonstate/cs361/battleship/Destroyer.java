package edu.oregonstate.cs361.battleship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destroyer {

@SerializedName("name")
@Expose
private String name;
@SerializedName("length")
@Expose
private Integer length;
@SerializedName("start")
@Expose
private Start___ start;
@SerializedName("end")
@Expose
private End___ end;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getLength() {
return length;
}

public void setLength(Integer length) {
this.length = length;
}

public Start___ getStart() {
return start;
}

public void setStart(Start___ start) {
this.start = start;
}

public End___ getEnd() {
return end;
}

public void setEnd(End___ end) {
this.end = end;
}

}
