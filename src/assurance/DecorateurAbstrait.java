package assurance;

public abstract class DecorateurAbstrait implements Assurance_voiture{
protected Assurance_voiture  assurance_voiture ;
public DecorateurAbstrait(Assurance_voiture  assurance_voiture) {
 this.assurance_voiture=assurance_voiture;
 
 }
}
