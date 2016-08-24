public class RustyWeaponDecorator extends WeaponDecorator{

  public RustyWeaponDecorator(Weaponable decoratedWeapon){
    super(decoratedWeapon);
  }

  @Override
  public String attack(){
    return setWeaponRusty(decoratedWeapon);
  }

  private String setWeaponRusty(Weaponable decoratedWeapon){
      return decoratedWeapon.attack() + ", better check for malaria!";

  }

}