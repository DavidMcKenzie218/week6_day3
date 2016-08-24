import static org.junit.Assert.*;
import org.junit.*;

public class WeaponTests{

  StickWithRustyNail stickWithRustyNail;
  MeatTenderiser meatTenderiser;
  Spork spork;
  RustyWeaponDecorator weaponDecorator;

  @Before
  public void before(){
    stickWithRustyNail = new StickWithRustyNail();
    meatTenderiser = new MeatTenderiser();
    spork = new Spork();
    weaponDecorator = new RustyWeaponDecorator(spork);
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
  public void checkIfWeaponIsDecorated__Spork(){
    assertEquals("Stab, scoop, better check for malaria!", weaponDecorator.attack());
  }


}