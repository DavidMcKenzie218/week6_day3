public class WeaponFactory{

  public Weaponable getWeapon(String name){

    if (name.equalsIgnoreCase("Spork")){
      return new Spork();
    }

    if(name.equalsIgnoreCase("Meat Tenderisor")){
      return new MeatTenderiser();
    }

    if (name.equalsIgnoreCase("Stick with Rusty Nail")){
      return new StickWithRustyNail();
    }

    return null;

  }

}