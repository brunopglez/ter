package ej05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno a1=new Alumno();
		
		a1.setNombre("Alberto");
		a1.setApellidos("Pérez Escobar");
		a1.setNMat("23432");
		a1.setEmail("ape@gmail.com");
		a1.setDomicilio("calle Princesa,22 Madrid");
		a1.setTlfno(654122345);
		a1.setCurso("1º DAM");
		System.out.println(a1);
		
		
		
        Alumno a2=new Alumno();
		
		a2.setNombre("María");
		a2.setApellidos("Gil Gil");
		a2.setNMat("67895");
		a2.setEmail("mgg@yahoo.es");
		a2.setDomicilio("c/Luna, 3 Madrid");
		a2.setTlfno(654789876);
		a2.setCurso("1º DAM");
		System.out.println(a2);
		
		
		
        Alumno a3=new Alumno();
        
        
		//1º link.
		
        a3=a2;
	    
		a3.domicilio="avda de las Termópilas, 12 Madrid";
		
		System.out.println(a3);
		
		
		//2º link.
		
		a2=a3;
		
		System.out.println(a2);
		
		//Metodo toString.
		
		
		
	}

}
