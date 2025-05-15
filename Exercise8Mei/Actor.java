public class Actor implements IDamageable, IAttack, IRecoverable, IHeal{
	private HP hp; 
	private String name; 
	private int damage; 
	private int defense; 
	
	public HP getHp() {
		return hp;
	}
	public void setHp(HP hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public Actor(String name, HP hp, int damage, int defense) {
		this.hp = hp;
		this.name = name;
		this.damage = damage; 
		this.defense = defense; 
	}
	
	@Override
	public int takeDamage (int damage, int defense) {
		int damageDealt = damage - this.getDefense(); 
		if(damageDealt < 0) damageDealt = 0; 
		this.getHp().setHp(this.getHp().getHp() - damageDealt); 
		return damageDealt; 
	}
	
	public void showHP() {
		System.out.println(this.getName() + " current HP is " + this.getHp().getHp()); 
	}
	
	@Override 
	public void attack (IDamageable idamageable) {
		System.out.println(this.getName() + " attacking " + ((Actor)idamageable).getName()); 
		int damageDealt = idamageable.takeDamage(this.getDamage(), 0); 
		System.out.println(((Actor)idamageable).getName() + " is taking damage for " + damageDealt + " points(s)"); 
	}
	
	@Override
	public void recover (int value) {
		
	}
	
	@Override 
	public void heal (int value) {
		
	}
	
}
