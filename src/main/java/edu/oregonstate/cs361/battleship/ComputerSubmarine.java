package edu.oregonstate.cs361.battleship;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ComputerSubmarine {

@SerializedName("name")
@Expose
private String name;
@SerializedName("length")
@Expose
private Integer length;
@SerializedName("start")
@Expose
private Start_________ start;
@SerializedName("end")
@Expose
private End_________ end;

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

public Start_________ getStart() {
return start;
}

public void setStart(Start_________ start) {
this.start = start;
}

public End_________ getEnd() {
return end;
}

public void setEnd(End_________ end) {
this.end = end;
}

}
