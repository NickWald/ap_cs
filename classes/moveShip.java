public void moveShip(String name, double deltaX, double deltaY) {
  for(int i = 0; i < armada.length; i++){
    if(armada[i].getName().equals(name)){
      armada[i].getCoordinates().move(double x, double y);
    }
  }
}
