package edu.oregonstate.cs361.battleship;

public class Battleship {

@SerializedName("name")
@Expose
private String name;
@SerializedName("length")
@Expose
private Integer length;
@SerializedName("start")
@Expose
private Start_ start;
@SerializedName("end")
@Expose
private End_ end;

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

public Start_ getStart() {
return start;
}

public void setStart(Start_ start) {
this.start = start;
}

public End_ getEnd() {
return end;
}

public void setEnd(End_ end) {
this.end = end;
}

}
