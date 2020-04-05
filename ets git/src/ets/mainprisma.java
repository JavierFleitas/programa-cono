package ets;

import java.util.Scanner;

/**
 * clase mainprisma
 * Esta clase consiste en que te pide los lados de un prisma y te tiene que decir el area total
 * @author javie
 *
 */

public class mainprisma {

	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int areaBase,areaLateral,v=0;
		
		claseprisma clase=new claseprisma(0, 0);

		
		while(v==0) {
		
		System.out.println("Introduce la base del triangulo");
		int btria=teclado.nextInt();
		clase.setBasePrisma(btria);
		
		System.out.println("Introduce la altura del prisma");
		int altPrisma=teclado.nextInt();
		clase.setBaseTriangulo(altPrisma);
		
		System.out.println("Introduce la altura del triangulo");
		int alttri=teclado.nextInt();
		
		System.out.println("Introduce cuanto vale la cara del triangulo");
		int caratri=teclado.nextInt();
		
		
	
		areaBase=btria*alttri/2;
		
		areaLateral=altPrisma*caratri;
		
		int areaPiso=btria*altPrisma;
		
		int areaTotal=areaPiso+areaLateral+areaLateral+areaBase+areaBase;
		
		
		System.out.println();
		
		
		System.out.println("Creado el objeto Prisma con:");
		System.out.println("Base: "+clase.getBaseTriangulo());
		System.out.println("Altura: "+clase.getBasePrisma());
		System.out.println("El area total es: "+areaTotal);
		
		
		
		System.out.println("Si quieres introducir otro Prisma pon 0");
		v=teclado.nextInt();
		
		
		}
		
		
		
		
		
		
	}
	
	
}
