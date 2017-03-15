import java.util.ArrayList;
import java.util.List;

public class PingPong {

  public List<Object> runPingPong(int countUpTo){
    List<Object> tempArrayList = new ArrayList<Object>();
    for(int i=1; i <= countUpTo; i++) {
      if(i % 3 == 0 && i % 5 == 0) {
        tempArrayList.add("pingpong");
      } else if(i % 3 == 0) {
        tempArrayList.add("ping");
      } else if (i % 5 == 0) {
        tempArrayList.add("pong");
      } else {
        tempArrayList.add(i);
      }
    }
    return tempArrayList;
  }
}
