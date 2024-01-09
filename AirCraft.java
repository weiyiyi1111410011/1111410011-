package StarWar_1111410011;

public class AirCraft {
 private String Model;//型號
 private double Length;//長度
 private double AirSpeed;//大氣中飛行速度
 private double SpaceSpeed;//宇宙空間加速度
 private String StdandardEngine;//標準引擎資料
 private String[] Weapon;//武器裝備名
 private double Weapon_power;//武器裝備能量
 private int Passenger;//乘坐人員
 private String[] Shield;//防護罩
 
 public String getModel()
 {
	 return Model;
 }
 public void setModel(String Model) {
	 this.Model=Model;
 }
 public double getLength()
 {
	 return Length;
 }
 public void setLength(double Length) {
	 this.Length=Length;
 }
 public double getAirSpeed()
 {
	 return AirSpeed;
 }
 public void setAirSpeed(double AirSpeed) {
	 this.AirSpeed=AirSpeed;
 }
 public double getSpaceSpeed()
 {
	 return SpaceSpeed;
 }
 public void setSpaceSpeed(double SpaceSpeed) {
	 this.SpaceSpeed=SpaceSpeed;
 }
 public String getStdandardEngine()
 {
	 return StdandardEngine;
 }
 public void setStdandardEngine(String StdandardEngine) {
	 this.StdandardEngine=StdandardEngine;
 }
 public String[] getWeapon()
 {
	 return Weapon;
 }
 public void setSWeapon(String[] Weapon) {
	 this.Weapon=Weapon;
 }
 public double getWeapon_power()
 {
	 return Weapon_power;
 }
 public void setWeapon_power(double Weapon_power) {
	 this.Weapon_power=Weapon_power;
 }
 public int getPassenger()
 {
	 return Passenger;
 }
 public void setPassenger(int Passenger) {
	 this.Passenger=Passenger;
 }
 public String[] getShield()
 {
	 return Shield;
 }
 public void setShield(String[] Shield) {
	 this.Shield=Shield;
 }
}
