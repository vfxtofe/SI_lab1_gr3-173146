static class Item {
	int id;
	String name;
	double price;
	public int A = 18;
	public int B = 5;
	public int V = 0;

	public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
  }

  public int getID(){
      return id;
  }

  public String getName(){
      return name;
  }

  public double getPrice(){
      return price;
  }

  public void setID(int id){
      this.id = id;
  }

  public void setName(String name){
      this.name = name;
  }

  public void setPrice(double price){
      this.price = price;
  }

	double taxReturn () {
		return (price * 15)/100;
	}
}
