import java.util.Date;
import java.sql.Timestamp;
import game.java;

class Player {
  private string snapID;
  private string username;
  private int elo;
  private birthtime;

  void main (string ID, string user, int e, Timestamp t){
    snapID = ID;
    username = user;
    elo = e;
    birthtime = t;
  }

  string getsnapID(){
    return snapID;
  }

  string getusername(){
    return username;
  }

  string getelo(){
    return elo;
  }

  Timestamp getbirthtime(){
    return birthtime;
  }

  void reRank(Game g){

  }

}
