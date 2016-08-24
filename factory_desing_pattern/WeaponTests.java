import static org.junit.Assert.*;
import org.junit.*;

public class WeaponTests{

  StickWithRustyNail stickWithRustyNail;
  MeatTenderiser meatTenderiser;
  Spork spork;
  WeaponFactory sliceNDice;

  @Before
  public void before(){
    stickWithRustyNail = new StickWithRustyNail();
    meatTenderiser = new MeatTenderiser();
    spork = new Spork();
    sliceNDice = new WeaponFactory();
  }

  @Test
  public void sporkCanAttack(){
    assertEquals("Stab, scoop", spork.attack());
  }

  @Test
  public void stickCanAttack(){
    assertEquals("Schwack, stab", stickWithRustyNail.attack());
  }

  @Test
  public void tenderiserCanAttack(){
    assertEquals("Thunk", meatTenderiser.attack());
  }

  @Test
  public void weaponFactoryCanMake__Spork(){
    assertEquals("Stab, scoop", sliceNDice.getWeapon("Spork").attack());
  }

  @Test
  public void weaponFactoryCanMake__Stick(){
    assertEquals("Schwack, stab", sliceNDice.getWeapon("Stick with Rusty Nail").attack());
  }

  @Test
  public void weaponFactoryCanMake__MeatTenderisor(){
    assertEquals("Thunk", sliceNDice.getWeapon("Meat Tenderisor").attack());
  }

}