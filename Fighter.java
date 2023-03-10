public class Fighter {
    
    String name;
    int health;
    int weight;
    int damage;
    double dodge;

    public Fighter(String name, int health, int weight, int damage, double dodge){

        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.dodge = dodge;
    }

    public int hit(Fighter foe){
        
        System.out.println("----------------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " did that much damage.");

        if(foe.dodge()){
            System.out.println(foe.name + " dodge incoming damage.");
            return foe.health;
        }

        if(foe.health - this.damage < 0){
            return 0;
        }
            
        return foe.health - this.damage;
    }

    public boolean dodge(){
            double randomValue = Math.random() * 100; // 0.0 to 99.9
            return randomValue <= this.dodge;
    }
}
