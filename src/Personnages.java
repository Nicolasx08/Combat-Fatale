/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public abstract class Personnages {
    private int hp=0;
    private int Def=0;
    private String nom="a";

    public abstract void attaque(Personnages personnages);
    public abstract void esquive(Personnages personnages);

    public int getHp() {return hp;}
    public int getDef() {return Def;}
    public String getNom() {return nom;}

    public void setHp(int hp) {this.hp = hp;}
    public void setDef(int def) {Def = def;}
    public void setNom(String nom) {this.nom = nom;}
}
