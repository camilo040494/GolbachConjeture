package aspectj;

public aspect Duracion {
	
	pointcut tiempo() : call(* goldbach.Main.resolver(..));
	
	void around() : tiempo(){
		System.out.println("[Aspecto duracion] inició");
		thisJoinPoint.toShortString();
		long ini = System.nanoTime();
		proceed();
		long time = System.nanoTime()-ini;
		System.out.println("[Aspecto duracion] duración fue: "+new Long(time).toString());
	}
		
	
}
