public class LineCollection{
  private ArrayList<Line> collection;
  
  public LineCollection(){
    collection = new ArrayList<Line>();
  }
  
  public void addLine(Line l){
    collection.add(l);
  }
  public void show(){
    for(int i = 0; i < collection.size(); i++){
      collection.get(i).show();
    }
  }
}
