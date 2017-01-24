package edu.oregonstate.cs361.battleship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cruiser {

@SerializedName("name")
@Expose
private String name;
@SerializedName("length")
@Expose
private Integer length;
@SerializedName("start")
@Expose
private Start__ start;
@SerializedName("end")
@Expose
private End__ end;

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

public Start__ getStart() {
return start;
}

public void setStart(Start__ start) {
this.start = start;
}

public End__ getEnd() {
return end;
}

public void setEnd(End__ end) {
this.end = end;
}

}
