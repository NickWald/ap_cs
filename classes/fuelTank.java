//part a:
public int nextTankToFill(int threshold){
  int curLow = 0;
  for(int i = 0; i < tanks.size(); i++){
    if(tanks.get(i).getFuelLevel() < tanks.get(curLow).getFuelLevel()){
      curLow = i;
    }
  }
  if(tanks.get(curLow).getFuelLevel() <= threshold){
    return curLow;
  }
  else return filler.getCurrentIndex();
}
