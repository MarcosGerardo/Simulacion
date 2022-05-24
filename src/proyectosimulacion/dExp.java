/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimulacion;

/**
 *
 * @author Marcos Mata
 */
public class dExp {
    public float Exp(float lambda){
		return (float)(-Math.log(Math.random())/lambda);
	}
    
    public float Erlang(int k, float beta){
		float productoria = 0;
		for(int i = 0;i < k;i++){
			productoria = (float) (productoria * Math.random());
		}
		float E = (float) (-Math.log(productoria)/beta);
		return E;
	}
    
}
