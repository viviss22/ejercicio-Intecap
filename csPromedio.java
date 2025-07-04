
package laboratorio2;


public class csPromedio {
    public float nota1, nota2, nota3,nota4;
    
    public csPromedio(float n1,float n2,float n3, float n4){
        this.notas1 = n1;
        this.notas2 = n2;
        this.notas3 = n3;
        this.notas5 = n4;        
    }
    
    public boolean calcularAprobado(){
        float promedio = 0;
        boolean vf;
        promedio = (notas1 + notas2 + notas3 +notas4)/4;
        if (promedio > 61){
            vf= true;
        }else{
            vf = false;
        }        
        return vf;
    }
    
}
