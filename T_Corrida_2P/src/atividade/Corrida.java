package atividade;

public class Corrida {
	
	public static void main(String[] args) {
		
		Carros [] carro = new Carros[4];
		Carros [] moto = new Carros[4];
		
		preencherCarros(carro);
        preencherMotos(moto);

		for (int seg = 1; seg <= 20; seg++) {
            if (seg != 6 && seg != 11 && seg != 15) {
                for (Carros c : carro) {
                    c.velocidade = acelerar(c);
                }

                for (Carros m : moto) {
                    m.velocidade = acelerar(m);
                }
            } else {
                for (Carros c : carro) {
                    c.velocidade = frenagem(c.velocidade);
                }

                for (Carros m : moto) {
                    m.velocidade = frenagem(m.velocidade);
                }
            }
        }
		System.out.println("----------Lista dos carros----------");
		imprimir(carro);
		System.out.println("----------Lista das motos----------");
		imprimir(moto);
		
		
	}

	public static float frenagem (float velocidade) {
		
		velocidade-=(velocidade/4)*3;
		
		return velocidade;
	}
	
	 public static float acelerar(Carros carro) {
	        float velocidade = carro.velocidade;

	        velocidade += 5;
	        velocidade += velocidade * (0.15 * carro.cilindro) - peso(carro.peso);
	        
	        return velocidade;
	}
	
	public static int peso (int peso) {
		
		int i = 0;
		
		while(peso>=300) {
		peso-=300;	
		i++;
		}
		
		return i;
	}	
	
	public static void  imprimir(Carros[] vetCarros) {
		
        for (Carros carro : vetCarros) {
        	
        	System.out.println("Piloto: "+ carro.piloto);
        	System.out.println("Modelo: "+ carro.modelo);
        	System.out.println("Cilindrada: "+ carro.cilindro);
        	System.out.println("Peso:"+ carro.peso);
        	System.out.println("Velocidade Máxima:" +carro.velocidade);
        	System.out.println("....................................");
        }
	}
	
    public static void preencherCarros(Carros[] carros) {
        carros[0] = new Carros();
        carros[0].piloto = "Fernando";
        carros[0].modelo = "Esportivo";
        carros[0].cilindro = 2.6f;
        carros[0].peso = 1800;
        carros[0].velocidade= 0.0f;

        carros[1] = new Carros();
        carros[1].piloto = "Isabela";
        carros[1].modelo = "Cupê";
        carros[1].cilindro = 2.4f;
        carros[1].peso = 1600;
        carros[1].velocidade= 0.0f;
        
        carros[2] = new Carros();
        carros[2].piloto = "Lucas";
        carros[2].modelo = "SUV";
        carros[2].cilindro = 2.5f;
        carros[2].peso = 1700;
        carros[2].velocidade= 0.0f;

        carros[3] = new Carros();
        carros[3].piloto = "Alice";
        carros[3].modelo = "Hatchback";
        carros[3].cilindro = 2.2f;
        carros[3].peso = 1400;
        carros[3].velocidade= 0.0f;
    }

    public static void preencherMotos(Carros[] motos) {
        motos[0] = new Carros();
        motos[0].piloto = "Julia";
        motos[0].modelo = "Esportiva";
        motos[0].cilindro = 1.2f;
        motos[0].peso = 220;
        motos[0].velocidade= 0.0f;
        
        motos[1] = new Carros();
        motos[1].piloto = "Gabriel";
        motos[1].modelo = "Cruiser";
        motos[1].cilindro = 1.4f;
        motos[1].peso = 290;
        motos[1].velocidade= 0.0f;
        
        motos[2] = new Carros();
        motos[2].piloto = "Sophia";
        motos[2].modelo = "Naked";
        motos[2].cilindro = 1.0f;
        motos[2].peso = 180;
        motos[2].velocidade= 0.0f;
        

        motos[3] = new Carros();
        motos[3].piloto = "Lucas";
        motos[3].modelo = "Custom";
        motos[3].cilindro = 1.5f;
        motos[3].peso = 300;
        motos[3].velocidade= 0.0f;
    }
}
