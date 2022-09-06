package questao01;

import java.util.ArrayList;

/**
 * Store details of club memberships.
 */
public class Club
{
    private ArrayList<Membership> members = new ArrayList();
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        this.members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members. 
     * A member is added if there is not a member with the same name.
     * @param member The member object to be added.
     * @return If there is success to insert a new member.
     */
    public boolean join(Membership member)
    {
        if(members.contains(member)){
            return false;
        }else{
            members.add(member);
            return true;
        }
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Retorna se existe um sócio com o nome recebido.
     * @param name Nome a ser consultado.
     * @return Se o sócio está no clube.
     */
    public boolean isMember(String name){
        return this.members.toString().contentEquals(name);
    }
    
    /**
     * Remove do clube sócio cujo nome foi passado como parâmetro.
     * Se não existir um sócio com o nome recebido, nenhuma mudança acontece.
     * @param memberName Nome do sócio a ser descadastrado.
     */
    public void exitClub(String memberName){
        if(this.isMember(memberName)){
            this.members.remove(new Membership(memberName, 1, 1900));
        }
    }
    
    /**
     * Retorna o sócio a mais tempo no clube. 
     * Se houver empate entre os que estão a mais tempo no clube, 
     * retorna qualquer um dos que estão a mais tempo.
     * @return Sócio que está a mais tempo no clube.
     */
    public Membership olderMembership(){
        int maior=0;
        int ponto= -1;
        for(Membership membro : this.members){
            if(membro.membershipMonths()> maior){
                maior = membro.membershipMonths();
                ponto = this.members.indexOf(membro);
            }
        }
        if(maior==0){
            return null;
        }else{
            return this.members.get(ponto);
        }
        
    }

    /**
     * Retorna os sócios que estao associados a partir de um determinado ano.
     * @param year ano da consulta.
     * @return Sócios desde o ano recebido.
     */
    public ArrayList<Membership> membersSince(int year){
        
        ArrayList<Membership> saida = new ArrayList();
        
        for(Membership temp : this.members){
            
            if(temp.getYear() >= year){
                
                saida.add(temp);
            
            }
        
        }
        
        return saida;
    }
    
    public void printMembers(){
        
        Membership[] temp = new Membership[members.size()];
        temp = members.toArray(temp);
        int indice = 0;
        for(Membership tem: temp){
            
            System.out.println("-------------------------------------------");
            System.out.println("Membro No " + indice);
            System.out.println("Socio: "    + tem.getName() 
                                            + " entrou no mes " 
                                            + tem.getMonth() 
                                            + " de " + tem.getYear());
            indice++; 
        }
        System.out.println("-----------------FIM DA LISTAGEM-----------\n");
    }
    
    
}
