public class Customer implements Fundable{

  private String name;
  private int funds;

  public Customer(String name, int funds){
    this.name = name;
    this.funds = funds;

  }

  public int getFunds(){
    return this.funds;
  }





}