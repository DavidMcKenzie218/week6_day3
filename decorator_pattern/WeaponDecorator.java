public abstract class WeaponDecorator implements Weaponable{

    protected Weaponable decoratedWeapon;

    public WeaponDecorator(Weaponable decoratedWeapon){
      this.decoratedWeapon = decoratedWeapon;
    }

    public String attack(){
      return decoratedWeapon.attack();
    }

}